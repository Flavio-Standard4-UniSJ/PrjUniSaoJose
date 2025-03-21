package model;

import control.MeuIMC;
import dao.CriaConexao;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;

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
    
}
