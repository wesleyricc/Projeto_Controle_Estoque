package actionListener;

import banco.PapelDAO;
import exception.Exceptions;
import gets_sets.Papel;
import janelas.FramePapel;
import janelas.FrameTabelaEstoque;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class PapelActionListener implements ActionListener {

    private FramePapel fpapel;
    private Papel p;
    private FrameTabelaEstoque ftabela = new FrameTabelaEstoque();
    private final Log logs = new Log();
    PapelDAO papelDAO = new PapelDAO();
    int cont = 0;

    public PapelActionListener(FramePapel papel) {

        this.fpapel = papel;

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getActionCommand().equals("Salvar")) {

            try {
                p = fpapel.getPapel();
            } catch (Exceptions ex) {
                logs.exceptionLog(ex);
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
                String codigo = p.getTextoCodpapel();
            try {
                if (codigo.equals(papelDAO.verificaCodigo(codigo))) {

                    if (cont == 0) {
                        cont = 1;
                        int n = JOptionPane.showConfirmDialog(null, "Código já cadastrado. Deseja editar?");
                        if (n == 0) {

                            Papel p = papelDAO.getPapel(codigo);

                            fpapel.editarPapel(p);

                            fpapel.setVisible(true);
                            return;
                        }
                        if (n == 1) {
                            return;
                        } else {
                            fpapel.LimparPapel();
                            fpapel.dispose();
                            return;

                        }
                    }
                    if (cont == 1) {
                        cont = 0;
                        JOptionPane.showMessageDialog(null, "Papel cadastrado com sucesso");
                        papelDAO.update(p);
                    }

                }
                else{
                    try {
                        logs.escreverLog("Salvou o cadastro de Papel!");
                    } catch (IOException ex) {
                        logs.exceptionLog(ex);
                        Logger.getLogger(FornecedorActionListener.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    JOptionPane.showMessageDialog(null, "Papel cadastrado com sucesso");
                    papelDAO.insert(p);
                    
                }
                
            } catch (Exceptions ex) {
                Logger.getLogger(FramePapel.class.getName()).log(Level.SEVERE, null, ex);
                logs.exceptionLog(ex);
            }

            String msg = "Cadastrou um papel!";
        }


        if (e.getActionCommand().equals("Limpar")) {

            fpapel.LimparPapel();

            try {
                logs.escreverLog("Limpou o cadastro de Papel!");
            } catch (IOException ex) {
                logs.exceptionLog(ex);
            }
        }

        if (e.getActionCommand().equals("Cancelar")) {

            fpapel.LimparPapel();
            fpapel.dispose();

            try {
                logs.escreverLog("Cancelou o cadastro de Papel!");
            } catch (IOException ex) {
                logs.exceptionLog(ex);
            }
        }

        if (e.getActionCommand().equals("Excluir")) {

            try {
                logs.escreverLog("Excluiu o cadastro de Papel!");
                } catch (IOException ex) {
                    logs.exceptionLog(ex); 
                }
            
            if(cont == 1){
                cont = 0;
                try {
                    papelDAO.delete(p);
                    JOptionPane.showMessageDialog(null, "Excluido com sucesso do banco de dados!");
                } catch (Exceptions ex) {
                    Logger.getLogger(PapelActionListener.class.getName()).log(Level.SEVERE, null, ex);
                    logs.exceptionLog(ex);
                }
                
            }else{
                JOptionPane.showMessageDialog(null, "Papel não cadastrado no banco de dados!");
            }
               
            fpapel.LimparPapel();
        }
        
        
    }
}
