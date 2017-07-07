/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actionListener;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;

/**
 *
 * @author comp8
 */
public class Log {

    private static String user;
    private final Log logs = new Log();
    
    public void setUser(String user) {
        this.user = user;
    }

    public void escreverUsuario() throws IOException {

        FileWriter fw = new FileWriter("usuario.dat");

        BufferedWriter bw = new BufferedWriter(fw);
        String data = (new java.util.Date()).toString();

        bw.write(user);
        bw.flush();
        bw.close();

    }

    public void escreverLog(String action) throws IOException {
        FileWriter fw = new FileWriter("log.dat", true);

        BufferedWriter bw = new BufferedWriter(fw);
        String data = (new java.util.Date()).toString();
        String msg = data + " : " + "Usuário: " + user + "\t" + "Ação: " + action + "\r\n";

        bw.write(msg);
        bw.flush();
        bw.close();

    }

    public void exceptionLog(Exception e) {

        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        e.printStackTrace(pw);

        try {
            escreverLog(sw.toString());
        } catch (IOException ex) {
            logs.exceptionLog(ex);
        }

    }
}
