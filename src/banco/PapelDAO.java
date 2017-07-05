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
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author comp8
 */
public class PapelDAO {

    
    public String verificaCodigo(String codigo) throws Exceptions {

        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "select cod_papel from papel where cod_papel = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, codigo);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                String codigo_return = rs.getString(1);

                return codigo_return;
            }
        } catch (SQLException e) {
            System.out.println("ERRO: " + e.getMessage());
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
        return null;
    }
    
    public List<Papel> getAll() throws Exceptions {
        List<Papel> lista = new ArrayList<Papel>();
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "select tipo, cod_prod, fabricante, gramatura, formato, valor, estoque from papel";
            ps = conn.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                String tipo = rs.getString(1);
                String cod_prod = rs.getString(2);
                String fabricante = rs.getString(3);
                String gramatura = rs.getString(4);
                String formato = rs.getString(5);
                String valor = rs.getString(6);
                String estoque = rs.getString(7);

                Papel p = new Papel();
                p.setTextoTipopapel(tipo);
                p.setTextoCodpapel(cod_prod);
                p.setTextoFabricantepapel(fabricante);
                p.setTextoGramaturapapel(gramatura);
                p.setTextoFormatopapel(formato);
                p.setTextoVendaPapel(valor);
                p.setTextoEstoquepapel(estoque);

                lista.add(p);
            }
        } catch (SQLException e) {
            System.out.println("ERRO: " + e.getMessage());
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
        return lista;
    }

    public void insert(Papel papel) throws Exceptions {
        Connection conn = null;
        PreparedStatement ps = null;

        try {
            conn = Conexao.getConnection();
            String sql = "insert into papel (tipo, cod_prod, fabricante, gramatura, formato, valor, estoque) values(?,?,?,?,?,?,?)";

            ps = conn.prepareStatement(sql);

            ps.setString(1, papel.getTextoTipopapel());
            ps.setString(2, papel.getTextoCodpapel());
            ps.setString(3, papel.getTextoFabricantepapel());
            ps.setString(4, papel.getTextoGramaturapapel());
            ps.setString(5, papel.getTextoFormatopapel());
            ps.setString(6, papel.getTextoVendaPapel());
            ps.setString(7, papel.getTextoEstoquepapel());

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
