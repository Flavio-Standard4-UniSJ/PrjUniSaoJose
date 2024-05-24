/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tela;

import controle.Corretor;
import dao.ImovelDAO;
import java.sql.SQLException;
import javax.swing.JButton;
import javax.swing.JFrame;
import servico.Imovel;

/**
 *
 * @author Samsung
 */
public class FrameImovel extends javax.swing.JFrame {
    
    private Corretor corretor;
    
    public FrameImovel() {
        this.corretor=corretor;
        initComponents();
    }

    FrameImovel(Corretor corretor) {
        this.corretor=corretor;
        initComponents();
        customInitComponents();
        setTitle("Tela Imóvel");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null); // Centraliza a janela
        setLayout(null);
    }

    private void customInitComponents() {
        // Aqui você pode adicionar código para configurar os componentes
        // com base no objeto corretor, por exemplo:
        // Adiciona o ActionListener ao botão
       // Exemplo de uso do objeto corretor
        if (corretor != null) {
            System.out.println("Corretor: " + corretor.getNome() + ", ID: " + corretor.getId());
        } else {
            // Lida com o caso de corretor ser null
            System.out.println("Corretor não fornecido."+corretor.getId());
        }
       
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtPreco = new javax.swing.JTextField();
        btnUpdateAnuncioImovel = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtDescricaoImovel = new javax.swing.JTextField();
        btnExcluirAnuncioImovel = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtDescricao = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Tela Imóvel");

        jLabel2.setText("Preço:");

        txtPreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecoActionPerformed(evt);
            }
        });

        btnUpdateAnuncioImovel.setText("Atualizar Dados");
        btnUpdateAnuncioImovel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateAnuncioImovelActionPerformed(evt);
            }
        });

        jLabel3.setText("Descrição do Imóvel");

        btnExcluirAnuncioImovel.setText("Excluir");
        btnExcluirAnuncioImovel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirAnuncioImovelActionPerformed(evt);
            }
        });

        jLabel4.setText("imóvel");

        jLabel5.setText("descrição");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnUpdateAnuncioImovel)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(25, 25, 25)
                                    .addComponent(jLabel3))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(51, 51, 51)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel5))))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(31, 31, 31)
                                    .addComponent(txtDescricaoImovel, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btnExcluirAnuncioImovel, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(16, 16, 16)
                                        .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(btnUpdateAnuncioImovel)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtDescricaoImovel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluirAnuncioImovel))
                .addGap(34, 34, 34)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExcluirAnuncioImovelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirAnuncioImovelActionPerformed
        int id_corretor = corretor.getId();
        String descricao = txtDescricaoImovel.getText();
        try {
            Imovel imovel = new Imovel();
            ImovelDAO imovelDAO = new ImovelDAO();
            System.out.println("Estou para executar exclusão de anuncio");
            imovelDAO.excluirAnuncioImovel(descricao, id_corretor);
            System.out.println("exclui o anuncio "+descricao+" informado");
        } catch (SQLException e) {
           e.printStackTrace(); 
        } catch(Exception ex){
            ex.getMessage();
        }
    }//GEN-LAST:event_btnExcluirAnuncioImovelActionPerformed

    private void btnUpdateAnuncioImovelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateAnuncioImovelActionPerformed
        //int id_corretor = corretor.getId();
        //System.out.println("ID: "+id_corretor+" - corretor id: "+ corretor.getId());
        int id_corretor = corretor.getId();
        String descricao = txtDescricao.getText();
        float preco = Float.parseFloat(txtPreco.getText());
        try {
            Imovel imovel = new Imovel();
            ImovelDAO imovelDAO = new ImovelDAO();
            imovelDAO.alterarAnuncioImovel(preco, descricao, id_corretor);
            System.out.println("passei aqui no botão atualizar");
        } catch (SQLException e) {
           e.printStackTrace();
        } catch(Exception ex){
            ex.getMessage();
        }
    }//GEN-LAST:event_btnUpdateAnuncioImovelActionPerformed

    private void txtPrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecoActionPerformed

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
            java.util.logging.Logger.getLogger(FrameImovel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameImovel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameImovel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameImovel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameImovel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExcluirAnuncioImovel;
    private javax.swing.JButton btnUpdateAnuncioImovel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtDescricaoImovel;
    private javax.swing.JTextField txtPreco;
    // End of variables declaration//GEN-END:variables
}