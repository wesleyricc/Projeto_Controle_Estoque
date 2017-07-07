
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
    private Funcionario func;
    Log logs = new Log();
    FuncionarioDAO funcDAO = new FuncionarioDAO();
    int cont = 0;
    
    
    public FuncionarioActionListener(FrameFuncionario funcionario){
        this.ffuncionario = funcionario;
    }
    
    public void actionPerformed(ActionEvent e) {
        
        
        if (e.getActionCommand().equals("Salvar")) {

            try {
                func = ffuncionario.getFuncionario();  
            } catch (Exceptions ex){       
                logs.exceptionLog(ex); 
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
            
           String CPF = func.getTextoCPFFunc();

            try {
                if (CPF.equals(funcDAO.verificaCPF(CPF))) {

                    if (cont == 0) {
                        cont = 1;
                        int n = JOptionPane.showConfirmDialog(null, "CPF já cadastrado. Deseja editar?");
                        if (n == 0) {

                            Funcionario func = funcDAO.getFuncionario(CPF);

                            ffuncionario.editarFuncionario(func);

                            ffuncionario.setVisible(true);
                            return;
                        }
                        if (n == 1) {
                            return;
                        } else {
                            ffuncionario.LimparFuncionario();
                            ffuncionario.dispose();
                            return;

                        }
                    }
                    if (cont == 1) {
                        cont = 0;
                        JOptionPane.showMessageDialog(null, "Funcionario cadastrado com sucesso");
                        funcDAO.update(func);
                    }

                }else{
                    try {
                        logs.escreverLog("Salvou o cadastro de Fornecedores!");
                    } catch (IOException ex) {
                        logs.exceptionLog(ex);
                        Logger.getLogger(FornecedorActionListener.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    JOptionPane.showMessageDialog(null, "Fornecedor cadastrado com sucesso");
                    funcDAO.insert(func);
                }
            } catch (Exceptions ex) {
                Logger.getLogger(FrameFuncionario.class.getName()).log(Level.SEVERE, null, ex);
                logs.exceptionLog(ex);
            }

            String msg = "Cadastrou um fornecedor!";

           
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
         
        if (e.getActionCommand().equals("Excluir")) {

            try {
                logs.escreverLog("Excluiu o cadastro de Funcionário!");
                } catch (IOException ex) {
                    logs.exceptionLog(ex); 
                }
            
            if(cont == 1){
                cont = 0;
                try {
                    funcDAO.delete(func);
                    JOptionPane.showMessageDialog(null, "Excluido com sucesso do banco de dados!");
                } catch (Exceptions ex) {
                    Logger.getLogger(FuncionarioActionListener.class.getName()).log(Level.SEVERE, null, ex);
                    logs.exceptionLog(ex);
                }
                
            }else{
                JOptionPane.showMessageDialog(null, "Funcionario não cadastrado no banco de dados!");
            }
                 
            ffuncionario.LimparFuncionario();
            
        }
        
    }   
}
