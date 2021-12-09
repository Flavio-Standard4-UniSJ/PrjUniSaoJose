
package controle;


public class Cliente extends Usuario {
    private String cpf, identidade, profissao;
    private float salario;
    private String email, telefone;
    
    public Cliente(){
        super();
    }
    public Cliente(String cpf, String identidade, String profissao, float salario, String email, String telefone) {
        super();
        this.cpf = cpf;
        this.identidade = identidade;
        this.profissao = profissao;
        this.salario = salario;
        this.email = email;
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getIdentidade() {
        return identidade;
    }

    public void setIdentidade(String identidade) {
        this.identidade = identidade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    
}
