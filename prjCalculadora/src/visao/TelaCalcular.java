
package visao;
import javax.swing.JOptionPane;
import modelo.Calculadora;
import modelo.Operacao;

public class TelaCalcular {

    public static void main(String[] args) {
        int operacao=Integer.parseInt(JOptionPane.showInputDialog("1 - adicao \n 2 - subtração \n3 - divisão \n4 - multiplicação :"));
        float n1 = Float.parseFloat(JOptionPane.showInputDialog(null, "dizer o primeiro valor"));
        float n2 = Float.parseFloat(JOptionPane.showInputDialog(null, "dizer o segundo valor"));
        Calculadora calc = new Calculadora(n1, n2);
        Operacao op = new Operacao(n1, n2, operacao);
        op.resultado();
    }
    
}
