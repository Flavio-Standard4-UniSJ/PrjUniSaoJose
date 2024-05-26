
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import servico.Agenda;

public class AgendaDAO {
    private Connection conexao;
    
     public AgendaDAO() throws Exception {
        this.conexao = CriaConexao.getConexao();
    }
    
     public boolean agendamento(Agenda agenda, int id_corretor) throws SQLException {
        String sql = "INSERT INTO agenda (creci, tipo_atendimento, data_atendimento, hora_atendimento, nome_cliente, status, imovel_categoria, id_corretor) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement preparador = conexao.prepareStatement(sql);
        preparador.setString(1, agenda.getCreci());
        preparador.setString(2, agenda.getTipo_atendimento());
        preparador.setString(3, agenda.getData_atendimento());
        preparador.setString(4, agenda.getHora_atendimento());
        preparador.setString(5, agenda.getNome_cliente());
        preparador.setInt(6, agenda.getStatus());
        preparador.setString(7, agenda.getImovel_categoria());
        preparador.setInt(8, id_corretor);

        boolean rowInserted = preparador.executeUpdate() > 0;
        preparador.close();
        return rowInserted;
    }
    
     public ArrayList<Agenda> listarAgendas() throws SQLException {
        ArrayList<Agenda> listAgenda = new ArrayList<>();

        String sql = "SELECT * FROM agenda";

        PreparedStatement preparador = this.conexao.prepareStatement(sql);
        ResultSet resultSet = preparador.executeQuery(sql);

        while (resultSet.next()) {
            int codigo = resultSet.getInt("codigo");
            String creci = resultSet.getString("creci");
            String tipo_atendimento = resultSet.getString("tipo_atendimento");
            String data_atendimento = resultSet.getString("data_atendimento");
            String hora_atendimento = resultSet.getString("hora_atendimento");
            String nome_cliente = resultSet.getString("nome_cliente");
            int status = resultSet.getInt("status");
            String imovel_categoria = resultSet.getString("imovel_categoria");

            Agenda agenda = new Agenda();
            agenda.setCodigo(codigo);
            agenda.setCreci(creci);
            agenda.setTipo_atendimento(tipo_atendimento);
            agenda.setData_atendimento(data_atendimento);
            agenda.setHora_atendimento(hora_atendimento);
            agenda.setNome_cliente(nome_cliente);
            agenda.setStatus(status);
            agenda.setImovel_categoria(imovel_categoria);

            listAgenda.add(agenda);
        }

        resultSet.close();
        preparador.close();

        return listAgenda;
    }
     
      public boolean desmarcarAgendamento(Agenda agenda) throws SQLException {
        String sql = "DELETE FROM agenda where codigo = ?";
        PreparedStatement preparador = conexao.prepareStatement(sql);
        preparador.setInt(1, agenda.getCodigo());

        boolean rowDeleted = preparador.executeUpdate() > 0;
        preparador.close();
        return rowDeleted;
    }
      
    public boolean mudarAgendamento(Agenda agenda) throws SQLException {
        String sql = "UPDATE agenda SET creci = ?, tipo_atendimento = ?, data_atendimento = ?, hora_atendimento = ?, nome_cliente = ?, status = ?, imovel_categoria = ? WHERE codigo = ?";
        PreparedStatement preparador = conexao.prepareStatement(sql);
        preparador.setString(1, agenda.getCreci());
        preparador.setString(2, agenda.getTipo_atendimento());
        preparador.setString(3, agenda.getData_atendimento());
        preparador.setString(4, agenda.getHora_atendimento());
        preparador.setString(5, agenda.getNome_cliente());
        preparador.setInt(6, agenda.getStatus());
        preparador.setString(7, agenda.getImovel_categoria());
        preparador.setInt(8, agenda.getCodigo());

        boolean rowUpdated = preparador.executeUpdate() > 0;
        preparador.close();
        return rowUpdated;
    }  

    public Agenda verAgenda(int codigo) throws SQLException {
        Agenda agenda = null;
        String sql = "SELECT * FROM agenda WHERE codigo = ?";

        PreparedStatement statement = conexao.prepareStatement(sql);
        statement.setInt(1, codigo);

        ResultSet resultSet = statement.executeQuery();

        if (resultSet.next()) {
            String creci = resultSet.getString("creci");
            String tipo_atendimento = resultSet.getString("tipo_atendimento");
            String data_atendimento = resultSet.getString("data_atendimento");
            String hora_atendimento = resultSet.getString("hora_atendimento");
            String nome_cliente = resultSet.getString("nome_cliente");
            int status = resultSet.getInt("status");
            String imovel_categoria = resultSet.getString("imovel_categoria");

            agenda = new Agenda();
            agenda.setCodigo(codigo);
            agenda.setCreci(creci);
            agenda.setTipo_atendimento(tipo_atendimento);
            agenda.setData_atendimento(data_atendimento);
            agenda.setHora_atendimento(hora_atendimento);
            agenda.setNome_cliente(nome_cliente);
            agenda.setStatus(status);
            agenda.setImovel_categoria(imovel_categoria);
        }

        resultSet.close();
        statement.close();

        return agenda;
    }
}
