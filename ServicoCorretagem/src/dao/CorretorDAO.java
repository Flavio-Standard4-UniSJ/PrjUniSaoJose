package dao;

import controle.Corretor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import servico.Acesso;


public class CorretorDAO {
    private Connection conexao;

    public CorretorDAO() throws Exception {
        this.conexao = CriaConexao.getConexao();
    }
    public void cadastrarCorretor(Corretor corretor) throws SQLException{
        String sql = "INSERT INTO Corretor (nome, sobrenome, nascimento, ativo, creci, cpf, email, identidade, senha, pin, telefone) VALUES (?,?,?,?,?,?,?,?,md5(?),?,?)";
        PreparedStatement preparador = conexao.prepareStatement(sql);
        preparador.setString(1, corretor.getNome());
        preparador.setString(2, corretor.getSobrenome());
        preparador.setString(3, corretor.getNascimento());
        preparador.setInt(4, corretor.getAtivo());
        preparador.setString(5, corretor.getCreci());
        preparador.setString(6, corretor.getCpf());
        preparador.setString(7, corretor.getEmail());
        preparador.setString(8, corretor.getIdentidade());
        preparador.setString(9, corretor.getSenha());
        preparador.setString(10, corretor.getPin());
        preparador.setString(11, corretor.getTelefone());
        preparador.execute();
        preparador.close();
        System.out.println("Cadastrado com sucesso");
        registroLogin(corretor.getNome());
    }

    public void registroLogin(String nome_usuario) throws SQLException {
        String sql = "INSERT INTO acesso (nome_usuario, data_acesso, hora_acesso) VALUES (?,?,?)";
        Acesso acesso = new Acesso();
        PreparedStatement preparador = conexao.prepareStatement(sql);
        preparador.setString(1, nome_usuario);
        preparador.setString(2, acesso.getDataAcesso());
        preparador.setString(3, acesso.getHoraAcesso());
        preparador.execute();
        preparador.close();
    }
    
    public void excluirCorretor(int id) throws Exception{
        String sql = ("DELETE FROM Corretor WHERE id=?");
        PreparedStatement preparador = this.conexao.prepareStatement(sql);
        preparador.setInt(1, id);
        preparador.execute();
        preparador.close();
    }
    
    public void alterarLoginCorretor(Corretor corretor) throws Exception{
        String sql = "UPDATE Corretor senha=md5(?) WHERE nome = ? AND email=?";        
        PreparedStatement preparador = this.conexao.prepareStatement(sql);
        preparador.setString(1, corretor.getEmail());
        preparador.setString(2, corretor.getSenha());
        preparador.setString(3, corretor.getNome());
        preparador.execute();
        preparador.close();
    }
    public void alterarContaCorretor(Corretor corretor) throws Exception{
        String sql = "UPDATE Corretor SET sobrenome=?, telefone=? WHERE email = ?";        
        PreparedStatement preparador = this.conexao.prepareStatement(sql);
        preparador.setString(1, corretor.getSobrenome());
        preparador.setString(2, corretor.getTelefone());
        preparador.setString(3, corretor.getEmail());
        preparador.execute();
        preparador.close();
        System.out.println("Corretor alterado com sucesso");
    }
    public Corretor acessarContaCorretor(String email, String senha) throws SQLException{
        String sql = "SELECT * FROM Corretor WHERE email=? AND senha=md5(?)";
        PreparedStatement preparador = this.conexao.prepareStatement(sql);
        preparador.setString(1, email);
        preparador.setString(2, senha);
        ResultSet resultSet = preparador.executeQuery();
         Corretor corretor = new Corretor();
        if (resultSet != null) {
            if (resultSet.next()) { 
                corretor.setId(resultSet.getInt("id"));
                corretor.setNome(resultSet.getString("nome"));
                corretor.setSobrenome(resultSet.getString("sobrenome"));
                corretor.setEmail(resultSet.getString("email"));
                corretor.setSenha(resultSet.getString("senha"));
                corretor.setCpf(resultSet.getString("cpf"));
                corretor.setCreci(resultSet.getString("creci"));
                return corretor;
            }
        }else{
            JOptionPane.showMessageDialog(null, "Dados incorretos!");
            return null;
        }
        preparador.close(); 
        return null;  
    }
    
    
   public void desativarContaCorretor(String email, int id) throws Exception{
        String sql = "DELETE FROM Corretor WHERE email=? AND  id=?";        
        PreparedStatement preparador = this.conexao.prepareStatement(sql);
        preparador.setString(1, email);
        preparador.setInt(2, id);
        preparador.execute();
        preparador.close();
    } 
}
