
package tela;

import controle.Corretor;

public class FrameDashboard extends javax.swing.JFrame {

    public FrameDashboard() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        mnPrincipal = new javax.swing.JMenuBar();
        mnSignUp = new javax.swing.JMenu();
        mnCorretor = new javax.swing.JMenu();
        mnCorretorAlterar = new javax.swing.JMenuItem();
        mnCorretorNovoCliente = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("DASHBOARD");

        mnSignUp.setText("Configurações");

        mnCorretor.setText("Corretor");

        mnCorretorAlterar.setText("alterar");
        mnCorretorAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnCorretorAlterarActionPerformed(evt);
            }
        });
        mnCorretor.add(mnCorretorAlterar);

        mnCorretorNovoCliente.setText("cliente");
        mnCorretorNovoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnCorretorNovoClienteActionPerformed(evt);
            }
        });
        mnCorretor.add(mnCorretorNovoCliente);

        mnSignUp.add(mnCorretor);

        mnPrincipal.add(mnSignUp);

        jMenu2.setText("Imoveis");
        mnPrincipal.add(jMenu2);

        setJMenuBar(mnPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addContainerGap(319, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addContainerGap(485, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnCorretorAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnCorretorAlterarActionPerformed
        // TODO add your handling code here:
        FrameAlterarCorretor alterar = new FrameAlterarCorretor();
        alterar.setVisible(true);
    }//GEN-LAST:event_mnCorretorAlterarActionPerformed

    private void mnCorretorNovoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnCorretorNovoClienteActionPerformed
        // TODO add your handling code here:
        FrameNovoCliente cliente = new FrameNovoCliente();
        cliente.setVisible(true);
    }//GEN-LAST:event_mnCorretorNovoClienteActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrameDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu mnCorretor;
    private javax.swing.JMenuItem mnCorretorAlterar;
    private javax.swing.JMenuItem mnCorretorNovoCliente;
    private javax.swing.JMenuBar mnPrincipal;
    private javax.swing.JMenu mnSignUp;
    // End of variables declaration//GEN-END:variables
}
