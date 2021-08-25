
package modelo;

import javax.swing.JOptionPane;


public class Operacao extends Calculadora{
    protected int operacao;

    public int getOperacao() {
        return operacao;
    }
    
    public Operacao(float num1, float num2, int operacao) {
        super(num1, num2);
        this.operacao = operacao;
    }
    public float operacaoParaRealizar(){
        float resultado = 0;
        switch (getOperacao()){
            case 1:
                resultado = num1 + num2;
                break;
            case 2:
                resultado = num1 - num2;
                break;
            case 3:
                if(num1 <= 0 || num2 <= 0){
                    JOptionPane.showMessageDialog(null, "não realizar divisão com o dividendo ou divisor igual a zero");
                }
                resultado = num1 / num2;
                break;
            case 4:
                resultado = num1 * num2;
                break;
        }       
        return resultado;
    }
    public void resultado(){
        JOptionPane.showMessageDialog(null, "num1: "+num1+"num2: "+num2+ "\n resultado: "+operacaoParaRealizar());
    }
}
