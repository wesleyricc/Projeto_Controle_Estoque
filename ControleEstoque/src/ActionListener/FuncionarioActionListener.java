
package ActionListener;

import Gets_Sets.Funcionario;
import Janelas.FrameFuncionario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class FuncionarioActionListener implements ActionListener {

    FrameFuncionario Ffuncionario;
    
    public FuncionarioActionListener(FrameFuncionario funcionario){
        this.Ffuncionario = funcionario;
    }
    
    public void actionPerformed(ActionEvent e) {
        
        
        if (e.getActionCommand().equals("Salvar")) {

            Funcionario f = Ffuncionario.getFuncionario();
            System.out.println("" + f.getTextoNomeFunc());
            System.out.println("" + f.getTextoFuncaoFunc());
            System.out.println("" + f.getTextoEnderecoFunc());
            System.out.println("" + f.getTextoCPFFunc());
            System.out.println("" + f.getTextoEmailFunc());
            System.out.println("" + f.getTextoSexoFunc());
            System.out.println("" + f.getTextoTelefoneFunc());
            
            Ffuncionario.LimparFuncionario();

        }
        
        if(e.getActionCommand().equals("Excluir")){
            Ffuncionario.LimparFuncionario();
        }

        if (e.getActionCommand().equals("Cancelar")) {
            
            Ffuncionario.LimparFuncionario();
            Ffuncionario.dispose();
        }
        
       
        
        
        
        
     
        
        
        
    }   
}
