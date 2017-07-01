/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import exception.Exceptions;
import gets_sets.Papel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author comp8
 */
public class PapelDAO {
    
    
    
    public void insert(Papel papel)throws Exceptions {
        Connection conn = null;
        PreparedStatement ps = null;
        
        try {
            conn = Conexao.getConnection();
            String sql = "insert into papel (codigo, estoque, tipo, fabricante, formato, venda, gramatura) values(?,?,?,?,?,?,?)";
            
            
            ps = conn.prepareStatement(sql);
            
            ps.setString(1, papel.getTextoCodpapel());
            ps.setString(2, papel.getTextoEstoquepapel());
            ps.setString(3, papel.getTextoTipopapel());
            ps.setString(4, papel.getTextoFabricantepapel());
            ps.setString(5, papel.getTextoFormatopapel());
            ps.setString(6, papel.getTextoVendaPapel());
            ps.setString(7, papel.getTextoGramaturapapel());
            
            ps.execute();

            conn.commit();

        } catch (SQLException e) {
            System.out.println("ERRO: " + e.getMessage());

            if (conn != null) {
                try {
                    conn.rollback();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }

        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
        }
    }
}
