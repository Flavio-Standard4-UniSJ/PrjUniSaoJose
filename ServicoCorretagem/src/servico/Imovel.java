
package servico;


public class Imovel {
    public String descricao;
    public String localidade;
    public float preco;
    public String imovel_categoria;
    public byte[] imagem;
    public int id_imovel,id_corretor;

    public Imovel(){ }
    public Imovel(int id_imovel, int id_corretor, String descricao, String localidade, float preco, String imovel_categoria, String caminho_arquivo, String nome_arquivo, String tamanho,String imagem) {
        this.id_imovel = id_imovel;
        this.descricao = descricao;
        this.localidade = localidade;
        this.preco = preco;
        this.imovel_categoria = imovel_categoria;
        this.id_corretor = id_corretor;
    }

    public int getId_imovel() {
        return id_imovel;
    }

    public void setId_imovel(int id_imovel) {
        this.id_imovel = id_imovel;
    }

    public int getId_corretor() {
        return id_corretor;
    }

    public void setId_corretor(int id_corretor) {
        this.id_corretor = id_corretor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getLocalidade() {
        return localidade;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    
    public String getImovel_categoria() {
        return imovel_categoria;
    }

    public void setImovel_categoria(String imovel_categoria) {
        this.imovel_categoria = imovel_categoria;
    }

    public byte[] getImagem() {
        return imagem;
    }

    public void setImagem(byte[] imagem) {
        this.imagem = imagem;
    }

}
