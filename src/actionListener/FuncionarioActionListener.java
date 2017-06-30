
package actionListener;

import banco.FuncionarioDAO;
import exception.Exceptions;
import gets_sets.Funcionario;
import janelas.FrameFuncionario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;



public class FuncionarioActionListener implements ActionListener {

    private FrameFuncionario ffuncionario;
    private Funcionario f;
    Log logs = new Log();
    FuncionarioDAO funcDAO = new FuncionarioDAO();
    
    
    public FuncionarioActionListener(FrameFuncionario funcionario){
        this.ffuncionario = funcionario;
    }
    
    public void actionPerformed(ActionEvent e) {
        
        
        if (e.getActionCommand().equals("Salvar")) {

            try {
                f = ffuncionario.getFuncionario();  
            } catch (Exceptions ex){       
                logs.exceptionLog(ex); 
                JOptionPane.showMessageDialog(null, ex.getMessage());
            
               
            }
                try {   
                    logs.escreverLog("Salvou o cadastro de Funcionários!"); 
                } catch (IOException ex) {
                    logs.exceptionLog(ex); 
                }
                
            try {
                funcDAO.insert(f);
            } catch (Exceptions ex) {
                Logger.getLogger(FuncionarioActionListener.class.getName()).log(Level.SEVERE, null, ex);
            }
                
        }
        
        if(e.getActionCommand().equals("Limpar")){
            ffuncionario.LimparFuncionario();
            
            try {
                logs.escreverLog("Limpou o cadastro de Funcionários!");
                } catch (IOException ex) {
                    logs.exceptionLog(ex); 
                }
            
        }

        if (e.getActionCommand().equals("Cancelar")) {

            try {
                logs.escreverLog("Cancelou o cadastro de Funcionários!");
                } catch (IOException ex) {
                    logs.exceptionLog(ex); 
                }
            
            ffuncionario.LimparFuncionario();
            ffuncionario.dispose();
        }
          
    }   
}
