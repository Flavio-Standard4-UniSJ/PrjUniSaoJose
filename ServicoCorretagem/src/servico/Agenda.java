package servico;


public class Agenda {
    private int codigo, id_corretor;
    private String creci;
    private String tipo_atendimento;
    private String data_atendimento, hora_atendimento;
    public String nome_cliente;
    public String sobrenome_cliente;
    public int status;
    public String imovel_categoria;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getId_corretor() {
        return id_corretor;
    }

    public void setId_corretor(int id_corretor) {
        this.id_corretor = id_corretor;
    }

    public String getCreci() {
        return creci;
    }

    public void setCreci(String creci) {
        this.creci = creci;
    }

    public String getTipo_atendimento() {
        return tipo_atendimento;
    }

    public void setTipo_atendimento(String tipo_atendimento) {
        this.tipo_atendimento = tipo_atendimento;
    }

    public String getData_atendimento() {
        return data_atendimento;
    }

    public void setData_atendimento(String data_atendimento) {
        this.data_atendimento = data_atendimento;
    }

    public String getHora_atendimento() {
        return hora_atendimento;
    }

    public void setHora_atendimento(String hora_atendimento) {
        this.hora_atendimento = hora_atendimento;
    }

    public String getImovel_categoria() {
        return imovel_categoria;
    }

    public void setImovel_categoria(String imovel_categoria) {
        this.imovel_categoria = imovel_categoria;
    }

    
    public String getNome_cliente() {
        return nome_cliente;
    }

    public void setNome_cliente(String nome_cliente) {
        this.nome_cliente = nome_cliente;
    }

    public String getSobrenome_cliente() {
        return sobrenome_cliente;
    }

    public void setSobrenome_cliente(String sobrenomr_cliente) {
        this.sobrenome_cliente = sobrenomr_cliente;
    }
    
    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }   
}
