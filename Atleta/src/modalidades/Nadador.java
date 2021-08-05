
package modalidades;

import geral.Atleta;


public class Nadador extends Atleta{

    public Nadador() {}

    public Nadador(String numero, double t1, double t2, double t3, String nome) {
        super(numero, t1, t2, t3, nome);
    }

    @Override
    public double calculaTempo() {
        return (getT1()+getT2()+getT3()) / 3;
    }
    
}
