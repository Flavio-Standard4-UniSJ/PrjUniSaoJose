
package tela;
import controle.Corretor;
import javax.swing.JFrame;
import java.awt.BorderLayout;

public class FrameAgendamentosCorretor extends javax.swing.JFrame {

    public FrameAgendamentosCorretor(Corretor corretor) {
        setTitle("Agendamentos do Corretor");
        setSize(800, 600);
        setLocationRelativeTo(null); // Centraliza a janela na tela
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Fecha só esta janela

        // Cria o painel de agendamentos, passando o corretor
        JPanelAgendaCorretor painelAgendamentos = new JPanelAgendaCorretor(corretor);

        // Adiciona o painel no centro do JFrame
        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(painelAgendamentos, BorderLayout.CENTER);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
