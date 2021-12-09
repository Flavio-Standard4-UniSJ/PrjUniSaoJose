
package controle;


public class Dependentes extends Usuario {
    private String cpf, identidade;

    public Dependentes(){
        super();
    }
    public Dependentes(String cpf, String identidade) {
        super();
        this.cpf = cpf;
        this.identidade = identidade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getIdentidade() {
        return identidade;
    }

    public void setIdentidade(String identidade) {
        this.identidade = identidade;
    }

    public int getAtivo() {
        return ativo;
    }

    public void setAtivo(int ativo) {
        this.ativo = ativo;
    }
    
    
}
