
package tela;
import controle.Cliente;
import dao.ClienteDAO;
import controle.Corretor;
import dao.CorretorDAO;
import dao.ImovelDAO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import servico.Acesso;
import servico.Imovel;
import servico.ManipulaImagem;

public class FrameDashboard extends javax.swing.JFrame {

   BufferedImage imagem; //tipo variavel armazena imagem em bytes 
    private Corretor corretor;
      
    public FrameDashboard(Corretor corretor) {
        this.corretor = corretor;
        initComponents();
        customInitComponents();
    }
    
    public FrameDashboard() {
        initComponents();
    } 
    
    private void customInitComponents() {
        // Aqui você pode adicionar código para configurar os componentes
        // com base no objeto corretor, por exemplo:
        lblCorretorLogado.setText("Bem-vindo, " + corretor.getNome());
        // Adicione outras configurações que dependem do objeto corretor aqui
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtDescricao = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtLocal = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cmbCategoriaImovel = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        txtPreco = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        btnSelecionaImagem = new javax.swing.JButton();
        lblImagem = new javax.swing.JLabel();
        btnSalvarDados = new javax.swing.JButton();
        lblCorretorLogado = new javax.swing.JLabel();
        btnListar = new javax.swing.JButton();
        mnPrincipal = new javax.swing.JMenuBar();
        mnSignUp = new javax.swing.JMenu();
        mnCorretor = new javax.swing.JMenu();
        mnCorretorAlterar = new javax.swing.JMenuItem();
        mnDesativarConta = new javax.swing.JMenuItem();
        mnCorretorNovoCliente = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("DASHBOARD");

        jLabel9.setText("Olá, ");

        jLabel2.setText("Pesquisar Cliente");

        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        jLabel3.setText("Anunciar Imóvel");

        jLabel4.setText("Descrição");

        txtDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescricaoActionPerformed(evt);
            }
        });

        jLabel5.setText("Localidade");

        jLabel6.setText("Categoria");

        cmbCategoriaImovel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Apartamento", "Casa", "Terreno", "Imóvel na planta" }));

        jLabel7.setText("Preço à vista");

        jLabel8.setText("Selecionar Imagem");

        btnSelecionaImagem.setText("Selecionar Imagem");
        btnSelecionaImagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelecionaImagemActionPerformed(evt);
            }
        });

        lblImagem.setText("imagem");

        btnSalvarDados.setText("Salvar Dados");
        btnSalvarDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarDadosActionPerformed(evt);
            }
        });

        btnListar.setText("Listar");
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });

        mnSignUp.setText("Configurações");

        mnCorretor.setText("Corretor");

        mnCorretorAlterar.setText("alterar dados");
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

        mnCorretorNovoCliente.setText("novo cliente");
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblCorretorLogado, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnSalvarDados))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 178, Short.MAX_VALUE)
                                .addComponent(lblImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(59, 59, 59))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel2))
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbCategoriaImovel, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtPreco)
                                    .addComponent(txtLocal)
                                    .addComponent(txtDescricao)
                                    .addComponent(btnSelecionaImagem, javax.swing.GroupLayout.DEFAULT_SIZE, 395, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel9)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(btnPesquisar)
                                                .addGap(18, 18, 18)
                                                .addComponent(btnListar)))
                                        .addGap(0, 0, Short.MAX_VALUE)))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel9))
                    .addComponent(lblCorretorLogado, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisar)
                    .addComponent(btnListar))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                .addComponent(lblImagem, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnSalvarDados)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnCorretorAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnCorretorAlterarActionPerformed
        FrameAlterarCorretor alterar = new FrameAlterarCorretor();
        alterar.setVisible(true);
    }//GEN-LAST:event_mnCorretorAlterarActionPerformed

    private void mnDesativarContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnDesativarContaActionPerformed
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

    private void mnCorretorNovoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnCorretorNovoClienteActionPerformed
        FrameNovoCliente cliente = new FrameNovoCliente();
        cliente.setVisible(true);
    }//GEN-LAST:event_mnCorretorNovoClienteActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
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

    private void btnSelecionaImagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelecionaImagemActionPerformed
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

    private void btnSalvarDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarDadosActionPerformed
        try {
            Corretor corretor = new Corretor();
            int id_corretor = 1; //corretor.getId();
            Imovel imovel = new Imovel();
            imovel.setDescricao(txtDescricao.getText());
            imovel.setLocalidade(txtLocal.getText());
            imovel.setImovel_categoria((String) cmbCategoriaImovel.getSelectedItem());
            imovel.setPreco(Float.parseFloat(txtPreco.getText()));
            imovel.setId_corretor(id_corretor);
            
            //grava na pasta imagem localizada no servidor
            //String caminhoImagem = getClass().getResource("../imagens/").toString().substring(5);
            //File outputfile = new File(caminhoImagem+"imagem.jpg");
            //ImageIO.write(imagem,"jpg",outputfile);
            //JOptionPane.showMessageDialog(null, "imagem enviada com sucesso.");
            //System.out.println(outputfile);

            imovel.setImagem(ManipulaImagem.getImgBytes(imagem));

            ImovelDAO imovelDAO = new ImovelDAO();
            imovelDAO.anunciaImovel(imovel);

        } catch(SQLException ex) {
            ex.printStackTrace();
        } catch(Exception ex) {
            ex.getMessage();
        }
    }//GEN-LAST:event_btnSalvarDadosActionPerformed

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
        try {
            Corretor corretor = new Corretor();
            Cliente cliente = new Cliente();
            ClienteDAO clienteDAO = new ClienteDAO();
            corretor.setId(0);
            System.out.println(corretor.getId());
            ArrayList<Cliente> lista = clienteDAO.listarClientes(corretor.getId()); 
            System.out.println(lista);
            for (int i = 0; i < lista.size(); i++) {
                System.out.printf("Posição %d- %s\n",i,lista.get(i));
            }
            
        } catch(SQLException ex) {
            ex.printStackTrace();
        } catch(Exception ex) {
            ex.getMessage();
        }
    }//GEN-LAST:event_btnListarActionPerformed

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
                FrameDashboard.inicializar();
            }
        });
    }
    
    public static void inicializar(){
        FrameDashboard dashboard = new FrameDashboard();
        dashboard.setVisible(true);
    }
   
            
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnListar;
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
