package janelas;

import actionListener.FuncionarioActionListener;
import gets_sets.Funcionario;
import java.awt.Dimension;


public class FrameFuncionario extends javax.swing.JInternalFrame {

    
    private FuncionarioActionListener funcionario = new FuncionarioActionListener(this);
    private Funcionario f = new Funcionario();
    
    
    public FrameFuncionario(){
        super("Cadastro de Funcionários");
        initComponents();


        botaoSalvar.addActionListener(funcionario);
        botaoCancelar.addActionListener(funcionario);
        botaoExcluir.addActionListener(funcionario);
    
    }

   
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textoEnderecoFunc = new javax.swing.JTextField();
        botaoSalvar = new javax.swing.JButton();
        botaoExcluir = new javax.swing.JButton();
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

        textoEnderecoFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoEnderecoFuncActionPerformed(evt);
            }
        });

        botaoSalvar.setText("Salvar");

        botaoExcluir.setText("Excluir");

        botaoCancelar.setText("Cancelar");

        cadNomeFunc.setText("Nome Principal");

        cadFuncao.setText("Função");

        cadCPFFunc.setText("CPF");

        cadEnderecoFunc.setText("Endereço");

        cadSexoFunc.setText("Sexo");

        textoNomeFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoNomeFuncActionPerformed(evt);
            }
        });

        textoFuncaoFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoFuncaoFuncActionPerformed(evt);
            }
        });

        cadTelefoneFunc.setText("Telefone");

        cadEmailFunc.setText("E-mail");

        textoEmailFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoEmailFuncActionPerformed(evt);
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
                        .addComponent(botaoExcluir)
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
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textoCPFFunc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cadCPFFunc))
                .addGap(18, 18, 18)
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
                    .addComponent(botaoExcluir)
                    .addComponent(botaoCancelar))
                .addContainerGap(29, Short.MAX_VALUE))
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

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCancelar;
    private javax.swing.JButton botaoExcluir;
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
    
    public Funcionario getFuncionario() {

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
        textoEnderecoFunc.setText("");
        textoFuncaoFunc.setText("");
        textoNomeFunc.setText("");
        textoTelefoneFunc.setText("");
    }
    
    public void setPosicao() {
    Dimension d = this.getDesktopPane().getSize();
    this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height) / 2); 
    }
    
}
