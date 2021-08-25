
package modelo;


public abstract class Veiculo {
    //classe abstrata não são instanciadas
    private String placa;
    private String condutor;

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCondutor() {
        return condutor;
    }

    public void setCondutor(String condutor) {
        this.condutor = condutor;
    }
    
    public abstract void mostrarTotal();
}
