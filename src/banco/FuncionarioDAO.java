package banco;

import exception.Exceptions;
import gets_sets.Fornecedor;
import gets_sets.Funcionario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FuncionarioDAO {

    public void insert(Funcionario forn) throws Exceptions {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "insert into funcionario (nome, funcao, cpf, endereco, telefone, sexo, email) values(?,?,?,?,?,?,?)";
            ps = conn.prepareStatement(sql);
            
            ps.setString(1, forn.getTextoNomeFunc());
            ps.setString(2, forn.getTextoFuncaoFunc());
            ps.setString(3, forn.getTextoCPFFunc());
            ps.setString(4, forn.getTextoEnderecoFunc());
            ps.setString(5, forn.getTextoTelefoneFunc());
            ps.setString(6, forn.getTextoSexoFunc());
            ps.setString(7, forn.getTextoEmailFunc());
            
            
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
    
    
    public Funcionario getFornecedor(String cnpj) throws Exceptions, SQLException {
        Connection conn = null;
        PreparedStatement ps = null;

        conn = Conexao.getConnection();
        String sql = "select cpf from funcionario where funcionario.cpf = new.cpf";
        ps = conn.prepareStatement(sql);
       
        ResultSet rs = ps.executeQuery();
        
        //Fornecedor forn =
        
        
        //return rs.getInt("codigo");
       
        return null;
    }
    

}
