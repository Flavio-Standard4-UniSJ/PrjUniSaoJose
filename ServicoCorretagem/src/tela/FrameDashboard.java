
package tela;

import controle.Cliente;
import controle.Corretor;
import dao.ClienteDAO;
import dao.CorretorDAO;
import dao.ImovelDAO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import servico.Acesso;
import servico.Imovel;
import servico.ManipulaImagem;

public class FrameDashboard extends javax.swing.JFrame {

    BufferedImage imagem;
    public FrameDashboard() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnSalvarDados = new javax.swing.JButton();
        cmbCategoriaImovel = new javax.swing.JComboBox<>();
        txtPreco = new javax.swing.JTextField();
        txtLocal = new javax.swing.JTextField();
        txtDescricao = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        btnSelecionaImagem = new javax.swing.JButton();
        lblImagem = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblCorretorLogado = new javax.swing.JLabel();
        mnPrincipal = new javax.swing.JMenuBar();
        mnSignUp = new javax.swing.JMenu();
        mnCorretor = new javax.swing.JMenu();
        mnCorretorAlterar = new javax.swing.JMenuItem();
        mnDesativarConta = new javax.swing.JMenuItem();
        mnCorretorNovoCliente = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("DASHBOARD");

        jLabel2.setText("Pesquisar Cliente");

        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        jLabel3.setText("Anunciar Imóvel");

        jLabel4.setText("Descrição");

        jLabel5.setText("Localidade");

        jLabel6.setText("Categoria");

        jLabel7.setText("Preço à vista");

        btnSalvarDados.setText("Salvar Dados");
        btnSalvarDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarDadosActionPerformed(evt);
            }
        });

        cmbCategoriaImovel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Apartamento", "Casa", "Terreno", "Imóvel na planta" }));

        txtDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescricaoActionPerformed(evt);
            }
        });

        jLabel8.setText("Selecionar Imagem");

        btnSelecionaImagem.setText("Selecionar Imagem");
        btnSelecionaImagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelecionaImagemActionPerformed(evt);
            }
        });

        lblImagem.setText("imagem");

        jLabel9.setText("Olá, ");

        mnSignUp.setText("Configurações");

        mnCorretor.setText("Corretor");

        mnCorretorAlterar.setText("alterar");
        mnCorretorAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnCorretorAlterarActionPerformed(evt);
            }
        });
        mnCorretor.add(mnCorretorAlterar);

        mnDesativarConta.setText("Desativar Conta");
        mnDesativarConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnDesativarContaActionPerformed(evt);
            }
        });
        mnCorretor.add(mnDesativarConta);

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(30, 30, 30)
                        .addComponent(txtNome)
                        .addGap(18, 18, 18)
                        .addComponent(btnPesquisar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnSalvarDados))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel8))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbCategoriaImovel, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtPreco)
                            .addComponent(txtLocal)
                            .addComponent(txtDescricao)
                            .addComponent(btnSelecionaImagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(40, 40, 40))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(145, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(99, 99, 99))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblCorretorLogado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(lblCorretorLogado, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisar))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtLocal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cmbCategoriaImovel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(btnSelecionaImagem))
                .addGap(18, 18, 18)
                .addComponent(lblImagem, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnSalvarDados)
                .addGap(32, 32, 32))
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

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        // TODO add your handling code here:
        String pesq = txtNome.getText();
        try {
            Cliente cliente = new Cliente();
            CorretorDAO corretorDAO = new CorretorDAO();
            ClienteDAO clienteDAO = new ClienteDAO();
            Cliente resultado = clienteDAO.pesquisarClienteNome(pesq);
            cliente.setNome(resultado.getNome());
            cliente.setSobrenome(resultado.getSobrenome());
            cliente.setNascimento(resultado.getNascimento());
            cliente.setEmail(resultado.getEmail());
            cliente.setTelefone(resultado.getTelefone());
            cliente.setProfissao(resultado.getProfissao());
            cliente.setSalario(resultado.getSalario());
            JOptionPane.showMessageDialog(null, "Nome: "+cliente.getNome()+"\nsobrenome: "+cliente.getSobrenome()+"\nTelefone: "+cliente.getTelefone()+"\nData de Nascimento: "+cliente.getNascimento()+"\ne-mail: "+cliente.getEmail()+"\nProfissão: "+ cliente.getProfissao()+"\nSalário: "+cliente.getSalario());
        } catch(SQLException ex) {
            ex.printStackTrace();
        } catch(Exception ex) {
            ex.getMessage();
        }
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void txtDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescricaoActionPerformed

    private void btnSalvarDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarDadosActionPerformed
        // TODO add your handling code here:
        try {
            Corretor corretor = new Corretor();
            int id_corretor = 5; //corretor.getId();
            
            Imovel imovel = new Imovel();
            
            imovel.setDescricao(txtDescricao.getText());
            imovel.setLocalidade(txtLocal.getText());
            imovel.setImovel_categoria((String) cmbCategoriaImovel.getSelectedItem());
            imovel.setPreco(Float.parseFloat(txtPreco.getText()));
            imovel.setId_corretor(id_corretor);
            
            //grava na pasta imagem localizada no servidor
            String caminhoImagem = getClass().getResource("../imagens/").toString().substring(5);
            File outputfile = new File(caminhoImagem+"imagem.jpg");
            ImageIO.write(imagem,"jpg",outputfile);
            
            JOptionPane.showMessageDialog(null, "imagem enviada com sucesso.");
            
            System.out.println(outputfile);
                    
            imovel.setImagem(ManipulaImagem.getImgBytes(imagem));
                     
            ImovelDAO imovelDAO = new ImovelDAO();
            imovelDAO.anunciaImovel(imovel);
         
        } catch(SQLException ex) {
            ex.printStackTrace();
        } catch(Exception ex) {
            ex.getMessage();
        }
    }//GEN-LAST:event_btnSalvarDadosActionPerformed

    private void btnSelecionaImagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelecionaImagemActionPerformed
        // TODO add your handling code here:
        JFileChooser fc = new JFileChooser();
        int res = fc.showOpenDialog(null);
        
        if(res == JFileChooser.APPROVE_OPTION){
            File arquivo = fc.getSelectedFile();
            try{
                System.out.println("ok cheguei aqui...");
                imagem = ManipulaImagem.setImagemDimensao(arquivo.getAbsolutePath(), 160,160);
                lblImagem.setIcon(new ImageIcon(imagem));
            }catch(Exception ex){
                ex.printStackTrace();
            }
        }else{
            JOptionPane.showMessageDialog(null, "Você não selecionou a imagem.");
        }
    }//GEN-LAST:event_btnSelecionaImagemActionPerformed

    private void mnDesativarContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnDesativarContaActionPerformed
        // TODO add your handling code here:
        Corretor corretor = new Corretor();
        CorretorDAO corretorDAO;
        Acesso acesso; 
        
        try {
            corretorDAO = new CorretorDAO();
            acesso = new Acesso();
            acesso.getNomeUsuario();
            corretorDAO.desativarContaCorretor(corretor);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível desativar sua conta, tente novamente mais tarde");
        }
        
    }//GEN-LAST:event_mnDesativarContaActionPerformed

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
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnSalvarDados;
    private javax.swing.JButton btnSelecionaImagem;
    private javax.swing.JComboBox<String> cmbCategoriaImovel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JLabel lblCorretorLogado;
    private javax.swing.JLabel lblImagem;
    private javax.swing.JMenu mnCorretor;
    private javax.swing.JMenuItem mnCorretorAlterar;
    private javax.swing.JMenuItem mnCorretorNovoCliente;
    private javax.swing.JMenuItem mnDesativarConta;
    private javax.swing.JMenuBar mnPrincipal;
    private javax.swing.JMenu mnSignUp;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtLocal;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPreco;
    // End of variables declaration//GEN-END:variables
}
