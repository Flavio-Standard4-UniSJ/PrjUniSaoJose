
package controle;


public class Corretor extends Usuario {
    private String creci, cpf, identidade;
    private String email, senha;
    private String pin, telefone;
    private int id;

    public Corretor(){
        super();
    }
    public Corretor(String creci, String cpf, String identidade, String email, String senha, String pin, String telefone, int id) {
        super();
        this.creci = creci;
        this.cpf = cpf;
        this.identidade = identidade;
        this.email = email;
        this.senha = senha;
        this.pin = pin;
        this.telefone = telefone;
        this.id = id;
    }

    public String getCreci() {
        return creci;
    }

    public void setCreci(String creci) {
        this.creci = creci;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getIdentidade() {
        return identidade;
    }

    public void setIdentidade(String identidade) {
        this.identidade = identidade;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    
}

