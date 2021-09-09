package dao;

import controle.usuario.Usuario;
import controle.usuario.UsuarioConta;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class UsuarioContaDAO {
    private Connection conexao;
    
    public UsuarioContaDAO() throws Exception {
        this.conexao = CriaConexao.getConexao();
    }
 
      public void inserir(UsuarioConta conta) throws SQLException{
        String sql = "INSERT INTO usuarioConta (descricao, valor, data_vencimento, data_pagamento, cpf, status) VALUES (?,?,?,?,?,?)";
        PreparedStatement preparador = conexao.prepareStatement(sql);
        preparador.setString(1, conta.getDescricao());
        preparador.setFloat(2, conta.getValor());
        preparador.setString(3, conta.getDataVencimento());
        preparador.setString(4, conta.getDataPagamento());
        preparador.setString(5, conta.getCpf());
        preparador.setInt(6, conta.getStatus());
        preparador.execute();
        preparador.close();
        System.out.println("Nova conta cadastrada");
    }
}
