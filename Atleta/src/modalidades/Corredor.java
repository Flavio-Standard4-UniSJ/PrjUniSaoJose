
package modalidades;

import geral.Atleta;


public class Corredor extends Atleta{

    public Corredor() {}

    public Corredor(String numero, double t1, double t2, double t3, String nome) {
        super(numero, t1, t2, t3, nome);
    }

    
    @Override
    public double calculaTempo() {
        if(getT1()<getT2() && getT1()< getT3()){
            return getT1();
        }else if(getT2()<getT1() && getT2()<getT3()){
            return getT2();
        }else{      
            return getT3();
        }
    }  
}
