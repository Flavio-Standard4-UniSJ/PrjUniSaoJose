
package modelo;

import javax.swing.JOptionPane;


public class Livro extends Acervo {
    private String autor;

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    @Override
    public void imprimirDados(){
        System.out.println(this);
        JOptionPane.showMessageDialog(null, "\n código: "+getCodigo()+"\n autor: "+autor+ "\nnome do livro: "+getNomeDoLivro());
    }
}
