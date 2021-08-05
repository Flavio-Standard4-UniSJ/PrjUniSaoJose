
package base;

import controle.Figura;

public class Triangulo extends Figura {
    public float base;
    public float altura;
    
    public Triangulo(String elemento, float base, float altura){
        super(elemento);
        this.base=base;
        this.altura=altura;
    }
    
    
    public float calculaArea(){
        return base * altura / 2;
    }
}
