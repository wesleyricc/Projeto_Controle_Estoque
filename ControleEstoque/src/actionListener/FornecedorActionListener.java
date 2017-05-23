package actionListener;

import Exception.Exceptions;
import gets_sets.Fornecedor;
import janelas.FrameFornecedor;
import janelas.FrameLogin;
import janelas.FramePapel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class FornecedorActionListener implements ActionListener {

    private FrameFornecedor ffornecedor;
    private Log logs = new Log();
    private Fornecedor fforn = new Fornecedor();

    public FornecedorActionListener(FrameFornecedor fornecedor) {
        this.ffornecedor = fornecedor;
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getActionCommand().equals("Salvar")) {

            Fornecedor f;
            try {
                f = ffornecedor.getFornecedor();
                System.out.println(f.toString());
            } catch (Exceptions ex) {
                logs.exceptionLog(ex); 
                JOptionPane.showMessageDialog(null, ex.getMessage());
                //ex.printStackTrace();
            }
              
                
            String msg = "Cadastrou um fornecedor!";

            try {
                logs.escreverLog("Salvou o cadastro de Fornecedores!");
            } catch (IOException ex) {
            }
        }

        if (e.getActionCommand().equals("Limpar")) {
            ffornecedor.LimparFornecedor();

            try {
                logs.escreverLog("Limpou o cadastro de Fornecedores!");
            } catch (IOException ex) {
            }
        }

        if (e.getActionCommand().equals("Cancelar")) {

            try {
                logs.escreverLog("Cancelou o cadastro de Fornecedores!");
            } catch (IOException ex) {
            }

            ffornecedor.LimparFornecedor();
            ffornecedor.dispose();
        }

    }
}
