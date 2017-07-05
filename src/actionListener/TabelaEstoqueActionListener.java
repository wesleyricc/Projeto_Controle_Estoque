/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actionListener;

import actionListener.Log;
import banco.PapelDAO;
import exception.Exceptions;
import gets_sets.Papel;
import janelas.FramePapel;
import janelas.FrameTabelaEstoque;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Wesley Ricardo
 */
public class TabelaEstoqueActionListener implements ActionListener {

    private FrameTabelaEstoque ftabela;
    private Papel p;
    Log logs = new Log();
    PapelDAO papelDAO = new PapelDAO();
    private FramePapel fpapel;

    public TabelaEstoqueActionListener(FrameTabelaEstoque ftabela) {

        this.ftabela = ftabela;

    }

    public void actionPerformed(ActionEvent e) {

        if (e.getActionCommand().equals("Sair")) {

            ftabela.dispose();
        }

    }
}
