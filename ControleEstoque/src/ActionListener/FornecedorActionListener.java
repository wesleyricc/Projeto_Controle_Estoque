package ActionListener;

import Gets_Sets.Fornecedor;
import Janelas.FrameFornecedor;
import Janelas.FramePapel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FornecedorActionListener implements ActionListener {

    
    FrameFornecedor FFornecedor;
    FramePapel FPapel;
    String fornecedor;
    
    public FornecedorActionListener(FrameFornecedor Fornecedor) {
        this.FFornecedor = Fornecedor;
    }
    
    public void actionPerformed(ActionEvent e) {

        if (e.getActionCommand().equals("Salvar")) {

            Fornecedor f = FFornecedor.getFornecedor();
            System.out.println("" + f.getTextoRazaoFornecedor());
            System.out.println("" + f.getTextoNomeFornecedor());
            System.out.println("" + f.getTextoCPFCNPJFornecedor());
            System.out.println("" + f.getTextoEnderecoFornecedor());
            System.out.println("" + f.getTextoTelefoneFornecedor());
            System.out.println("" + f.getTextoEmailFornecedor());
                      
            fornecedor = f.getTextoNomeFornecedor();
                             
            FFornecedor.LimparFornecedor();

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
    

    
    

