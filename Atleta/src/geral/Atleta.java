
package geral;


public abstract class Atleta extends Pessoa {
    private String numero;
    private double t1, t2, t3;

    public Atleta() {}

    public Atleta(String numero, double t1, double t2, double t3, String nome) {
        super(nome);
        this.numero = numero;
        this.t1 = t1;
        this.t2 = t2;
        this.t3 = t3;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getT1() {
        return t1;
    }

    public void setT1(double t1) {
        this.t1 = t1;
    }

    public double getT2() {
        return t2;
    }

    public void setT2(double t2) {
        this.t2 = t2;
    }

    public double getT3() {
        return t3;
    }

    public void setT3(double t3) {
        this.t3 = t3;
    }
    
    public abstract double calculaTempo();
}
