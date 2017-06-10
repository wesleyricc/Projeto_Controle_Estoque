/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import exception.Exceptions;
import gets_sets.Fornecedor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author comp8
 */
public class FornecedorDAO {

    public void insert(Fornecedor forn) throws Exceptions {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "insert into fornecedor (razao_social, nome, endereco, telefone, email, cnpj) values(?,?,?,?,?,?)";
            ps = conn.prepareStatement(sql);
            
            ps.setString(1, forn.getTextoRazaoFornecedor());
            ps.setString(2, forn.getTextoNomeFornecedor());
            ps.setString(3, forn.getTextoEnderecoFornecedor());
            ps.setString(4, forn.getTextoTelefoneFornecedor());
            ps.setString(5, forn.getTextoEmailFornecedor());
            ps.setInt(6, forn.getTextoCNPJFornecedor());
            
            
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
    
    
    public Fornecedor getFornecedor(String cnpj) throws Exceptions, SQLException {
        Connection conn = null;
        PreparedStatement ps = null;

        conn = Conexao.getConnection();
        String sql = "select cnpj from fornecedor where fornecdor.cnpj = new.cnpj";
        ps = conn.prepareStatement(sql);
       
        ResultSet rs = ps.executeQuery();
        
        //Fornecedor forn =
        
        
        //return rs.getInt("codigo");
       
        return null;
    }
    

}
