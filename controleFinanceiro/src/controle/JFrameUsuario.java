
package controle;

public class JFrameUsuario extends javax.swing.JFrame {

    public JFrameUsuario() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        barraMenu = new javax.swing.JMenuBar();
        mnUsuario = new javax.swing.JMenu();
        itemMenuUsuarios = new javax.swing.JMenu();
        cadastrarUsuario = new javax.swing.JMenuItem();
        loginUsuario = new javax.swing.JMenuItem();
        registroContas = new javax.swing.JMenu();
        novaConta = new javax.swing.JMenuItem();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Principal");

        mnUsuario.setText("Usuario");

        itemMenuUsuarios.setText("usuarios");

        cadastrarUsuario.setText("cadastrar");
        cadastrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarUsuarioActionPerformed(evt);
            }
        });
        itemMenuUsuarios.add(cadastrarUsuario);

        loginUsuario.setText("login");
        loginUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginUsuarioActionPerformed(evt);
            }
        });
        itemMenuUsuarios.add(loginUsuario);

        mnUsuario.add(itemMenuUsuarios);

        barraMenu.add(mnUsuario);

        registroContas.setText("Contas");
        registroContas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registroContasActionPerformed(evt);
            }
        });

        novaConta.setText("novo");
        novaConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novaContaActionPerformed(evt);
            }
        });
        registroContas.add(novaConta);

        barraMenu.add(registroContas);

        setJMenuBar(barraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(jLabel1)
                .addContainerGap(201, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(jLabel1)
                .addContainerGap(161, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registroContasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registroContasActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_registroContasActionPerformed

    private void loginUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginUsuarioActionPerformed
        // TODO add your handling code here:
        Login login = new Login();
        login.setVisible(true);
    }//GEN-LAST:event_loginUsuarioActionPerformed

    private void cadastrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarUsuarioActionPerformed
        // TODO add your handling code here:
        RegistroUsuario registro = new RegistroUsuario();
        registro.setVisible(true);
    }//GEN-LAST:event_cadastrarUsuarioActionPerformed

    private void novaContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novaContaActionPerformed
        // TODO add your handling code here:
        RegistroContas contas = new RegistroContas();
        contas.setVisible(true);
    }//GEN-LAST:event_novaContaActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new JFrameUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JMenuItem cadastrarUsuario;
    private javax.swing.JMenu itemMenuUsuarios;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuItem loginUsuario;
    private javax.swing.JMenu mnUsuario;
    private javax.swing.JMenuItem novaConta;
    private javax.swing.JMenu registroContas;
    // End of variables declaration//GEN-END:variables
}
