
package geral;


public class Aluno {
    private String nome;
    private float ta1, ta2,ta3;

    public Aluno(float n1, float n2, float n3) {
        this.ta1=n1;
        this.ta2=n2;
        this.ta3=n3;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getTa1() {
        return ta1;
    }

    public void setTa1(float ta1) {
        this.ta1 = ta1;
    }

    public float getTa2() {
        return ta2;
    }

    public void setTa2(float ta2) {
        this.ta2 = ta2;
    }

    public float getTa3() {
        return ta3;
    }

    public void setTa3(float ta3) {
        this.ta3 = ta3;
    }
    
    public float calcTotal(){
        return getTa1()+getTa2()+ getTa3();
    }
    
    public float calcMedia(){
        return calcTotal()/3;
    }
}
