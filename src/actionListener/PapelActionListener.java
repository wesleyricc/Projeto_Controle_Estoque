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
import static org.hsqldb.HsqlDateTime.e;

public class PapelActionListener implements ActionListener {

    private FramePapel fpapel;
    private Papel pap;
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
                pap = fpapel.getPapel();
            } catch (Exceptions ex) {
                logs.exceptionLog(ex);
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
                String codigo = pap.getTextoCodpapel();
            try {
                if (codigo.equals(papelDAO.verificaCodigo(codigo))) {

                    if (cont == 0) {
                        cont = 1;
                        int n = JOptionPane.showConfirmDialog(null, "Código já cadastrado. Deseja editar?");
                        if (n == 0) {

                            Papel pap = papelDAO.getPapel(codigo);

                            fpapel.editarPapel(pap);

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
                        papelDAO.update(pap);
                    }

                }
            } catch (Exceptions ex) {
                Logger.getLogger(FramePapel.class.getName()).log(Level.SEVERE, null, ex);
            }

            String msg = "Cadastrou um papel!";

            try {
                logs.escreverLog("Salvou o cadastro de Papel!");
            } catch (IOException ex) {
                logs.exceptionLog(ex);
            }

            try {
                logs.escreverLog("Inseriu Papel no banco!");
                } catch (IOException ex) {
                    logs.exceptionLog(ex); 
                }
            
            try {
                papelDAO.insert(pap);
            } catch (Exceptions ex) {
                Logger.getLogger(PapelActionListener.class.getName()).log(Level.SEVERE, null, ex);
            }

            JOptionPane.showMessageDialog(fpapel, "Cadastro salvo com sucesso!");
            
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
                    papelDAO.delete(pap);
                    JOptionPane.showMessageDialog(null, "Excluido com sucesso do banco de dados!");
                } catch (Exceptions ex) {
                    Logger.getLogger(PapelActionListener.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }else{
                JOptionPane.showMessageDialog(null, "Papel não cadastrado no banco de dados!");
            }
               
            fpapel.LimparPapel();
        }
        
        
    }
}
