
package controle.usuario;

import java.text.SimpleDateFormat;
import java.util.Date;


public class Acesso {
    private int cpf;
    private String dataAcesso;
    private String horaAcesso;
    private String nomeUsuario;
    
    public Acesso()
    {
        SimpleDateFormat sdf = new SimpleDateFormat("kk:mm:ss");
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");
        dataAcesso = sdf2.format(new Date());
        horaAcesso = sdf.format(new Date().getTime());
    }
    
    public int getCpf(){ return cpf; }
    public String getDataAcesso(){ return dataAcesso; }
    public String getHoraAcesso(){ return horaAcesso; }
    public String getNomeUsuario(){ return nomeUsuario; }
    
    public void setCpf(int id){ this.cpf=cpf; }
    public void setDataAcesso(String dataAcesso){ this.dataAcesso=dataAcesso; }
    public void setHoraAcesso(String horaAcesso){ this.horaAcesso=horaAcesso; }
    public void setNomeUsuario(String nomeUsuario){ this.nomeUsuario=nomeUsuario; }

}