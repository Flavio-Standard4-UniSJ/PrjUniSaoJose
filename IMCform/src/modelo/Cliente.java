
package modelo;

import java.awt.HeadlessException;
import java.util.*;
import javax.swing.JOptionPane;

public class Cliente extends Pessoa {
    protected double peso;
    protected double altura;

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    
    public Cliente(String nome) {
        super(nome);
    }

    @Override
    public double calculaImc() {
        try{
            JOptionPane.showMessageDialog(null, "Nome: " + getNome() + "\n Nascimento: " + getDataNasc());
            JOptionPane.showMessageDialog(null, peso  / (altura * altura));
        }catch(HeadlessException ex){
            ex.getMessage();
        }
        return 0;
    }
    
}
