
package control;

public class MeuIMC {
    private final String nome;
    private final String nascimento;
    protected float peso;
    protected float altura; //em centimetros
    protected float imc;
    protected String resultado;
    
    public MeuIMC(String nome, String nascimento) {
        this.nome = nome;
        this.nascimento = nascimento;
    }
    
    public float calcularIMC(float peso, float altura){
        if (altura <= 0 || peso <= 0) {
            return -1;
        }
        
        imc = peso / (altura * altura);
        
        return imc;
        
    }
    
    public String classificarIMC(float imc) {
        if (imc < 18.5) {
            resultado = "Abaixo do peso";
        } else if (imc < 24.9) {
            resultado = "Peso normal";
        } else if (imc < 29.9) {
            resultado = "Acima do peso";
        } else if (imc < 39.9) {
            resultado = "Obesidade";
        } else {
            resultado = "Obesidade mórbida";
        }
        return resultado;
    }

    public String getNome() {
        return nome;
    }

    public String getNascimento() {
        return nascimento;
    }

    public float getPeso() {
        return peso;
    }

    public float setPeso(float peso) {
        this.peso = peso;
        return peso;
    }

    public float getAltura() {
        return altura;
    }

    public float setAltura(float altura) {
        this.altura = altura;
        return altura;
    }

    public float getImc() {
        return imc;
    }

    public void setImc(float imc) {
        this.imc = imc;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }
    
    
}
