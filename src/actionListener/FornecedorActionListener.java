package actionListener;

import banco.FornecedorDAO;
import banco.PapelDAO;
import exception.Exceptions;
import gets_sets.Fornecedor;
import janelas.FrameFornecedor;
import janelas.FramePapel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class FornecedorActionListener implements ActionListener {

    private final FrameFornecedor ffornecedor;
    private final FramePapel fpapel = new FramePapel();
    private Fornecedor f;
    private final Log logs = new Log();
    FornecedorDAO fornDAO = new FornecedorDAO();
    PapelDAO papelDAO = new PapelDAO();
    int cont = 0;

    public FornecedorActionListener(FrameFornecedor fornecedor) {
        this.ffornecedor = fornecedor;

    }

    public void actionPerformed(ActionEvent e) {

        if (e.getActionCommand().equals("Salvar")) {

            try {
                f = ffornecedor.getFornecedor();
            } catch (Exceptions ex) {
                logs.exceptionLog(ex);
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
                            cont = 0;
                            return;
                        } else {
                            ffornecedor.LimparFornecedor();
                            ffornecedor.dispose();
                            return;

                        }
                    }
                    if (cont == 1) {
                        cont = 0;
                        JOptionPane.showMessageDialog(null, "Fornecedor cadastrado com sucesso");
                        fornDAO.update(f);
                        Vector itens = papelDAO.carregaComboBox();
                    

                    }

                } else {
                    try {
                        logs.escreverLog("Salvou o cadastro de Fornecedores!");
                    } catch (IOException ex) {
                        logs.exceptionLog(ex);
                        Logger.getLogger(FornecedorActionListener.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    JOptionPane.showMessageDialog(null, "Fornecedor cadastrado com sucesso");
                    fornDAO.insert(f);
                 

                }
            } catch (Exceptions ex) {
                Logger.getLogger(FrameFornecedor.class.getName()).log(Level.SEVERE, null, ex);
                logs.exceptionLog(ex);
            }

            String msg = "Cadastrou um fornecedor!";

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
                logs.escreverLog("Excluiu o cadastro de Funcionário!");
            } catch (IOException ex) {
                logs.exceptionLog(ex);
            }

            if (cont == 1) {
                cont = 0;
                try {
                    fornDAO.delete(f);
                    JOptionPane.showMessageDialog(null, "Excluido com sucesso do banco de dados!");
                } catch (Exceptions ex) {
                    Logger.getLogger(FornecedorActionListener.class.getName()).log(Level.SEVERE, null, ex);
                    logs.exceptionLog(ex);
                }

            } else {
                JOptionPane.showMessageDialog(null, "Fornecedor não cadastrado no banco de dados!");
            }

        }

    }
}
