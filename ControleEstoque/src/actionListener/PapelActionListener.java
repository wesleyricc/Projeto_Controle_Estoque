
package actionListener;

import gets_sets.Papel;
import janelas.FramePapel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;




public class PapelActionListener implements ActionListener {

    private FramePapel fpapel;
    
    public PapelActionListener(FramePapel papel) {
        
        this.fpapel = papel;
              
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       
        
        if(e.getActionCommand().equals("Salvar")){
            
            Papel papel = fpapel.getPapel();
            System.out.println(papel.toString());

        }
        
        
        if(e.getActionCommand().equals("Excluir")){
         
            fpapel.LimparPapel();
        }
            
        if(e.getActionCommand().equals("Cancelar")){
         
            fpapel.LimparPapel();
            fpapel.dispose();   
        }
        
    }
    
}
