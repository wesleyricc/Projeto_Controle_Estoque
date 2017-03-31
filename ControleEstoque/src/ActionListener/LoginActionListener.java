
package ActionListener;

import Gets_Sets.Login;
import Janelas.FrameLogin;
import Janelas.FramePrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class LoginActionListener implements ActionListener {

    FrameLogin Flogin;
    public LoginActionListener(FrameLogin login) {
        this.Flogin = login;
    }

    public void actionPerformed(ActionEvent e) {
            
            
            FramePrincipal principal = new FramePrincipal();
        
        if(e.getActionCommand().equals("Entrar")){
            Login l = Flogin.getLogin();
            if(l.getSenhaLogin().equals("admin") && l.getUsuarioLogin().equals("admin")){
              principal.setVisible(true); 
              Flogin.dispose();
            }
            else{
                JOptionPane.showMessageDialog(Flogin, "Senha ou usuário incorretos!");

            }
            
        }
        if(e.getActionCommand().equals("Cancelar")){
            System.exit(0);
        }
        
        
        
    }

   
    
}
