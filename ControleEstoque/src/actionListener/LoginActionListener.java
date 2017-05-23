package actionListener;

import gets_sets.Login;
import janelas.FrameLogin;
import janelas.FramePrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class LoginActionListener implements ActionListener {

    private FrameLogin flogin;
    private Log logs = new Log();

    public LoginActionListener(FrameLogin login) {
        this.flogin = login;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        FramePrincipal principal = new FramePrincipal();

        if (e.getActionCommand().equals("Entrar")) {
            Login l = flogin.getLogin();
            if (l.getSenhaLogin().equals("admin") && !l.getUsuarioLogin().trim().isEmpty()) {
                principal.setVisible(true);
                flogin.dispose();
                
                principal.setUser(l.getUsuarioLogin());
                
                String msg = "Entrou no sistema!";

                try {
                    logs.escreverUsuario(l.getUsuarioLogin());

                } catch (IOException ex) {
                    Logger.getLogger(LoginActionListener.class.getName()).log(Level.SEVERE, null, ex);
                }

                try {
                    logs.escreverLog(l.getUsuarioLogin(), msg);

                } catch (IOException ex) {

                }

            } else {
                JOptionPane.showMessageDialog(flogin, "Senha ou Usuário incorreto!");

            }

        }

        if (e.getActionCommand().equals("Cancelar")) {
            System.exit(0);
        }

    }

}
