package banco;

import exception.Exceptions;
import gets_sets.Funcionario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FuncionarioDAO {

    public void delete(Funcionario func) throws Exceptions {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "delete from funcionario where cpf = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, func.getTextoCPFFunc());
            ps.execute();

            conn.commit();
        } catch(SQLException e) {
            System.out.println("ERRO: " + e.getMessage());

            if(conn != null){
                try {
                    conn.rollback();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }


        } finally {
            if( ps != null) {
                try {
                    ps.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
            if(conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
        }
    }
    
    public void update(Funcionario func) throws Exceptions {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "update funcionario set nome = ?, funcao = ?, cpf = ?, endereco = ?, telefone = ?, sexo = ?, email = ? where cpf = ?";
            ps = conn.prepareStatement(sql);

            ps.setString(1, func.getTextoNomeFunc());
            ps.setString(2, func.getTextoFuncaoFunc());
            ps.setString(3, func.getTextoCPFFunc());
            ps.setString(4, func.getTextoEnderecoFunc());
            ps.setString(5, func.getTextoTelefoneFunc());
            ps.setString(6, func.getTextoSexoFunc());
            ps.setString(7, func.getTextoEmailFunc());

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
    
    public Funcionario getFuncionario(String cpf) throws Exceptions {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "select nome, funcao, sexo, endereco, telefone, email, cpf from funcionario where cpf = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, cpf);
            ResultSet rs = ps.executeQuery();
            if(rs.next()) {

                String nome = rs.getString(1);
                String funcao = rs.getString(2);
                String sexo = rs.getString(3);
                String endereco = rs.getString(4);
                String telefone = rs.getString(5);
                String email = rs.getString(6);
                String CPF = rs.getString(7);
                
                Funcionario func = new Funcionario();
                func.setTextoNomeFunc(nome);
                func.setTextoFuncaoFunc(funcao);
                func.setTextoSexoFunc(sexo);
                func.setTextoTelefoneFunc(telefone);
                func.setTextoEnderecoFunc(endereco);
                func.setTextoEmailFunc(email);
                func.setTextoCPFFunc(telefone);
  
                return func;
            }
        } catch(SQLException e) {
            System.out.println("ERRO: " + e.getMessage());
        } finally {
            if( ps != null) {
                try {
                    ps.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
            if(conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
        }
        return null;
    }
    
    public List<Funcionario> getAll() throws Exceptions {
        List<Funcionario> lista = new ArrayList<Funcionario>();
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "select nome from funcionario";
            ps = conn.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                String nome = rs.getString(1);
                Funcionario func = new Funcionario();
                func.setTextoNomeFunc(nome);

                lista.add(func);
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

    public String verificaCPF(String cpf) throws Exceptions {

        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "select cpf from funcionario where cpf = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, cpf);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                String cpf_return = rs.getString(1);

                return cpf_return;
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
    
    
    public void insert(Funcionario func) throws Exceptions {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "insert into funcionario (nome, funcao, cpf, endereco, telefone, sexo, email) values(?,?,?,?,?,?,?)";
            ps = conn.prepareStatement(sql);
            
            ps.setString(1, func.getTextoNomeFunc());
            ps.setString(2, func.getTextoFuncaoFunc());
            ps.setString(3, func.getTextoCPFFunc());
            ps.setString(4, func.getTextoEnderecoFunc());
            ps.setString(5, func.getTextoTelefoneFunc());
            ps.setString(6, func.getTextoSexoFunc());
            ps.setString(7, func.getTextoEmailFunc());
            
            
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
