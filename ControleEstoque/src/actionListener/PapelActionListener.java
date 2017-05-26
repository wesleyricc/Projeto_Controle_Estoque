
package actionListener;

import exception.Exceptions;
import gets_sets.Papel;
import janelas.FramePapel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.JOptionPane;




public class PapelActionListener implements ActionListener {

    private FramePapel fpapel;
    Log logs = new Log();
    
    public PapelActionListener(FramePapel papel) {
        
        this.fpapel = papel;
              
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       
        
        if(e.getActionCommand().equals("Salvar")){
            
            
            try {
                Papel papel = fpapel.getPapel();
                System.out.println(papel.toString());
            } catch (Exceptions ex){
                logs.exceptionLog(ex); 
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
            
            try {
                logs.escreverLog("Salvou o cadastro de Papel!");
                } catch (IOException ex) {
                    logs.exceptionLog(ex); 
                }

        }
        
        
        if(e.getActionCommand().equals("Limpar")){
         
            fpapel.LimparPapel();
            
            try {
                logs.escreverLog("Limpou o cadastro de Papel!");
                } catch (IOException ex) {
                    logs.exceptionLog(ex); 
                }
        }
            
        if(e.getActionCommand().equals("Cancelar")){
         
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
