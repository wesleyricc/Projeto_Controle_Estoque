
package actionListener;

import gets_sets.Funcionario;
import janelas.FrameFuncionario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class FuncionarioActionListener implements ActionListener {

    private FrameFuncionario ffuncionario;
    
    public FuncionarioActionListener(FrameFuncionario funcionario){
        this.ffuncionario = funcionario;
    }
    
    public void actionPerformed(ActionEvent e) {
        
        
        if (e.getActionCommand().equals("Salvar")) {

            Funcionario f = ffuncionario.getFuncionario();
            System.out.println(f.toString());          

        }
        
        if(e.getActionCommand().equals("Excluir")){
            ffuncionario.LimparFuncionario();
        }

        if (e.getActionCommand().equals("Cancelar")) {
            
            ffuncionario.LimparFuncionario();
            ffuncionario.dispose();
        }
        
       
        
        
        
        
     
        
        
        
    }   
}
