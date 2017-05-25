
package actionListener;

import Exception.Exceptions;
import gets_sets.Funcionario;
import janelas.FrameFuncionario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.JOptionPane;



public class FuncionarioActionListener implements ActionListener {

    private FrameFuncionario ffuncionario;
    Log logs = new Log();
    
    public FuncionarioActionListener(FrameFuncionario funcionario){
        this.ffuncionario = funcionario;
    }
    
    public void actionPerformed(ActionEvent e) {
        
        
        if (e.getActionCommand().equals("Salvar")) {

            try {
                Funcionario f = ffuncionario.getFuncionario();
                System.out.println(f.toString());     
            } catch (Exceptions ex){       
                logs.exceptionLog(ex); 
                JOptionPane.showMessageDialog(null, ex.getMessage());
            
               
            }
                try {   
                    logs.escreverLog("Salvou o cadastro de Funcionários!"); 
                } catch (IOException ex) {
                    logs.exceptionLog(ex); 
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
