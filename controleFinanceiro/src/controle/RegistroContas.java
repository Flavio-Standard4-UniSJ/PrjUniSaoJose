
package controle;

import controle.usuario.UsuarioConta;
import dao.UsuarioContaDAO;
import java.sql.SQLException;


public class RegistroContas extends javax.swing.JFrame {


    public RegistroContas() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnRegistrarContas = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtCpf = new javax.swing.JTextField();
        txtDataPagamento = new javax.swing.JTextField();
        txtDataVencimento = new javax.swing.JTextField();
        txtValor = new javax.swing.JTextField();
        txtDescricao = new javax.swing.JTextField();
        barraMenu = new javax.swing.JMenuBar();
        mnUsuario = new javax.swing.JMenu();
        itemMenuUsuarios = new javax.swing.JMenu();
        cadastrarUsuario = new javax.swing.JMenuItem();
        loginUsuario = new javax.swing.JMenuItem();
        registroContas = new javax.swing.JMenu();
        novaConta = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Registrar Contas");

        jLabel2.setText("descrição:");

        jLabel3.setText("valor:");

        jLabel4.setText("data vencimento:");

        jLabel5.setText("data pagamento:");

        btnRegistrarContas.setText("registrar");
        btnRegistrarContas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarContasActionPerformed(evt);
            }
        });

        jLabel6.setText("CPF titular conta:");

        txtDataPagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDataPagamentoActionPerformed(evt);
            }
        });

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnRegistrarContas))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCpf)
                            .addComponent(txtDataPagamento)
                            .addComponent(txtDataVencimento, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                            .addComponent(txtValor)
                            .addComponent(txtDescricao))))
                .addGap(28, 28, 28))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtDataVencimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtDataPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                        .addComponent(btnRegistrarContas)
                        .addGap(27, 27, 27))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cadastrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarUsuarioActionPerformed
        // TODO add your handling code here:
        RegistroUsuario registro = new RegistroUsuario();
        registro.setVisible(true);
    }//GEN-LAST:event_cadastrarUsuarioActionPerformed

    private void loginUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginUsuarioActionPerformed
        // TODO add your handling code here:
        Login login = new Login();
        login.setVisible(true);
    }//GEN-LAST:event_loginUsuarioActionPerformed

    private void novaContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novaContaActionPerformed
        // TODO add your handling code here:
        RegistroContas contas = new RegistroContas();
        contas.setVisible(true);
    }//GEN-LAST:event_novaContaActionPerformed

    private void registroContasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registroContasActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_registroContasActionPerformed

    private void txtDataPagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDataPagamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDataPagamentoActionPerformed

    private void btnRegistrarContasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarContasActionPerformed
        // TODO add your handling code here:
        UsuarioConta conta = new UsuarioConta();
        conta.descricao=txtDescricao.getText();
        conta.valor=Float.parseFloat(txtValor.getText());
        conta.dataVencimento=txtDataVencimento.getText();
        conta.dataPagamento=txtDataPagamento.getText();
        conta.cpf=txtCpf.getText();
        conta.status=0; //0 - conta aberta 1 - baixa na conta
        try {
            UsuarioContaDAO usuarioContaDAO = new UsuarioContaDAO();
            usuarioContaDAO.inserir(conta);
        } catch(SQLException ex) {
            ex.printStackTrace();
        } catch(Exception ex) {
            ex.getMessage();
        }
    }//GEN-LAST:event_btnRegistrarContasActionPerformed

   
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
            java.util.logging.Logger.getLogger(RegistroContas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroContas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroContas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroContas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroContas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JButton btnRegistrarContas;
    private javax.swing.JMenuItem cadastrarUsuario;
    private javax.swing.JMenu itemMenuUsuarios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenuItem loginUsuario;
    private javax.swing.JMenu mnUsuario;
    private javax.swing.JMenuItem novaConta;
    private javax.swing.JMenu registroContas;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JTextField txtDataPagamento;
    private javax.swing.JTextField txtDataVencimento;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
