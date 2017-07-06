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
import java.util.Vector;

/**
 *
 * @author comp8
 */
public class PapelDAO {

    public void delete(Papel pap) throws Exceptions {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "delete from papel where cod_prod = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, pap.getTextoCodpapel());
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

    public Papel getPapel(String codigo) throws Exceptions {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "select tipo, cod_prod, fabricante, gramatura, formato, valor, estoque from papel where cod_prod = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, codigo);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                String tipo = rs.getString(1);
                String cod_prod = rs.getString(2);
                String fabricante = rs.getString(3);
                String gramatura = rs.getString(4);
                String formato = rs.getString(5);
                String valor = rs.getString(6);
                String estoque = rs.getString(7);

                Papel pap = new Papel();
                pap.setTextoTipopapel(tipo);
                pap.setTextoCodpapel(cod_prod);
                pap.setTextoFabricantepapel(fabricante);
                pap.setTextoGramaturapapel(gramatura);
                pap.setTextoFormatopapel(formato);
                pap.setTextoVendaPapel(valor);
                pap.setTextoEstoquepapel(estoque);

                return pap;
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

    public Vector carregaComboBox() {
        Connection conn = null;
        PreparedStatement ps = null;
        Vector vetor = new Vector();
        try {
            conn = Conexao.getConnection();
            String sql = "select nome from fornecedor order by nome";
            ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                vetor.add(rs.getString("nome"));
            }
            rs.close();
            conn.close();
        } catch (Exception e) {

        }

        return vetor;
    }

    public String verificaCodigo(String codigo) throws Exceptions {

        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "select cod_prod from papel where cod_prod = ?";
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

    public void update(Papel p) throws Exceptions {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "update papel set tipo = ?, cod_prod = ?, fabricante = ?, gramatura = ?, formato = ?, valor = ?,  estoque = ? where cod_prod = ?";
            ps = conn.prepareStatement(sql);

            ps.setString(1, p.getTextoTipopapel());
            ps.setString(2, p.getTextoCodpapel());
            ps.setString(3, p.getTextoFabricantepapel());
            ps.setString(4, p.getTextoGramaturapapel());
            ps.setString(5, p.getTextoFormatopapel());
            ps.setString(6, p.getTextoVendaPapel());
            ps.setString(7, p.getTextoEstoquepapel());

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

    public List<Papel> getAll() throws Exceptions {
        List<Papel> lista = new ArrayList<Papel>();
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "select cod_prod from papel";
            ps = conn.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                String cod_prod = rs.getString(1);
                Papel pap = new Papel();
                pap.setTextoCodpapel(cod_prod);

                lista.add(pap);
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
