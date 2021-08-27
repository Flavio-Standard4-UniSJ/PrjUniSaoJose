
package modelo;


public class Usuario {
    private int id;
    private String nome, login, senha;
    
    public int getId(){ return id; }
    
    public String getNome(){ return nome; }
    public String getLogin(){ return login; }
    public String getSenha(){ return senha; }
    
    public void setNome(String nome){ this.nome=nome; }
    public void setId(int id){ this.id=id; }
    public void setLogin(String login){ this.login=login; }
    public void setSenha(String senha){ this.senha=senha; }
}
