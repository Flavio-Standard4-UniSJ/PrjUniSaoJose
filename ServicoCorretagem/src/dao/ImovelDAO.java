package dao;

import servico.Imovel;
import controle.Corretor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ImovelDAO {
    private Connection conexao;

    public ImovelDAO() throws Exception {
        this.conexao = CriaConexao.getConexao();
    }
    public void anunciaImovel(Imovel imovel, int id_corretor) throws SQLException{
        String sql = "INSERT INTO Imovel (descricao, localidade, preco, imovel_categoria, id_corretor, imagem) VALUES (?,?,?,?,?,?)";
        PreparedStatement preparador = conexao.prepareStatement(sql);
        preparador.setString(1, imovel.getDescricao());
        preparador.setString(2, imovel.getLocalidade());
        preparador.setFloat(3, imovel.getPreco());
        preparador.setString(4, imovel.getImovel_categoria());
        preparador.setInt(5, id_corretor);
        preparador.setBytes(6, imovel.getImagem());
        preparador.executeUpdate();
        preparador.close();
        System.out.println("Imóvel anunciado com sucesso");
    }

    public void excluirAnuncioImovel(String descricao, int id_corretor) throws Exception{
        String sql = ("DELETE FROM Imovel WHERE descricao LIKE ? AND id_corretor = ?");
        PreparedStatement preparador = this.conexao.prepareStatement(sql);
        preparador.setString(1, "%"+ descricao +"%");
        preparador.setInt(2, id_corretor);
        preparador.execute();
        preparador.close();
        System.out.println("passei por aqui e exclui o anuncio");
    }
    
    public void alterarAnuncioImovel(float preco, String descricao, int id_corretor) throws Exception{
        String sql = "UPDATE Imovel SET preco=? WHERE descricao LIKE ? AND id_corretor = ?";        
        PreparedStatement preparador = this.conexao.prepareStatement(sql);
        preparador.setFloat(1, preco);
        preparador.setString(2,"%"+ descricao +"%");
        preparador.setInt(3, id_corretor);
        preparador.execute();
        preparador.close();
        System.out.println("Consegui atualizar o anúncio.");
    }
    
    public Imovel pesquisarImovel(String descricao) throws Exception{
        Imovel imovel = new Imovel();
        String sql = ("SELECT * FROM Imovel WHERE descricao LIKE ?");
        PreparedStatement preparador = this.conexao.prepareStatement(sql);
        preparador.setString(1, "%"+descricao+"%");
        ResultSet rs = preparador.executeQuery();
        if(rs.next()){
            imovel.setDescricao(rs.getString("descricao"));
            imovel.setLocalidade(rs.getString("localidade"));
            imovel.setPreco(rs.getFloat("preco"));
            imovel.setImovel_categoria(rs.getString("imovel_categoria"));
            imovel.setImagem(rs.getBytes("imagem"));
        }else{
            JOptionPane.showMessageDialog(null, "nenhum imóvel anunciado por aqui até agora.");
            imovel = null;    
        }
        rs.close();
        preparador.close();
        return imovel; 
    }
    public ArrayList<Imovel> listaImovel(String localidade, String imovel_categoria) throws Exception{
        ArrayList<Imovel> imoveis = new ArrayList<Imovel>();
        String sql = ("SELECT * FROM Imovel WHERE localidade LIKE ? AND imovel_categoria=?");
        PreparedStatement preparador = this.conexao.prepareStatement(sql);
        preparador.setString(1, "%"+localidade+"%");
        preparador.setString(2, imovel_categoria);
        ResultSet rs = preparador.executeQuery();
        while(rs.next()){
            Imovel imovel = new Imovel();
            imovel.setDescricao(rs.getString("descricao"));
            imovel.setLocalidade(rs.getString("localidade"));
            imovel.setPreco(rs.getFloat("preco"));
            imovel.setImovel_categoria(rs.getString("imovel_categoria"));
            imovel.setImagem(rs.getBytes("imagem"));
            imoveis.add(imovel);
        }
        rs.close();
        preparador.close();
        return imoveis; 
    }
    public ArrayList<Imovel> listaImovel() throws Exception{
        ArrayList<Imovel> imoveis = new ArrayList<Imovel>();
        String sql = ("SELECT * FROM Imovel");
        PreparedStatement preparador = this.conexao.prepareStatement(sql);
        ResultSet rs = preparador.executeQuery();
        while(rs.next()){
            Imovel imovel = new Imovel();
            imovel.setDescricao(rs.getString("descricao"));
            imovel.setLocalidade(rs.getString("localidade"));
            imovel.setPreco(rs.getFloat("preco"));
            imovel.setImovel_categoria(rs.getString("imovel_categoria"));
            imovel.setImagem(rs.getBytes("imagem"));
            imoveis.add(imovel);
        }
        rs.close();
        preparador.close();
        return imoveis; 
    }
    public ArrayList<Imovel> listaTodos(int offset, int limit) throws Exception {
    ArrayList<Imovel> imoveis = new ArrayList<Imovel>();
    String sql = "SELECT * FROM Imovel LIMIT ? OFFSET ?";
    PreparedStatement preparador = this.conexao.prepareStatement(sql);
    preparador.setInt(1, limit);
    preparador.setInt(2, offset);
    ResultSet rs = preparador.executeQuery();
    while (rs.next()) {
        Imovel imovel = new Imovel();
        imovel.setDescricao(rs.getString("descricao"));
        imovel.setLocalidade(rs.getString("localidade"));
        imovel.setPreco(rs.getFloat("preco"));
        imovel.setImovel_categoria(rs.getString("imovel_categoria"));
        imovel.setImagem(rs.getBytes("imagem"));
        imoveis.add(imovel);
    }
    rs.close();
    preparador.close();
    return imoveis;
}
    public int countImovelPaginacao() throws Exception{
        String sql = ("SELECT COUNT(*) AS conta_imoveis FROM Imovel");
        PreparedStatement preparador = this.conexao.prepareStatement(sql);
        ResultSet rs = preparador.executeQuery();
        if(rs.next()){
            int total_rows = Integer.parseInt(rs.getString("conta_imoveis"));
            System.out.println("total imóveis: "+total_rows);
            return total_rows;
        }
        return 0;   
    }
}
