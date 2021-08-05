
package controle;


public abstract class Figura {
    public String elemento; //triangulo círculo retangulo quadrado ...
    
    public Figura(String elemento){
        this.elemento=elemento;
    }
   
    public abstract float calculaArea();
}
