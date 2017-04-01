package ActionListener;

import Gets_Sets.Fornecedor;
import Janelas.FrameFornecedor;
import Janelas.FramePapel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FornecedorActionListener implements ActionListener {

    
    FrameFornecedor FFornecedor;
    FramePapel FPapel;
    
    public FornecedorActionListener(FrameFornecedor Fornecedor) {
        this.FFornecedor = Fornecedor;
    }    
    
    public void actionPerformed(ActionEvent e) {

        if (e.getActionCommand().equals("Salvar")) {

            Fornecedor f = FFornecedor.getFornecedor();  
            System.out.println(f.toString());
                                    
        }
        
        if(e.getActionCommand().equals("Excluir")){
            FFornecedor.LimparFornecedor();
        }

        if (e.getActionCommand().equals("Cancelar")) {
            
            FFornecedor.LimparFornecedor();
            FFornecedor.dispose();
        }
    }                                
}
    

    
    

