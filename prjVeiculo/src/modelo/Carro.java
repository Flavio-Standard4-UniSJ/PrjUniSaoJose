
package modelo;

import javax.swing.JOptionPane;


public class Carro extends Veiculo {
    private double quantLitros;
    private double valorCombustivel;

    public double getQuantLitros() {
        return quantLitros;
    }

    public void setQuantLitros(double quantLitros) {
        this.quantLitros = quantLitros;
    }

    public double getValorCombustivel() {
        return valorCombustivel;
    }

    public void setValorCombustivel(double valorCombustivel) {
        this.valorCombustivel = valorCombustivel;
    }
    
    public void mostrarTotal(){
        JOptionPane.showMessageDialog(null, "Preço total: " + valorCombustivel * quantLitros);
    }
}
