/*
*
**
***
****    Crie uma classe Figura que será superclasse de classes de figuras específicas, como triângulo e retângulo.
*****   Crie o método calculaArea() que deve ser implementado especificamente para cada uma das subclasses, 
******* porém, sua declaração deve estar na superclasse.
******  Não deve ser possível instanciar a classe Figura.
*****
****
**
*
*/
package tela;

import base.Retangulo;
import base.Triangulo;


public class Principal {

    
    public static void main(String[] args) {
        Triangulo tri = new Triangulo("escaleno",12, 6);
        System.out.println(tri.calculaArea());
        Retangulo r = new Retangulo("retangulo",23, 6);
        System.out.println("===============");
        System.out.println(r.calculaArea());
    }
    
}
