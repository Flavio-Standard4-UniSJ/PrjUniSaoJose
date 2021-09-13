package dao;

import controle.Corretor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
    
    public void excluirCorretor(String nome) throws Exception{
        String sql = ("DELETE FROM Corretor WHERE nome = '"+nome+"'");
        PreparedStatement preparador = this.conexao.prepareStatement(sql);
        preparador.execute();
        preparador.close();
    }
    
    public void alterarLoginCorretor(Corretor corretor) throws Exception{
        String sql = "UPDATE Corretor SET email=?, senha=md5(?) WHERE nome = ? AND pin=?";        
        PreparedStatement preparador = this.conexao.prepareStatement(sql);
        preparador.setString(1, corretor.getEmail());
        preparador.setString(2, corretor.getSenha());
        preparador.setString(3, corretor.getNome());
        preparador.execute();
        preparador.close();
    }
    
    public Corretor desativarContaCorretor(String nome) throws Exception{
        Corretor corretor = new Corretor();
        String pesq = ("UPDATE Corretor SET ativo=? WHERE nome = ?");
        PreparedStatement preparador = this.conexao.prepareStatement(pesq);
        preparador.setString(1, corretor.getNome());
        ResultSet rs = preparador.executeQuery();
        if(rs.next()){
            corretor.setAtivo(rs.getInt("ativo"));
            rs.close();
            preparador.close();
        }
        return corretor; 
    }
    
    public Corretor acessarContaCorretor(String login, String senha) throws Exception{
        Corretor corretor = new Corretor();
        String sql = ("SELECT * FROM Corretor WHERE email = ? AND senha = md5(?)");
        PreparedStatement preparador = this.conexao.prepareStatement(sql);
        preparador.setString(1, corretor.getEmail());
        preparador.setString(2, corretor.getSenha());
        ResultSet rs = preparador.executeQuery();
        if(rs.next()){
            corretor.setNome(rs.getString("nome"));
            corretor.setEmail(rs.getString("email"));
            corretor.setSenha(rs.getString("senha"));
            System.out.println("Seja bem vindo "+corretor.getEmail());
            rs.close();
            preparador.close();
        }
        registroLogin(corretor.getNome());
        return corretor; 
    }
}