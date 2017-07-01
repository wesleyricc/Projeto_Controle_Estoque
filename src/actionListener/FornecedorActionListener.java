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

                    int n = JOptionPane.showConfirmDialog(null, "CNPJ já cadastrado. Deseja atualiza-lo?");

                    if (n == 0) {

                        fornDAO.update(f);

                        return;
                    }
                    if(n == 1){
                        return;
                    }else{
                        ffornecedor.LimparFornecedor();
                        ffornecedor.dispose();
                        
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
                fornDAO.insert(f);
            } catch (Exceptions ex) {
                Logger.getLogger(FornecedorActionListener.class.getName()).log(Level.SEVERE, null, ex);
            }

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

    }
}
