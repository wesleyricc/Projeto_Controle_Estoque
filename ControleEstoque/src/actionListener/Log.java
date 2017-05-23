/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actionListener;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author comp8
 */
public class Log {
    
    public void escreverUsuario(String user) throws IOException {

        FileWriter fw = new FileWriter("usuario.dat");

        BufferedWriter bw = new BufferedWriter(fw);
        String data = (new java.util.Date()).toString();

        bw.write(user);
        bw.flush();
        bw.close();

    }

    public void escreverLog(String user, String action) throws IOException {
        FileWriter fw = new FileWriter("log.dat", true);
        
        
        BufferedWriter bw = new BufferedWriter(fw);
        String data = (new java.util.Date()).toString();
        String msg = data + " : " + "Usuário: " + user + "\t" + "Ação: " + action + "\r\n";

        bw.write(msg);
        bw.flush();
        bw.close();

    }
    
    
}
