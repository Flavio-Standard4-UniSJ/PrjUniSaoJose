package dao;

import controle.Cliente;
import controle.Corretor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import servico.Acesso;

public class ClienteDAO {
    private Connection conexao;

    public ClienteDAO() throws Exception {
        this.conexao = CriaConexao.getConexao();
    }
    public void cadastrarCliente(Cliente cliente, int id) throws SQLException{
        String sql = "INSERT INTO Cliente (nome, sobrenome, nascimento, cpf,  email, identidade, telefone, profissao, salario, id_corretor) VALUES (?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement preparador = conexao.prepareStatement(sql);
        preparador.setString(1, cliente.getNome());
        preparador.setString(2, cliente.getSobrenome());
        preparador.setString(3, cliente.getNascimento());
        preparador.setString(4, cliente.getCpf());
        preparador.setString(5, cliente.getEmail());
        preparador.setString(6, cliente.getIdentidade());
        preparador.setString(7, cliente.getTelefone());
        preparador.setString(8, cliente.getProfissao());
        preparador.setFloat(9, cliente.getSalario());
        preparador.setInt(10, id);
        preparador.execute();
        preparador.close();
        System.out.println("Cadastrado com sucesso");
    }

    public void excluirCliente(String nome) throws Exception{
        String sql = ("DELETE FROM Cliente WHERE nome = '"+nome+"'");
        PreparedStatement preparador = this.conexao.prepareStatement(sql);
        preparador.execute();
        preparador.close();
    }
    
    public void alterarCliente(Cliente cliente) throws Exception{
        String sql = "UPDATE Cliente SET email=?, telefone=?, profissao=?, salario=? WHERE nome = ?";        
        PreparedStatement preparador = this.conexao.prepareStatement(sql);
        preparador.setString(1, cliente.getEmail());
        preparador.setString(2, cliente.getTelefone());
        preparador.setString(3, cliente.getNome());
        preparador.execute();
        preparador.close();
    }
    
    public Cliente pesquisarClienteNome(String nome) throws Exception{
        Cliente cliente = new Cliente();
        String sql = ("SELECT * FROM Cliente WHERE nome = ?");
        PreparedStatement preparador = this.conexao.prepareStatement(sql);
        preparador.setString(1, nome);
        ResultSet rs = preparador.executeQuery();
        if(rs.next()){
            cliente.setNome(rs.getString("nome"));
            cliente.setSobrenome(rs.getString("sobrenome"));
            cliente.setNascimento(rs.getString("nascimento"));
            cliente.setEmail(rs.getString("email"));
            cliente.setTelefone(rs.getString("telefone"));
            cliente.setProfissao(rs.getString("profissao"));
            cliente.setSalario(rs.getFloat("salario"));
            rs.close();
            preparador.close();
        }
        return cliente; 
    }
}
