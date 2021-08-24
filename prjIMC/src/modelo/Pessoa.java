
package modelo;

import javax.swing.JOptionPane;

public class Pessoa {

private String nome;
private int anoNascimento;
private int anoAtual;
private double peso;
private double alturaCm;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public int getAnoAtual() {
        return anoAtual;
    }

    public void setAnoAtual(int anoAtual) {
        this.anoAtual = anoAtual;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAlturaCm() {
        return alturaCm;
    }

    public void setAlturaCm(double alturaCm) {
        this.alturaCm = alturaCm;
    }
    
    public double calculaImc(){
        double altura = (alturaCm * alturaCm)/100;
        System.out.println(altura);
        double imc = peso / altura;
        return imc;
    }
    
    public void resultado(double calculaImc) {
        JOptionPane.showMessageDialog(null, calculaImc());
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void calculaIdade() {
        int idade = anoAtual - anoNascimento;
        JOptionPane.showMessageDialog(null, idade);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
