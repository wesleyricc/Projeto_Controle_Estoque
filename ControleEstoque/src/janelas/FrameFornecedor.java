package janelas;

import actionListener.FornecedorActionListener;
import gets_sets.Fornecedor;
import java.awt.Dimension;

public class FrameFornecedor extends javax.swing.JInternalFrame {

    private FornecedorActionListener fornecedor = new FornecedorActionListener(this);
    private Fornecedor forn = new Fornecedor();

    public FrameFornecedor() {
        super("Cadastro de Fornecedor");
        initComponents();

        botaoSalvar.addActionListener(fornecedor);
        botaoCancelar.addActionListener(fornecedor);
        botaoExcluir.addActionListener(fornecedor);

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
        botaoExcluir = new javax.swing.JButton();
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

        textoRazaoFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoRazaoFornecedorActionPerformed(evt);
            }
        });

        textoNomeFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoNomeFornecedorActionPerformed(evt);
            }
        });

        textoEnderecoFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoEnderecoFornecedorActionPerformed(evt);
            }
        });

        botaoSalvar.setText("Salvar");
        botaoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarActionPerformed(evt);
            }
        });

        botaoExcluir.setText("Excluir");
        botaoExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoExcluirActionPerformed(evt);
            }
        });

        botaoCancelar.setText("Cancelar");

        textoEmailFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoEmailFornecedorActionPerformed(evt);
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
                .addComponent(botaoExcluir)
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
                    .addComponent(botaoExcluir)
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

    private void botaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarActionPerformed

    }//GEN-LAST:event_botaoSalvarActionPerformed

    private void botaoExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoExcluirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoExcluirActionPerformed

    private void textoTelefoneFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoTelefoneFornecedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoTelefoneFornecedorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCancelar;
    private javax.swing.JButton botaoExcluir;
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

    public Fornecedor getFornecedor() {

        String Tel= textoTelefoneFornecedor.getText().replaceAll("[()-]", "");
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
        textoEnderecoFornecedor.setText("");
        textoNomeFornecedor.setText("");
        textoRazaoFornecedor.setText("");
        textoTelefoneFornecedor.setText("");
    }

    public void setPosicao() {
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height) / 2);
    }

}
