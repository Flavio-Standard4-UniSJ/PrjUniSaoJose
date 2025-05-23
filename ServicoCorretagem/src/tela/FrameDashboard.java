
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
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import servico.Acesso;
import servico.Imovel;
import servico.ManipulaImagem;

public class FrameDashboard extends javax.swing.JFrame {

   BufferedImage imagem; //tipo variavel armazena imagem em bytes 
    private Corretor corretor;
    private Cliente cliente;
 
    public FrameDashboard(Corretor corretor) {
        this.corretor = corretor;
        initComponents();
        customInitComponents();
        setTitle("Dashboard");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null); // Centraliza a janela
        setLayout(null);
    }
    public FrameDashboard(Cliente cliente) {
        this.cliente=cliente;
        initComponents();
        customInitComponents();
    } 
    
    public FrameDashboard() {
        initComponents();
    } 
    private void customInitComponents() {
        // Aqui você pode adicionar código para configurar os componentes
        // com base no objeto corretor, por exemplo:
        if (corretor != null) {
            //System.out.println("ID: "+ corretor.getId());
            //System.out.println("Dados do corretor: "+ corretor.getEmail());
            //System.out.println("PIN: "+ corretor.getPin());
            //System.out.println("Nº do CRECI: "+corretor.getCreci());
            //System.out.println("Nome: "+corretor.getNome());
            //System.out.println("Sobrenome: "+ corretor.getSobrenome());
            lblCorretorLogado.setText("Bem-vindo, " + corretor.getNome());
            lblCorretorSobrenome.setText(corretor.getSobrenome());
            lblIdCorretor.setText(String.valueOf(corretor.getId()));
        }
        // Adicione outras configurações que dependem do objeto corretor aqui
        if (cliente != null) {
            System.out.println("Id cliente: "+cliente.getId());
            System.out.println("CPF cliente: "+cliente.getCpf());
            System.out.println("Nome: "+cliente.getNome());
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu2 = new javax.swing.JMenu();
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
        jLabel10 = new javax.swing.JLabel();
        lblIdCorretor = new javax.swing.JLabel();
        lblCorretorSobrenome = new javax.swing.JLabel();
        mnPrincipal = new javax.swing.JMenuBar();
        mnSignUp = new javax.swing.JMenu();
        mnrDestivarConta = new javax.swing.JMenu();
        mnCorretorAlterar = new javax.swing.JMenuItem();
        mnExcluirConta = new javax.swing.JMenuItem();
        mnCorretorNovoCliente = new javax.swing.JMenuItem();
        mnCorretorVerAgendamentos = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        jMenu2.setText("jMenu2");

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

        jLabel10.setText("Matricula:");

        lblCorretorSobrenome.setText("lastname");

        mnSignUp.setText("Configurações");

        mnrDestivarConta.setText("Corretor");
        mnrDestivarConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnrDestivarContaActionPerformed(evt);
            }
        });

        mnCorretorAlterar.setText("alterar dados conta");
        mnCorretorAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnCorretorAlterarActionPerformed(evt);
            }
        });
        mnrDestivarConta.add(mnCorretorAlterar);

        mnExcluirConta.setText("excluir conta");
        mnExcluirConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnExcluirContaActionPerformed(evt);
            }
        });
        mnrDestivarConta.add(mnExcluirConta);

        mnCorretorNovoCliente.setText("novo cliente");
        mnCorretorNovoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnCorretorNovoClienteActionPerformed(evt);
            }
        });
        mnrDestivarConta.add(mnCorretorNovoCliente);

        mnCorretorVerAgendamentos.setText("agendamentos");
        mnCorretorVerAgendamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnCorretorVerAgendamentosActionPerformed(evt);
            }
        });
        mnrDestivarConta.add(mnCorretorVerAgendamentos);

        mnSignUp.add(mnrDestivarConta);

        mnPrincipal.add(mnSignUp);

        jMenu1.setText("imovel");

        jMenuItem1.setText("Anuncios");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Agenda");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        mnPrincipal.add(jMenu1);

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
                                .addComponent(jLabel9)
                                .addGap(22, 22, 22)
                                .addComponent(lblCorretorLogado, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblCorretorSobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblIdCorretor, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                                        .addComponent(btnPesquisar)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnListar)
                                        .addGap(0, 15, Short.MAX_VALUE))))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(59, 59, 59))
                            .addComponent(btnSalvarDados, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel9)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblIdCorretor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblCorretorSobrenome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblCorretorLogado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE))))
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

    private void mnCorretorNovoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnCorretorNovoClienteActionPerformed
        FrameNovoCliente cliente = new FrameNovoCliente(corretor);
        cliente.setVisible(true);
    }//GEN-LAST:event_mnCorretorNovoClienteActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        String pesq = txtNome.getText();
        int id_corretor = corretor.getId();
        try {
            Cliente cliente = new Cliente();
            ClienteDAO clienteDAO = new ClienteDAO();
            Cliente resultado = clienteDAO.pesquisarClienteNome(pesq, id_corretor);
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
            int id_corretor = corretor.getId(); //corretor.getId();
            Imovel imovel = new Imovel();
            imovel.setDescricao(txtDescricao.getText());
            imovel.setLocalidade(txtLocal.getText());
            imovel.setImovel_categoria((String) cmbCategoriaImovel.getSelectedItem());
            imovel.setPreco(Float.parseFloat(txtPreco.getText()));
            imovel.setId_corretor(id_corretor);
           
            imovel.setImagem(ManipulaImagem.getImgBytes(imagem));

            ImovelDAO imovelDAO = new ImovelDAO();
            imovelDAO.anunciaImovel(imovel, id_corretor);

        } catch(SQLException ex) {
            ex.printStackTrace();
        } catch(Exception ex) {
            ex.getMessage();
        }
    }//GEN-LAST:event_btnSalvarDadosActionPerformed

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
        corretor.getId();        
        try {
            ClienteDAO clienteDAO = new ClienteDAO();
            System.out.println(corretor.getId());
            ArrayList<Cliente> lista = clienteDAO.listarClientes(corretor.getId()); 
            if (lista.isEmpty()) {
                System.out.println("Nenhum cliente encontrado para este corretor.");
            } else {
                for (int i = 0; i < lista.size(); i++) {
                    Cliente cliente = lista.get(i);
                    System.out.printf("Posição %d - ID: %d, Nome: %s\n", i, cliente.getId(), cliente.getNome());
                    JOptionPane.showMessageDialog(null, "Id: "+cliente.getId()+"\n Nome: "+ cliente.getNome()+"\n Telefone: "+cliente.getTelefone());
                }
            } 
        } catch(SQLException ex) {
            ex.printStackTrace();
        } catch(Exception ex) {
            ex.getMessage();
        }
    }//GEN-LAST:event_btnListarActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        FrameImovel frmImovel = new FrameImovel(corretor);
        frmImovel.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        FrameAgenda agenda = new FrameAgenda(corretor);
        agenda.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void mnrDestivarContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnrDestivarContaActionPerformed
        JPanelAgendaCorretor painelAgenda = new JPanelAgendaCorretor(corretor);
        painelAgenda.setVisible(true);
    }//GEN-LAST:event_mnrDestivarContaActionPerformed

    private void mnExcluirContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnExcluirContaActionPerformed
        try {
            CorretorDAO corretorDAO = new CorretorDAO();
            corretorDAO.excluirCorretor(corretor.getId());
            JOptionPane.showMessageDialog(null, "conta deletada com sucesso.");
        } catch(SQLException ex){
            ex.printStackTrace();
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ops! ocorreu um erro ao deletar sua conta"+e.getMessage());
        }
    }//GEN-LAST:event_mnExcluirContaActionPerformed

    private void mnCorretorVerAgendamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnCorretorVerAgendamentosActionPerformed
        FrameAgendamentosCorretor frameAgendamentos = new FrameAgendamentosCorretor(corretor);
        frameAgendamentos.setVisible(true);
    }//GEN-LAST:event_mnCorretorVerAgendamentosActionPerformed
   
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
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JLabel lblCorretorLogado;
    private javax.swing.JLabel lblCorretorSobrenome;
    private javax.swing.JLabel lblIdCorretor;
    private javax.swing.JLabel lblImagem;
    private javax.swing.JMenuItem mnCorretorAlterar;
    private javax.swing.JMenuItem mnCorretorNovoCliente;
    private javax.swing.JMenuItem mnCorretorVerAgendamentos;
    private javax.swing.JMenuItem mnExcluirConta;
    private javax.swing.JMenuBar mnPrincipal;
    private javax.swing.JMenu mnSignUp;
    private javax.swing.JMenu mnrDestivarConta;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtLocal;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPreco;
    // End of variables declaration//GEN-END:variables
}
