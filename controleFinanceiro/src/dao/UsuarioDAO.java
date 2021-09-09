package dao;

import controle.usuario.Acesso;
import controle.usuario.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class UsuarioDAO {
    private Connection conexao;

    public UsuarioDAO() throws Exception {
        this.conexao = CriaConexao.getConexao();
    }
    public void inserir(Usuario usuario) throws SQLException{
        String sql = "INSERT INTO usuario (nome, email, senha, cpf, telefone, registroLar, endereco) VALUES (?,?, md5(?),?,?, ?,?)";
        PreparedStatement preparador = conexao.prepareStatement(sql);
        preparador.setString(1, usuario.getNome());
        preparador.setString(2, usuario.getEmail());
        preparador.setString(3, usuario.getSenha());
        preparador.setString(4, usuario.getCpf());
        preparador.setString(5, usuario.getTelefone());
        preparador.setString(6, usuario.registroLar);
        preparador.setString(7, usuario.endereco);
        
        preparador.execute();
        preparador.close();
        System.out.println("Cadastrado com sucesso");
        registroLogin(usuario.getNome(), usuario.registroLar);
    }

    public void registroLogin(String nome_usuario, String registroLar) throws SQLException {
        String sql = "INSERT INTO acesso (nome_usuario, registroLar, data_acesso, hora_acesso) VALUES (?, ?, ?, ?)";
        Acesso acesso = new Acesso();
        PreparedStatement preparador = conexao.prepareStatement(sql);
        preparador.setString(1, nome_usuario);
        preparador.setString(2, registroLar);
        preparador.setString(3, acesso.getDataAcesso());
        preparador.setString(4, acesso.getHoraAcesso());
        preparador.execute();
        preparador.close();
    }
    
    public void remover(String nome) throws Exception{
        String sql = ("DELETE FROM usuario WHERE nome = '"+nome+"'");
        PreparedStatement preparador = this.conexao.prepareStatement(sql);
        preparador.execute();
        preparador.close();
    }
    
    public void atualizar(Usuario usu) throws Exception{
        String sql = "UPDATE usuario set email=?, senha=md5(?) WHERE nome = ?";        
        PreparedStatement preparador = this.conexao.prepareStatement(sql);
        preparador.setString(1, usu.getEmail());
        preparador.setString(2, usu.getSenha());
        preparador.setString(3, usu.getNome());
        preparador.execute();
        preparador.close();
    }
    
    public Usuario consultarUsuarioNome(String nome) throws Exception{
        Usuario usu = new Usuario();
        String sql = ("SELECT * FROM usuario WHERE nome = ?");
        PreparedStatement preparador = this.conexao.prepareStatement(sql);
        preparador.setString(1, nome);
        ResultSet rs = preparador.executeQuery();
        if(rs.next()){
            usu.setNome(rs.getString("nome"));
            usu.setEmail(rs.getString("email"));
            usu.setSenha(rs.getString("senha"));
            rs.close();
            preparador.close();
        }
        return usu; 
    }
    
    public Usuario acessarContaUsuario(String email, String senha) throws Exception{
        Usuario usu = new Usuario();
        String sql = ("SELECT * FROM usuario WHERE email = ? AND senha = md5(?)");
        PreparedStatement preparador = this.conexao.prepareStatement(sql);
        preparador.setString(1, email);
        preparador.setString(2, senha);
        ResultSet rs = preparador.executeQuery();
        if(rs.next()){
            usu.setNome(rs.getString("nome"));
            usu.setEmail(rs.getString("email"));
            usu.setSenha(rs.getString("senha"));
            System.out.println("Seja bem vindo "+usu.getNome());
            rs.close();
            preparador.close();
        }
        return usu; 
    }
}