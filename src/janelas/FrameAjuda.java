/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package janelas;

import java.awt.Dimension;

/**
 *
 * @author Soller
 */
public class FrameAjuda extends javax.swing.JInternalFrame {

    /**
     * Creates new form Ajuda
     */
    public FrameAjuda() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AjDesenvolvedores = new javax.swing.JLabel();
        AjNome3 = new javax.swing.JLabel();
        AjNome2 = new javax.swing.JLabel();
        AjNome1 = new javax.swing.JLabel();
        AjLogo = new javax.swing.JLabel();
        AjVersão = new javax.swing.JLabel();
        AjNomeSoftware = new javax.swing.JLabel();
        AjUniversidade = new javax.swing.JLabel();

        setClosable(true);

        AjDesenvolvedores.setText("Desenvolvedores:");

        AjNome3.setText("Wesley Ricardo de Souza");

        AjNome2.setText("Pedro Henrique Bonetti");

        AjNome1.setText("José Vitor");

        AjVersão.setText("Versão 1.0");

        AjNomeSoftware.setText("Controle de Estoque");

        AjUniversidade.setText("Universidade do Extremo Sul Catarinense");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(AjLogo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AjNomeSoftware)
                    .addComponent(AjVersão)
                    .addComponent(AjUniversidade))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(AjNome3)
                    .addComponent(AjDesenvolvedores)
                    .addComponent(AjNome2)
                    .addComponent(AjNome1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(AjDesenvolvedores)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AjNome1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AjNome2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AjNome3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AjLogo)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(AjNomeSoftware)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(AjVersão)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(AjUniversidade)))
                        .addGap(0, 28, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AjDesenvolvedores;
    private javax.swing.JLabel AjLogo;
    private javax.swing.JLabel AjNome1;
    private javax.swing.JLabel AjNome2;
    private javax.swing.JLabel AjNome3;
    private javax.swing.JLabel AjNomeSoftware;
    private javax.swing.JLabel AjUniversidade;
    private javax.swing.JLabel AjVersão;
    // End of variables declaration//GEN-END:variables

    public void setPosicao() {
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height) / 2);
    }

}