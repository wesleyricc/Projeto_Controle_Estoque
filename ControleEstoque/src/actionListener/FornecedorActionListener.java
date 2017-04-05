package actionListener;

import gets_sets.Fornecedor;
import janelas.FrameFornecedor;
import janelas.FramePapel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FornecedorActionListener implements ActionListener {

    
    private FrameFornecedor ffornecedor;
    private FramePapel FPapel;
    
    public FornecedorActionListener(FrameFornecedor fornecedor) {
        this.ffornecedor = fornecedor;
    }    
    
    public void actionPerformed(ActionEvent e) {

        if (e.getActionCommand().equals("Salvar")) {

            Fornecedor f = ffornecedor.getFornecedor();  
            System.out.println(f.toString());
                                    
        }
        
        if(e.getActionCommand().equals("Excluir")){
            ffornecedor.LimparFornecedor();
        }

        if (e.getActionCommand().equals("Cancelar")) {
            
            ffornecedor.LimparFornecedor();
            ffornecedor.dispose();
        }
    }                                
}
    

    
    

