package tela;

import dao.AgendaDAO;
import servico.Agenda;
import controle.Corretor;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class JPanelAgendaCorretor extends javax.swing.JPanel {

    private JTable tabela;
    private Corretor corretor;
    
    public JPanelAgendaCorretor(Corretor corretor) {
        
        this.corretor = corretor;
        setLayout(new BorderLayout());
        setBorder(BorderFactory.createTitledBorder("Meus Agendamentos"));

        tabela = new JTable();
        JScrollPane scrollPane = new JScrollPane(tabela);
        add(scrollPane, BorderLayout.CENTER);

        carregarAgendamentos();
    }

    private void carregarAgendamentos() {
        try {
            AgendaDAO dao = new AgendaDAO();
            ArrayList<Agenda> agendamentos = dao.listarAgendas(corretor.getId());

             String[] colunas = {
                "Cliente", "Tipo Atendimento", "Data", "Hora", "Status"
            };
            DefaultTableModel modelo = new DefaultTableModel(colunas, 0);
            DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm");

            for (Agenda ag : agendamentos) {
                String statusTexto = (ag.getStatus() == 1) ? "Agendado" : "Desmarcado";

                LocalDate data = LocalDate.parse(ag.getData_atendimento()); // String -> LocalDate
                LocalTime hora = LocalTime.parse(ag.getHora_atendimento()); // String -> LocalTime

                modelo.addRow(new Object[]{
                    ag.getNome_cliente(),
                    ag.getTipo_atendimento(),
                    data.format(dateFormatter),
                    hora.format(timeFormatter),
                    statusTexto
                });

            }

            tabela.setModel(modelo);
            tabela.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Erro ao carregar agendamentos: " + e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(71, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}
