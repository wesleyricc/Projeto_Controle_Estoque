
package actionListener;

import gets_sets.Login;
import janelas.FrameLogin;
import janelas.FramePrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class LoginActionListener implements ActionListener {

    private FrameLogin flogin;
    
    public LoginActionListener(FrameLogin login) {
        this.flogin = login;
    }

    public void actionPerformed(ActionEvent e) {
            
            
            FramePrincipal principal = new FramePrincipal();
        
        if(e.getActionCommand().equals("Entrar")){
            Login l = flogin.getLogin();
            if(l.getSenhaLogin().equals("admin") && l.getUsuarioLogin().equals("admin")){
              principal.setVisible(true); 
              flogin.dispose();
            }
            else{
                JOptionPane.showMessageDialog(flogin, "Senha ou usuário incorreto!");

            }
            
        }
        if(e.getActionCommand().equals("Cancelar")){
            System.exit(0);
        }
        
        
        
    }

   
    
}
