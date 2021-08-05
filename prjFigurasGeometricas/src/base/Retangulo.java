
package base;

import controle.Figura;

public class Retangulo extends Figura{
    public float largura;
    public float comprimento;
    
    public Retangulo(String elemento, float largura, float comprimento){
        super(elemento);
        this.largura=largura;
        this.comprimento=comprimento;
    }
    
    public float calculaArea(){
        return largura * comprimento; 
    }
}
