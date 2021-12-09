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
    
    public void desativarContaCorretor(Corretor corretor) throws Exception{
        String sql = ("UPDATE Corretor SET ativo=0 WHERE nome = ?");
        PreparedStatement preparador = this.conexao.prepareStatement(sql);
        preparador.setInt(1, corretor.getAtivo());
        preparador.setString(2, corretor.getNome());
        preparador.execute();
        preparador.close();
    }
    
    public void alterarContaCorretor(Corretor corretor) throws Exception{
        String sql = ("UPDATE Corretor SET email=?, telefone=? WHERE nome = ?");
        PreparedStatement preparador = this.conexao.prepareStatement(sql);
        preparador.setString(1, corretor.getEmail());
        preparador.setString(2, corretor.getTelefone());
        preparador.setString(3, corretor.getNome());
        System.out.println(corretor.getEmail());
        System.out.println(corretor.getTelefone());
        System.out.println(corretor.getNome());
        preparador.execute();
        preparador.close();        
    }
      
    public boolean acessarContaCorretor(String email, String senha) throws Exception{
        boolean status = false;
        if(!email.isEmpty() && !senha.isEmpty()) {
            String sql = ("SELECT * FROM Corretor WHERE email = ? AND senha = md5(?)");
            PreparedStatement preparador = this.conexao.prepareStatement(sql);
            preparador.setString(1, email);
            preparador.setString(2, senha);
            ResultSet rs = preparador.executeQuery();
            if(rs.next()){
                Corretor corretor = new Corretor();
                corretor.setNome(rs.getString("nome"));
                corretor.setEmail(rs.getString("email"));
                corretor.setSenha(rs.getString("senha"));
                corretor.setAtivo(rs.getInt("ativo"));
                status = true;
                registroLogin(corretor.getNome());
            }
            rs.close();
            preparador.close();
        }
        return status;
    }
}