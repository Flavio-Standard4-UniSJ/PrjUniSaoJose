//https://www.devmedia.com.br/manipulando-datas-em-java/21765
package modelo;

import java.text.SimpleDateFormat;
import java.util.*;


public abstract class Pessoa {
    private String nome;
    private Date dataNasc;
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(Date dataNasc) {
        this.dataNasc = dataNasc;
    }

    public Pessoa(String nome) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        this.nome = nome;
        Date data = new Date();
        dataNasc = data;
    }
   
    public abstract double calculaImc();
}
