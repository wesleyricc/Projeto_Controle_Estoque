package janelas;

import exception.Exceptions;
import actionListener.FuncionarioActionListener;
import actionListener.Log;
import gets_sets.Funcionario;
import gets_sets.Login;
import java.awt.Dimension;
import java.io.IOException;
import javax.swing.JFormattedTextField;


public class FrameFuncionario extends javax.swing.JInternalFrame {

    
    private FuncionarioActionListener funcionario = new FuncionarioActionListener(this);
    private Funcionario f = new Funcionario();
    private String user;
    private String msg;
    Log logs = new Log();
    Login l;
       
   
    public FrameFuncionario(){
        super("Cadastro de Funcionários");
        initComponents();


        botaoSalvar.addActionListener(funcionario);
        botaoCancelar.addActionListener(funcionario);
        botaoLimpar.addActionListener(funcionario);
    
    }

   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textoEnderecoFunc = new javax.swing.JTextField();
        botaoSalvar = new javax.swing.JButton();
        botaoLimpar = new javax.swing.JButton();
        botaoCancelar = new javax.swing.JButton();
        cadNomeFunc = new javax.swing.JLabel();
        cadFuncao = new javax.swing.JLabel();
        cadCPFFunc = new javax.swing.JLabel();
        cadEnderecoFunc = new javax.swing.JLabel();
        cadSexoFunc = new javax.swing.JLabel();
        textoNomeFunc = new javax.swing.JTextField();
        textoFuncaoFunc = new javax.swing.JTextField();
        cadTelefoneFunc = new javax.swing.JLabel();
        cadEmailFunc = new javax.swing.JLabel();
        textoEmailFunc = new javax.swing.JTextField();
        textoTelefoneFunc = new javax.swing.JFormattedTextField();
        textoCPFFunc = new javax.swing.JFormattedTextField();
        textoSexoFunc = new javax.swing.JComboBox<>();

        textoEnderecoFunc.setToolTipText("Exemplo: Rua São José");
        textoEnderecoFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoEnderecoFuncActionPerformed(evt);
            }
        });
        textoEnderecoFunc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textoEnderecoFuncKeyTyped(evt);
            }
        });

        botaoSalvar.setText("Salvar");

        botaoLimpar.setText("Limpar");

        botaoCancelar.setText("Cancelar");

        cadNomeFunc.setText("Nome Principal");

        cadFuncao.setText("Função");

        cadCPFFunc.setText("CPF");

        cadEnderecoFunc.setText("Endereço");

        cadSexoFunc.setText("Sexo");

        textoNomeFunc.setToolTipText("Exemplo: José Ricardo da Silva");
        textoNomeFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoNomeFuncActionPerformed(evt);
            }
        });
        textoNomeFunc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textoNomeFuncKeyTyped(evt);
            }
        });

        textoFuncaoFunc.setToolTipText("Exemplo: Auxiliar técnico");
        textoFuncaoFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoFuncaoFuncActionPerformed(evt);
            }
        });
        textoFuncaoFunc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textoFuncaoFuncKeyTyped(evt);
            }
        });

        cadTelefoneFunc.setText("Telefone");

        cadEmailFunc.setText("E-mail");

        textoEmailFunc.setToolTipText("Exemplo: vitor.santos@hotmail.com");
        textoEmailFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoEmailFuncActionPerformed(evt);
            }
        });
        textoEmailFunc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textoEmailFuncKeyTyped(evt);
            }
        });

        try {
            textoTelefoneFunc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        textoTelefoneFunc.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                textoTelefoneFuncAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        textoTelefoneFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoTelefoneFuncActionPerformed(evt);
            }
        });

        try {
            textoCPFFunc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        textoCPFFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoCPFFuncActionPerformed(evt);
            }
        });

        textoSexoFunc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Feminino" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(42, 42, 42)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(cadFuncao)
                                .addComponent(cadCPFFunc)
                                .addComponent(cadEnderecoFunc)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(cadNomeFunc)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cadEmailFunc, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cadSexoFunc, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cadTelefoneFunc, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botaoSalvar)
                        .addGap(35, 35, 35)
                        .addComponent(botaoLimpar)
                        .addGap(30, 30, 30)
                        .addComponent(botaoCancelar))
                    .addComponent(textoEnderecoFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoFuncaoFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoNomeFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoEmailFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoCPFFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoTelefoneFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoSexoFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cadNomeFunc)
                    .addComponent(textoNomeFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cadFuncao)
                    .addComponent(textoFuncaoFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cadCPFFunc)
                        .addGap(22, 22, 22))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(textoCPFFunc, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cadEnderecoFunc)
                    .addComponent(textoEnderecoFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cadTelefoneFunc)
                    .addComponent(textoTelefoneFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cadSexoFunc)
                    .addComponent(textoSexoFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(textoEmailFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cadEmailFunc))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoSalvar)
                    .addComponent(botaoLimpar)
                    .addComponent(botaoCancelar))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
      
    private void textoEnderecoFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoEnderecoFuncActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoEnderecoFuncActionPerformed

    private void textoNomeFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoNomeFuncActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoNomeFuncActionPerformed

    private void textoFuncaoFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoFuncaoFuncActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoFuncaoFuncActionPerformed

    private void textoEmailFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoEmailFuncActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoEmailFuncActionPerformed

    private void textoTelefoneFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoTelefoneFuncActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoTelefoneFuncActionPerformed

    private void textoTelefoneFuncAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_textoTelefoneFuncAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_textoTelefoneFuncAncestorAdded

    private void textoCPFFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoCPFFuncActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoCPFFuncActionPerformed

    private void textoNomeFuncKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textoNomeFuncKeyTyped
        
        String caracteres="0987654321";
        if(caracteres.contains(evt.getKeyChar()+"")){
        evt.consume();          
    }   
        int limit = 50;
         
        if (textoNomeFunc.getText().length() == limit) {
            
            evt.consume();
        }
        
    }//GEN-LAST:event_textoNomeFuncKeyTyped

    private void textoFuncaoFuncKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textoFuncaoFuncKeyTyped
        
        String caracteres="0987654321";
        if(caracteres.contains(evt.getKeyChar()+"")){
        evt.consume();
    }
        int limit = 50;
         
        if (textoFuncaoFunc.getText().length() == limit) {
            
            evt.consume();
        }
       
    }//GEN-LAST:event_textoFuncaoFuncKeyTyped

    private void textoEnderecoFuncKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textoEnderecoFuncKeyTyped
      
         int limit = 50;
         
        if (textoEnderecoFunc.getText().length() == limit) {
            
            evt.consume();
        }
       
    }//GEN-LAST:event_textoEnderecoFuncKeyTyped

    private void textoEmailFuncKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textoEmailFuncKeyTyped
        
        int limit = 50;
         
        if (textoEmailFunc.getText().length() == limit) {
            
            evt.consume();
        }
       
    }//GEN-LAST:event_textoEmailFuncKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCancelar;
    private javax.swing.JButton botaoLimpar;
    private javax.swing.JButton botaoSalvar;
    private javax.swing.JLabel cadCPFFunc;
    private javax.swing.JLabel cadEmailFunc;
    private javax.swing.JLabel cadEnderecoFunc;
    private javax.swing.JLabel cadFuncao;
    private javax.swing.JLabel cadNomeFunc;
    private javax.swing.JLabel cadSexoFunc;
    private javax.swing.JLabel cadTelefoneFunc;
    private javax.swing.JFormattedTextField textoCPFFunc;
    private javax.swing.JTextField textoEmailFunc;
    private javax.swing.JTextField textoEnderecoFunc;
    private javax.swing.JTextField textoFuncaoFunc;
    private javax.swing.JTextField textoNomeFunc;
    private javax.swing.JComboBox<String> textoSexoFunc;
    private javax.swing.JFormattedTextField textoTelefoneFunc;
    // End of variables declaration//GEN-END:variables

    void setLocationRelativeTo(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public Funcionario getFuncionario() throws Exceptions {

        
        if (textoEmailFunc.getText().trim().isEmpty() || textoCPFFunc.getText().trim().isEmpty() || textoEnderecoFunc.getText().trim().isEmpty() || 
            textoFuncaoFunc.getText().trim().isEmpty() ||  textoNomeFunc.getText().trim().isEmpty() ||  textoTelefoneFunc.getText().trim().isEmpty()){
        
            try {   
                    logs.escreverLog("Erro ao cadastrar Funcionário!"); 
                } catch (IOException ex) {
                    logs.exceptionLog(ex); 
                } 
               
           
            throw new Exceptions("Preencha todos os campos corretamente!");  
       }
        
        String Tel= textoTelefoneFunc.getText().replaceAll("[()-]", "");
        String CPF = textoCPFFunc.getText().replaceAll("[.-]", "");
        
        f.setTextoCPFFunc(CPF);
        f.setTextoEmailFunc(textoEmailFunc.getText());
        f.setTextoEnderecoFunc(textoEnderecoFunc.getText());
        f.setTextoFuncaoFunc(textoFuncaoFunc.getText());
        f.setTextoNomeFunc(textoNomeFunc.getText());
        f.setTextoSexoFunc((String) textoSexoFunc.getSelectedItem());
        f.setTextoTelefoneFunc(Tel);
        
       
            
        return f;
    }

    public void LimparFuncionario() {
        textoEmailFunc.setText("");
        textoCPFFunc.setText("");
        textoCPFFunc.setFocusLostBehavior(JFormattedTextField.PERSIST);
        textoEnderecoFunc.setText("");
        textoFuncaoFunc.setText("");
        textoNomeFunc.setText("");
        textoTelefoneFunc.setText("");
        textoTelefoneFunc.setFocusLostBehavior(JFormattedTextField.PERSIST);
    }
    
    public void setPosicao() {
    Dimension d = this.getDesktopPane().getSize();
    this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height) / 2); 
    }
    
}
