
package modelo;


public class Taxi extends Bandeira {
    protected int quilometragem;

    public int getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(int quilometragem) {
        this.quilometragem = quilometragem;
    }

    public Taxi(int tipo) {
        super(tipo);
    }
    
    public float calcularCorrida(){
        float corrida = 0;
        System.out.println(getTipo());
        switch (getTipo()){
            case 1:
                corrida = (float) (4.3 + (1.5 * quilometragem));
            case 2:
                corrida = (float) (4.3 + (1.7 * quilometragem));
            default: 
                corrida = (float) (4.3 + (1.5 * quilometragem));
        }
        return corrida;
    }//método calcularCorrida()
}
