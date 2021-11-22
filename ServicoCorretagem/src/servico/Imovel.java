
package servico;


public class Imovel {
    public String descricao;
    public String localidade;
    public float preco;
    public String imovel_categoria;
    public String nome_arquivo, imagem;
    public String caminho_arquivo;
    public String tamanho;
    public int idCorretor;

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

    public String getNome_arquivo() {
        return nome_arquivo;
    }

    public void setNome_arquivo(String nome_arquivo) {
        this.nome_arquivo = nome_arquivo;
    }

    public String getCaminho_arquivo() {
        return caminho_arquivo;
    }

    public void setCaminho_arquivo(String caminho_arquivo) {
        this.caminho_arquivo = caminho_arquivo;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String size) {
        this.tamanho = size;
    }

    public int getIdCorretor() {
        return idCorretor;
    }

    public void setIdCorretor(int idCorretor) {
        this.idCorretor = idCorretor;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }
    
    
}
