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
    private Papel p;
    private FrameTabelaEstoque ftabela = new FrameTabelaEstoque();
    Log logs = new Log();
    PapelDAO papelDAO = new PapelDAO();

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

            try {
                logs.escreverLog("Salvou o cadastro de Papel!");
            } catch (IOException ex) {
                logs.exceptionLog(ex);
            }

            try {
                papelDAO.insert(p);
                ftabela.attTabela();
            } catch (Exceptions ex) {
                Logger.getLogger(PapelActionListener.class.getName()).log(Level.SEVERE, null, ex);
            }

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

    }
}
