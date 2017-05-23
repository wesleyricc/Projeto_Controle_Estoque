package janelas;

import Exception.Exceptions;
import actionListener.FornecedorActionListener;
import actionListener.Log;
import gets_sets.Fornecedor;
import gets_sets.Login;
import java.awt.Dimension;
import java.io.IOException;
import javax.swing.JFormattedTextField;

public class FrameFornecedor extends javax.swing.JInternalFrame {

    private FornecedorActionListener fornecedor = new FornecedorActionListener(this);
    private Fornecedor forn = new Fornecedor();
    private String user;
    private String msg;
    Log logs = new Log();
    Login l;

    public FrameFornecedor() {
        super("Cadastro de Fornecedor");
        initComponents();

        botaoSalvar.addActionListener(fornecedor);
        botaoCancelar.addActionListener(fornecedor);
        botaoLimpar.addActionListener(fornecedor);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cadRazaoFornecedor = new javax.swing.JLabel();
        cadNomeFornecedor = new javax.swing.JLabel();
        cadCPFFornecedor = new javax.swing.JLabel();
        cadEnderecoFornecedor = new javax.swing.JLabel();
        cadTelefoneFornecedor = new javax.swing.JLabel();
        textoRazaoFornecedor = new javax.swing.JTextField();
        textoNomeFornecedor = new javax.swing.JTextField();
        textoEnderecoFornecedor = new javax.swing.JTextField();
        botaoSalvar = new javax.swing.JButton();
        botaoLimpar = new javax.swing.JButton();
        botaoCancelar = new javax.swing.JButton();
        textoEmailFornecedor = new javax.swing.JTextField();
        cadEmailFornecedor = new javax.swing.JLabel();
        textoCNPJFornecedor = new javax.swing.JFormattedTextField();
        textoTelefoneFornecedor = new javax.swing.JFormattedTextField();

        cadRazaoFornecedor.setText("Razão Social");

        cadNomeFornecedor.setText("Nome Principal");

        cadCPFFornecedor.setText("CNPJ");

        cadEnderecoFornecedor.setText("Endereço");

        cadTelefoneFornecedor.setText("Telefone");

        textoRazaoFornecedor.setToolTipText("Exemplo: JPD Sistemas");
        textoRazaoFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoRazaoFornecedorActionPerformed(evt);
            }
        });
        textoRazaoFornecedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textoRazaoFornecedorKeyTyped(evt);
            }
        });

        textoNomeFornecedor.setToolTipText("Exemplo: José Ricardo da Silva");
        textoNomeFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoNomeFornecedorActionPerformed(evt);
            }
        });
        textoNomeFornecedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textoNomeFornecedorKeyTyped(evt);
            }
        });

        textoEnderecoFornecedor.setToolTipText("Exemplo: Rua São José");
        textoEnderecoFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoEnderecoFornecedorActionPerformed(evt);
            }
        });
        textoEnderecoFornecedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textoEnderecoFornecedorKeyTyped(evt);
            }
        });

        botaoSalvar.setText("Salvar");
        botaoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarActionPerformed(evt);
            }
        });

        botaoLimpar.setText("Limpar");

        botaoCancelar.setText("Cancelar");

        textoEmailFornecedor.setToolTipText("vitor.santos@hotmail.com");
        textoEmailFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoEmailFornecedorActionPerformed(evt);
            }
        });
        textoEmailFornecedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textoEmailFornecedorKeyTyped(evt);
            }
        });

        cadEmailFornecedor.setText("E-mail");

        try {
            textoCNPJFornecedor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            textoTelefoneFornecedor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        textoTelefoneFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoTelefoneFornecedorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(cadRazaoFornecedor))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cadNomeFornecedor)))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textoRazaoFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textoNomeFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textoCNPJFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cadTelefoneFornecedor)
                            .addComponent(cadEmailFornecedor)
                            .addComponent(cadEnderecoFornecedor)
                            .addComponent(cadCPFFornecedor))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textoEmailFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textoEnderecoFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textoTelefoneFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(44, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(botaoSalvar)
                .addGap(34, 34, 34)
                .addComponent(botaoLimpar)
                .addGap(28, 28, 28)
                .addComponent(botaoCancelar)
                .addGap(118, 118, 118))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cadRazaoFornecedor)
                    .addComponent(textoRazaoFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cadNomeFornecedor)
                    .addComponent(textoNomeFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cadCPFFornecedor)
                    .addComponent(textoCNPJFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cadEnderecoFornecedor)
                    .addComponent(textoEnderecoFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cadTelefoneFornecedor)
                    .addComponent(textoTelefoneFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoEmailFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cadEmailFornecedor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoSalvar)
                    .addComponent(botaoLimpar)
                    .addComponent(botaoCancelar))
                .addGap(22, 22, 22))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {cadCPFFornecedor, cadEnderecoFornecedor, cadNomeFornecedor, cadRazaoFornecedor, cadTelefoneFornecedor});

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void textoRazaoFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoRazaoFornecedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoRazaoFornecedorActionPerformed

    private void textoNomeFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoNomeFornecedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoNomeFornecedorActionPerformed

    private void textoCPFFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoCPFFornecedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoCPFFornecedorActionPerformed

    private void textoEnderecoFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoEnderecoFornecedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoEnderecoFornecedorActionPerformed

    private void textoEmailFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoEmailFornecedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoEmailFornecedorActionPerformed

    private void textoTelefoneFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoTelefoneFornecedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoTelefoneFornecedorActionPerformed

    private void textoRazaoFornecedorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textoRazaoFornecedorKeyTyped

        String caracteres = "0987654321";
        if (caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
        int limit = 50;

        if (textoRazaoFornecedor.getText().length() == limit) {

            evt.consume();
        }

    }//GEN-LAST:event_textoRazaoFornecedorKeyTyped

    private void textoNomeFornecedorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textoNomeFornecedorKeyTyped

        String caracteres = "0987654321";
        if (caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
        int limit = 50;

        if (textoNomeFornecedor.getText().length() == limit) {

            evt.consume();
        }


    }//GEN-LAST:event_textoNomeFornecedorKeyTyped

    private void textoEnderecoFornecedorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textoEnderecoFornecedorKeyTyped

        int limit = 50;

        if (textoEnderecoFornecedor.getText().length() == limit) {

            evt.consume();
        }

    }//GEN-LAST:event_textoEnderecoFornecedorKeyTyped

    private void textoEmailFornecedorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textoEmailFornecedorKeyTyped

        int limit = 50;

        if (textoEmailFornecedor.getText().length() == limit) {

            evt.consume();
        }

    }//GEN-LAST:event_textoEmailFornecedorKeyTyped

    private void botaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoSalvarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCancelar;
    private javax.swing.JButton botaoLimpar;
    private javax.swing.JButton botaoSalvar;
    private javax.swing.JLabel cadCPFFornecedor;
    private javax.swing.JLabel cadEmailFornecedor;
    private javax.swing.JLabel cadEnderecoFornecedor;
    private javax.swing.JLabel cadNomeFornecedor;
    private javax.swing.JLabel cadRazaoFornecedor;
    private javax.swing.JLabel cadTelefoneFornecedor;
    private javax.swing.JFormattedTextField textoCNPJFornecedor;
    private javax.swing.JTextField textoEmailFornecedor;
    private javax.swing.JTextField textoEnderecoFornecedor;
    private javax.swing.JTextField textoNomeFornecedor;
    private javax.swing.JTextField textoRazaoFornecedor;
    private javax.swing.JFormattedTextField textoTelefoneFornecedor;
    // End of variables declaration//GEN-END:variables

    void setLocationRelativeTo(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Fornecedor getFornecedor() throws Exceptions {

        String Tel = textoTelefoneFornecedor.getText().replaceAll("[()-]", "");

        if (textoRazaoFornecedor.getText().trim().isEmpty() || textoEmailFornecedor.getText().trim().isEmpty() || textoEnderecoFornecedor.getText().trim().isEmpty()
                || textoNomeFornecedor.getText().trim().isEmpty() || textoCNPJFornecedor.getText().trim().isEmpty() || textoTelefoneFornecedor.getText().trim().isEmpty()) {
            
            try {   
                    logs.escreverLog("Erro ao cadastrar Fornecedor!"); 
                } catch (IOException ex) {} 
            
            throw new Exceptions("Preencha todos os campos corretamente!");
        }

        forn.setTextoCPFCNPJFornecedor(textoCNPJFornecedor.getText());
        forn.setTextoEmailFornecedor(textoEmailFornecedor.getText());
        forn.setTextoEnderecoFornecedor(textoEnderecoFornecedor.getText());
        forn.setTextoNomeFornecedor(textoNomeFornecedor.getText());
        forn.setTextoRazaoFornecedor(textoRazaoFornecedor.getText());
        forn.setTextoTelefoneFornecedor(Tel);

        return forn;
    }

    public void LimparFornecedor() {
        textoEmailFornecedor.setText("");
        textoCNPJFornecedor.setText("");
        textoCNPJFornecedor.setFocusLostBehavior(JFormattedTextField.PERSIST);
        textoEnderecoFornecedor.setText("");
        textoNomeFornecedor.setText("");
        textoRazaoFornecedor.setText("");
        textoTelefoneFornecedor.setText("");
        textoTelefoneFornecedor.setFocusLostBehavior(JFormattedTextField.PERSIST);
    }

    public void setPosicao() {
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height) / 2);
    }

}
