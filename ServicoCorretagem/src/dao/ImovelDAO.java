package dao;

import servico.Imovel;
import controle.Corretor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ImovelDAO {
    private Connection conexao;

    public ImovelDAO() throws Exception {
        this.conexao = CriaConexao.getConexao();
    }
    public void anunciaImovel(Imovel imovel) throws SQLException{
        String sql = "INSERT INTO Imovel (descricao, localidade, preco, imovel_categoria, caminho_arquivo, nome_arquivo, tamanho, imagem, id_corretor) VALUES (?,?,?,?,?,?,?,?,?)";
        PreparedStatement preparador = conexao.prepareStatement(sql);
        preparador.setString(1, imovel.getDescricao());
        preparador.setString(2, imovel.getLocalidade());
        preparador.setFloat(3, imovel.getPreco());
        preparador.setString(4, imovel.getImovel_categoria());
        preparador.setString(5, imovel.getCaminho_arquivo());
        preparador.setString(6, imovel.getNome_arquivo());
        preparador.setString(7, imovel.getTamanho());
        preparador.setString(8, imovel.getImagem());
        preparador.setInt(9, imovel.getIdCorretor());
        preparador.execute();
        preparador.close();
        System.out.println("Imóvel anunciado com sucesso");
    }

    public void excluirAnuncioImovel(String nome) throws Exception{
        String sql = ("DELETE FROM Imovel WHERE nome = '"+nome+"'");
        PreparedStatement preparador = this.conexao.prepareStatement(sql);
        preparador.execute();
        preparador.close();
    }
    
    public void alterarAnuncioImovel(Imovel imovel) throws Exception{
        String sql = "UPDATE Imovel SET preco=? WHERE nome = ?";        
        PreparedStatement preparador = this.conexao.prepareStatement(sql);
        preparador.setFloat(1, imovel.getPreco());
        preparador.execute();
        preparador.close();
    }
    
    public Imovel pesquisarImovel(String localidade, String imovel_categoria) throws Exception{
        Imovel imovel = new Imovel();
        String sql = ("SELECT * FROM Imovel WHERE localidade ILIKE '%?%' AND imovel_categoria ILIKE '%?%'");
        PreparedStatement preparador = this.conexao.prepareStatement(sql);
        preparador.setString(1, localidade);
        preparador.setString(2, imovel_categoria);
        ResultSet rs = preparador.executeQuery();
        if(rs.next()){
            imovel.setDescricao(rs.getString("descricao"));
            imovel.setLocalidade(rs.getString("localidade"));
            imovel.setPreco(rs.getFloat("preco"));
            imovel.setImovel_categoria(rs.getString("imovel_categoria"));
            imovel.setNome_arquivo(rs.getString("nome_arquivo"));
            imovel.setCaminho_arquivo(rs.getString("caminho_arquivo"));
            rs.close();
            preparador.close();
        }
        return imovel; 
    }
    public Imovel listaImovel(Imovel imovel) throws Exception{
        String sql = ("SELECT * FROM Imovel");
        PreparedStatement preparador = this.conexao.prepareStatement(sql);
        ResultSet rs = preparador.executeQuery();
        if(rs.next()){
            imovel.setDescricao(rs.getString("descricao"));
            imovel.setLocalidade(rs.getString("localidade"));
            imovel.setPreco(rs.getFloat("preco"));
            imovel.setImovel_categoria(rs.getString("imovel_categoria"));
            
            rs.close();
            preparador.close();
        }
        return imovel; 
    }
}
