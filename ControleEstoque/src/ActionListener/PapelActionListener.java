
package ActionListener;

import Gets_Sets.Papel;
import Janelas.FramePapel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;




public class PapelActionListener implements ActionListener {

    FramePapel Fpapel;
    
    public PapelActionListener(FramePapel papel) {
        
        this.Fpapel = papel;
              
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       
        
        if(e.getActionCommand().equals("Salvar")){
            
            Papel papel = Fpapel.getPapel();
            System.out.println(papel.toString());
            
            Fpapel.LimparPapel();
         
            
        }
        
        
        if(e.getActionCommand().equals("Excluir")){
         
            Fpapel.LimparPapel();
        }
            
        if(e.getActionCommand().equals("Cancelar")){
         
            Fpapel.LimparPapel();
            Fpapel.dispose();   
        }
        
    }
    
}
