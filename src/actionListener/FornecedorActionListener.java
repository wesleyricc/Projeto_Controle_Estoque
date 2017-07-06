package actionListener;

import banco.FornecedorDAO;
import exception.Exceptions;
import gets_sets.Fornecedor;
import janelas.FrameFornecedor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class FornecedorActionListener implements ActionListener {

    private final FrameFornecedor ffornecedor;
    private Fornecedor f;
    private final Log logs = new Log();
    FornecedorDAO fornDAO = new FornecedorDAO();
    int cont = 0;

    public FornecedorActionListener(FrameFornecedor fornecedor) {
        this.ffornecedor = fornecedor;
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getActionCommand().equals("Salvar")) {

            try {
                f = ffornecedor.getFornecedor();
            } catch (Exceptions ex) {
                Logger.getLogger(FornecedorActionListener.class.getName()).log(Level.SEVERE, null, ex);
            }

            String CNPJ = f.getTextoCNPJFornecedor();

            try {
                if (CNPJ.equals(fornDAO.verificaCNPJ(CNPJ))) {

                    if (cont == 0) {
                        cont = 1;
                        int n = JOptionPane.showConfirmDialog(null, "CNPJ já cadastrado. Deseja editar?");
                        if (n == 0) {

                            Fornecedor f = fornDAO.getFornecedor(CNPJ);

                            ffornecedor.editarFornecedor(f);

                            ffornecedor.setVisible(true);
                            return;
                        }
                        if (n == 1) {
                            return;
                        } else {
                            ffornecedor.LimparFornecedor();
                            ffornecedor.dispose();
                            return;

                        }
                    }
                    if (cont == 1) {
                        cont = 0;
                        fornDAO.update(f);
                    }

                }
            } catch (Exceptions ex) {
                Logger.getLogger(FrameFornecedor.class.getName()).log(Level.SEVERE, null, ex);
            }

            String msg = "Cadastrou um fornecedor!";

            try {
                logs.escreverLog("Salvou o cadastro de Fornecedores!");
            } catch (IOException ex) {
                logs.exceptionLog(ex);
            }

            try {
                logs.escreverLog("Inseriu Fornecedor no banco!");
                } catch (IOException ex) {
                    logs.exceptionLog(ex); 
                }
            
            try {
                fornDAO.insert(f);
            } catch (Exceptions ex) {
                Logger.getLogger(FornecedorActionListener.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
            JOptionPane.showMessageDialog(ffornecedor, "Cadastro salvo com sucesso!");

        }

        if (e.getActionCommand().equals("Limpar")) {
            ffornecedor.LimparFornecedor();

            try {
                logs.escreverLog("Limpou o cadastro de Fornecedores!");
            } catch (IOException ex) {
                logs.exceptionLog(ex);
            }
        }

        if (e.getActionCommand().equals("Cancelar")) {

            try {
                logs.escreverLog("Cancelou o cadastro de Fornecedores!");
            } catch (IOException ex) {
                logs.exceptionLog(ex);
            }

            ffornecedor.LimparFornecedor();
            ffornecedor.dispose();
        }
        
        if (e.getActionCommand().equals("Excluir")) {

            try {
                logs.escreverLog("Excluiu o cadastro de Fornecedores!");
                } catch (IOException ex) {
                    logs.exceptionLog(ex); 
                }
            
            if(cont == 1){
                cont = 0;
                try {
                    fornDAO.delete(f);
                    JOptionPane.showMessageDialog(null, "Excluido com sucesso do banco de dados!");
                } catch (Exceptions ex) {
                    Logger.getLogger(FornecedorActionListener.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }else{
                JOptionPane.showMessageDialog(null, "Fornecedor não cadastrado no banco de dados!");
            }
               
            ffornecedor.LimparFornecedor();
        }
        
        

    }
}
