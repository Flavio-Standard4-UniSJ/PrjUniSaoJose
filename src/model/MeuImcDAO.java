package model;

import control.MeuIMC;
import dao.CriaConexao;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class MeuImcDAO {
    private Connection conexao;

    public MeuImcDAO() throws Exception {
        this.conexao = CriaConexao.getConexao();
    }
 
    public void cadastrarIMC(MeuIMC meuIMC) throws SQLException {
        String sql = "INSERT INTO usuario (nome, nascimento, peso, altura, imc, resultado) values (?, ?, ?, ?, ?, ?)";
        PreparedStatement preparador = conexao.prepareStatement(sql);
        preparador.setString(1, meuIMC.getNome());
        preparador.setString(2, meuIMC.getNascimento());
        preparador.setFloat(3, meuIMC.getPeso());
        preparador.setFloat(4, meuIMC.getAltura());
        preparador.setFloat(5, meuIMC.getImc());
        preparador.setString(6, meuIMC.getResultado());
        preparador.execute();
        preparador.close();
        System.out.println("Cadastrado com sucesso");
    
    }
    
    public MeuIMC pesquisarUsuarioIMC(int id) throws SQLException {
        MeuIMC m = new MeuIMC();
        String sql = "SELECT * FROM usuario WHERE id = ?";
        PreparedStatement preparador = this.conexao.prepareStatement(sql);       
        preparador.setInt(1, id);
        ResultSet rs = preparador.executeQuery();
        if(rs.next()){
            m.setNome(rs.getString("nome"));
            m.setNascimento(rs.getString("nascimento"));
            m.setPeso(rs.getFloat("peso"));
            m.setAltura(rs.getFloat("altura"));
            m.setImc(rs.getFloat("imc"));
            m.setResultado(rs.getString("resultado"));
        }else{
            JOptionPane.showMessageDialog(null, "nenhum usuário foi encontrado.");
            m = null;    
        }
        rs.close();
        preparador.close();
        return m;
    }
    
    public void atualizaIMC(MeuIMC meuIMC) throws SQLException {
        String sql = "UPDATE usuario SET peso = ?, altura = ?, imc = ?, resultado = ? WHERE id = ?";
        PreparedStatement preparador = conexao.prepareStatement(sql);
        preparador.setFloat(1, meuIMC.getPeso());
        preparador.setFloat(2, meuIMC.getAltura());
        preparador.setFloat(3, meuIMC.getImc());
        preparador.setString(4, meuIMC.getResultado());
        preparador.setInt(5, meuIMC.getId());
        preparador.execute();
        preparador.close();
        System.out.println("executado a atualização do IMC");
    }
    
    public void excluirUsuario(int id) throws SQLException {
        String sql = "DELETE FROM usuario WHERE id = ?";
        PreparedStatement preparador = conexao.prepareStatement(sql);
        preparador.setInt(1, id);
        preparador.execute();
        preparador.close();
    }
}
