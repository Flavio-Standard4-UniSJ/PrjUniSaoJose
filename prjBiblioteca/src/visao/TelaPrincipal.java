
package visao;

import javax.swing.JOptionPane;
import modelo.Livro;

public class TelaPrincipal {

    public static void main(String[] args) {
        Livro k = new Livro();
        k.setCodigo(JOptionPane.showInputDialog(null, "codigo: "));
        k.setNomeDoLivro(JOptionPane.showInputDialog(null, "nome do livro: "));
        k.setAutor(JOptionPane.showInputDialog(null, "autor: "));
        k.imprimirDados();
    }
    
}
