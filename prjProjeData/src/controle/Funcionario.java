
package controle;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Period;

public class Funcionario extends Pessoa{
    private BigDecimal salario;
    private String funcao;

    public Funcionario(String nome, LocalDate dataNascimento, BigDecimal salario, String funcao) {
        super(nome, dataNascimento);
        this.salario = salario;
        this.funcao = funcao;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public String getFuncao() {
        return funcao;
    }

    public void aumentarSalario(BigDecimal percentual){
        this.salario = this.salario.add(this.salario.multiply(percentual));
    }
    
    public int getIdade(){
        return Period.between(this.dataNascimento, LocalDate.now()).getYears();
    }
}
