
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
        PreparedStatement preparador = this.conexao.prepareStatement(sql);
        preparador.setString(1, agenda.getCreci());
        preparador.setString(2, agenda.getTipo_atendimento());
        preparador.setString(3, agenda.getData_atendimento());
        preparador.setString(4, agenda.getHora_atendimento());
        preparador.setString(5, agenda.getNome_cliente() + " " + agenda.getSobrenome_cliente());
        preparador.setInt(6, agenda.getStatus());
        preparador.setString(7, agenda.getImovel_categoria());
        preparador.setInt(8, id_corretor);

        boolean rowInserted = preparador.executeUpdate() > 0;
        preparador.close();
        return rowInserted;
    }
    
    public ArrayList<Agenda> listarAgendas(int id_corretor) throws SQLException {
        ArrayList<Agenda> listAgenda = new ArrayList<>();

        String sql = "SELECT * FROM agenda WHERE id_corretor = ?";
        PreparedStatement preparador = this.conexao.prepareStatement(sql);
        preparador.setInt(1, id_corretor);
        ResultSet resultSet = preparador.executeQuery();

        while (resultSet.next()) {
            Agenda agenda = new Agenda();
            agenda.setCodigo(resultSet.getInt("codigo_agendamento"));
            agenda.setCreci(resultSet.getString("creci"));
            agenda.setTipo_atendimento(resultSet.getString("tipo_atendimento"));
            agenda.setData_atendimento(resultSet.getString("data_atendimento"));
            agenda.setHora_atendimento(resultSet.getString("hora_atendimento"));
            agenda.setNome_cliente(resultSet.getString("nome_cliente"));
            agenda.setStatus(resultSet.getInt("status"));
            agenda.setImovel_categoria(resultSet.getString("imovel_categoria"));
            listAgenda.add(agenda);
        }

        resultSet.close();
        preparador.close();
        return listAgenda;
    }

      public boolean desmarcarAgendamento(Agenda agenda,int id_corretor) throws SQLException {
        String sql = "UPDATE agenda SET status = 0 where codigo_agendamento = ? AND  id_corretor=?";
        PreparedStatement preparador = this.conexao.prepareStatement(sql);
        preparador.setInt(1, agenda.getCodigo());
        preparador.setInt(2, id_corretor);

        boolean rowDeleted = preparador.executeUpdate() > 0;
        preparador.close();
        return rowDeleted;
    }
      
    public boolean mudarAgendamento(Agenda agenda, int id_corretor) throws SQLException {
        String sql = "UPDATE agenda SET creci = ?, tipo_atendimento = ?, data_atendimento = ?, hora_atendimento = ?, nome_cliente = ?, status = ?, imovel_categoria = ? WHERE codigo_agendamento = ? AND id_corretor = ?";
        PreparedStatement preparador = this.conexao.prepareStatement(sql);
        preparador.setString(1, agenda.getCreci());
        preparador.setString(2, agenda.getTipo_atendimento());
        preparador.setString(3, agenda.getData_atendimento());
        preparador.setString(4, agenda.getHora_atendimento());
        preparador.setString(5, agenda.getNome_cliente()+" "+agenda.getSobrenome_cliente());
        preparador.setInt(6, agenda.getStatus());
        preparador.setString(7, agenda.getImovel_categoria());
        preparador.setInt(8, agenda.getCodigo());
        preparador.setInt(9, id_corretor);

        boolean rowUpdated = preparador.executeUpdate() > 0;
        
        System.out.println(rowUpdated);
        
        preparador.close();
        return rowUpdated;
    }  

    public Agenda verAgenda(int codigo) throws SQLException {
        String sql = "SELECT nome_cliente, data_atendimento, hora_atendimento, tipo_atendimento, imovel_categoria FROM agenda WHERE codigo_agendamento = ?";
        PreparedStatement stmt = this.conexao.prepareStatement(sql);
        stmt.setInt(1, codigo);
        ResultSet rs = stmt.executeQuery();

        if (rs.next()) {
            Agenda agenda = new Agenda();
            agenda.setNome_cliente(rs.getString("nome_cliente"));
            agenda.setData_atendimento(rs.getString("data_atendimento"));
            agenda.setHora_atendimento(rs.getString("hora_atendimento"));
            agenda.setTipo_atendimento(rs.getString("tipo_atendimento"));
            agenda.setImovel_categoria(rs.getString("imovel_categoria"));
            return agenda;
        } else {
            return null;
        }
    }
}
