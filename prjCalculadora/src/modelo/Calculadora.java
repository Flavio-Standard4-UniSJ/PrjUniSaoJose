
package modelo;

import javax.swing.JOptionPane;
import modelo.Operacao;

public class Calculadora {
    protected float num1;
    protected float num2;

    public float getNum1() {
        return num1;
    }

    public float getNum2() {
        return num2;
    }

    public Calculadora(float num1, float num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    
}
