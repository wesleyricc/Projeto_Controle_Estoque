package Janelas;

import ActionListener.PapelActionListener;
import Gets_Sets.Papel;
import java.awt.Dimension;

public class FramePapel extends javax.swing.JInternalFrame {

    private PapelActionListener papel = new PapelActionListener(this);

    Papel pap = new Papel();

    public FramePapel() {
        super("Cadastro de Papéis");
        initComponents();

        botaoSalvar.addActionListener(papel);
        botaoCancelar.addActionListener(papel);
        botaoExcluir.addActionListener(papel);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textoEstoquePapel = new javax.swing.JTextField();
        botaoSalvar = new javax.swing.JButton();
        botaoExcluir = new javax.swing.JButton();
        botaoCancelar = new javax.swing.JButton();
        cadTipoPapel = new javax.swing.JLabel();
        cadCodPapel = new javax.swing.JLabel();
        cadVendaPapel = new javax.swing.JLabel();
        cadFabricantePapel = new javax.swing.JLabel();
        cadEstoquePapel = new javax.swing.JLabel();
        textoCodPapel = new javax.swing.JTextField();
        cadGramaturaPapel = new javax.swing.JLabel();
        textoGramaturaPapel = new javax.swing.JComboBox<>();
        cadFormatoPapel = new javax.swing.JLabel();
        textoFormatoPapel = new javax.swing.JComboBox<>();
        textoTipoPapel = new javax.swing.JComboBox<>();
        textoFabricantePapel = new javax.swing.JComboBox<>();
        textoVendaPapel = new javax.swing.JFormattedTextField();

        textoEstoquePapel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoEstoquePapelActionPerformed(evt);
            }
        });

        botaoSalvar.setText("Salvar");

        botaoExcluir.setText("Excluir");

        botaoCancelar.setText("Cancelar");

        cadTipoPapel.setText("Tipo de Papel");

        cadCodPapel.setText("Código do Produto");

        cadVendaPapel.setText("Valor de Venda");

        cadFabricantePapel.setText("Fabricante");

        cadEstoquePapel.setText("Máximo em estoque");

        textoCodPapel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoCodPapelActionPerformed(evt);
            }
        });

        cadGramaturaPapel.setText("Gramatura");

        textoGramaturaPapel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "90", "115", "150", "170", "210" }));
        textoGramaturaPapel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoGramaturaPapelActionPerformed(evt);
            }
        });

        cadFormatoPapel.setText("Formato");

        textoFormatoPapel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "640x440", "660x480", "760x112", "770x113" }));
        textoFormatoPapel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoFormatoPapelActionPerformed(evt);
            }
        });

        textoTipoPapel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Couchê", "Cartão Duplex", "Cartão Triplex", "Sulfite" }));
        textoTipoPapel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoTipoPapelActionPerformed(evt);
            }
        });

        textoFabricantePapel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Suzano", "GRPaper", "Klabin", "Ibema", "Santa Maria" }));

        textoVendaPapel.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cadEstoquePapel)
                                    .addComponent(cadTipoPapel)
                                    .addComponent(cadCodPapel))
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textoEstoquePapel, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textoCodPapel, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textoTipoPapel, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textoVendaPapel, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cadVendaPapel, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cadGramaturaPapel)
                                        .addComponent(cadFabricantePapel)))
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(textoGramaturaPapel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(79, 79, 79)
                                        .addComponent(cadFormatoPapel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(textoFormatoPapel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(textoFabricantePapel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(108, 108, 108)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(botaoSalvar)
                        .addGap(40, 40, 40)
                        .addComponent(botaoExcluir)
                        .addGap(39, 39, 39)
                        .addComponent(botaoCancelar)
                        .addGap(120, 120, 120))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cadTipoPapel)
                    .addComponent(textoTipoPapel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cadCodPapel)
                    .addComponent(textoCodPapel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cadFabricantePapel)
                    .addComponent(textoFabricantePapel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cadGramaturaPapel)
                    .addComponent(textoGramaturaPapel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cadFormatoPapel)
                    .addComponent(textoFormatoPapel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoVendaPapel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cadVendaPapel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cadEstoquePapel)
                    .addComponent(textoEstoquePapel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoSalvar)
                    .addComponent(botaoExcluir)
                    .addComponent(botaoCancelar))
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textoEstoquePapelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoEstoquePapelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoEstoquePapelActionPerformed

    private void textoCodPapelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoCodPapelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoCodPapelActionPerformed

    private void textoGramaturaPapelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoGramaturaPapelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoGramaturaPapelActionPerformed

    private void textoFormatoPapelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoFormatoPapelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoFormatoPapelActionPerformed

    private void textoTipoPapelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoTipoPapelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoTipoPapelActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCancelar;
    private javax.swing.JButton botaoExcluir;
    private javax.swing.JButton botaoSalvar;
    private javax.swing.JLabel cadCodPapel;
    private javax.swing.JLabel cadEstoquePapel;
    private javax.swing.JLabel cadFabricantePapel;
    private javax.swing.JLabel cadFormatoPapel;
    private javax.swing.JLabel cadGramaturaPapel;
    private javax.swing.JLabel cadTipoPapel;
    private javax.swing.JLabel cadVendaPapel;
    private javax.swing.JTextField textoCodPapel;
    private javax.swing.JTextField textoEstoquePapel;
    private javax.swing.JComboBox<String> textoFabricantePapel;
    private javax.swing.JComboBox<String> textoFormatoPapel;
    private javax.swing.JComboBox<String> textoGramaturaPapel;
    private javax.swing.JComboBox<String> textoTipoPapel;
    private javax.swing.JFormattedTextField textoVendaPapel;
    // End of variables declaration//GEN-END:variables

    public Papel getPapel() {
        
        String valor = textoVendaPapel.getText().replaceAll("[.-]", "");
        pap.setTextoCodpapel(textoCodPapel.getText());
        pap.setTextoEstoquepapel(textoEstoquePapel.getText());
        pap.setTextoFabricantepapel((String) textoFabricantePapel.getSelectedItem());
        pap.setTextoTipopapel((String) textoTipoPapel.getSelectedItem());
        pap.setTextoFormatopapel((String) textoFormatoPapel.getSelectedItem());
        pap.setTextoGramaturapapel((String) textoGramaturaPapel.getSelectedItem());
        pap.setTextoVendaPapel(valor);
        
        return pap;
    }

    public void LimparPapel() {
        textoCodPapel.setText("");
        textoEstoquePapel.setText("");
        textoTipoPapel.setSelectedIndex(0);
        textoFabricantePapel.setSelectedIndex(0);
        textoFormatoPapel.setSelectedIndex(0);
        textoVendaPapel.setText("");
    }

    public void setPosicao() {
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height) / 2);
    }

}
