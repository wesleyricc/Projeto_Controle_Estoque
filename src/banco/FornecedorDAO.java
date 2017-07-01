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
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author comp8
 */
public class FornecedorDAO {

    public void update(Fornecedor f) throws Exceptions {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "update fornecedor set razao_social = ?, nome = ?, endereco = ?, telefone = ?, email = ?, cnpj = ? where cnpj = ?";
            ps = conn.prepareStatement(sql);

            ps.setString(1, f.getTextoRazaoFornecedor());
            ps.setString(2, f.getTextoNomeFornecedor());
            ps.setString(3, f.getTextoEnderecoFornecedor());
            ps.setString(4, f.getTextoTelefoneFornecedor());
            ps.setString(5, f.getTextoEmailFornecedor());
            ps.setString(6, f.getTextoCNPJFornecedor());
            ps.setString(7, f.getTextoCNPJFornecedor());

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

    public List<Fornecedor> getAll() throws Exceptions {
        List<Fornecedor> lista = new ArrayList<Fornecedor>();
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "select razao_social from fornecedor";
            ps = conn.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                String razao = rs.getString(1);
                Fornecedor f = new Fornecedor();
                f.setTextoRazaoFornecedor(razao);

                lista.add(f);
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

    public String verificaCNPJ(String cnpj) throws Exceptions {

        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "select cnpj from fornecedor where cnpj = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, cnpj);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                String cnpj_return = rs.getString(1);

                return cnpj_return;
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
            ps.setString(6, forn.getTextoCNPJFornecedor());

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
