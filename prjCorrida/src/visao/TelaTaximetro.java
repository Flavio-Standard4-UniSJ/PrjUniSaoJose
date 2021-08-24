
package visao;

import javax.swing.JOptionPane;
import modelo.Taxi;

public class TelaTaximetro {

    public static void main(String[] args) {
        int tipo = Integer.parseInt(JOptionPane.showInputDialog(null, "bandeira 1 ou bandeira 2?"));
        Taxi t = new Taxi(tipo);
        t.setQuilometragem(Integer.parseInt(JOptionPane.showInputDialog(null, "dizer quantos quilometros percorreu")));
        JOptionPane.showMessageDialog(null, t.calcularCorrida());
    }
    
}
