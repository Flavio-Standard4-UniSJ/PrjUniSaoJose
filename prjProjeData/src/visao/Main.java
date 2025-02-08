
package visao;

import controle.Funcionario;
import java.math.BigDecimal;
import static java.math.BigDecimal.ROUND_CEILING;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Funcionario> funcionarios = new ArrayList<>(Arrays.asList(
                new Funcionario("Maria", LocalDate.of(2000, 10, 15), new BigDecimal(2009.44), "Operador"),
                new Funcionario("João", LocalDate.of(1990, 05, 12), new BigDecimal(2009.44), "Operador"),
                new Funcionario("Caio", LocalDate.of(1961, 05, 02), new BigDecimal(2009.44), "Coordenador"),
                new Funcionario("Miguel", LocalDate.of(1988, 10, 14), new BigDecimal(19119.16), "Diretor"),
                new Funcionario("Alice", LocalDate.of(1995, 12, 05), new BigDecimal(2234.62), "Recepcionista"),
                new Funcionario("Keitor", LocalDate.of(1999, 11, 19), new BigDecimal(1582.92), "Operador"),
                new Funcionario("Arthur", LocalDate.of(1993, 03, 31), new BigDecimal(4071.84), "Contador"),
                new Funcionario("Laura", LocalDate.of(1994, 07, 06), new BigDecimal(3017.45), "Gerente"),
                new Funcionario("Heloisa", LocalDate.of(2003, 05, 24), new BigDecimal(1606.85), "Eletricista"),
                new Funcionario("Helena", LocalDate.of(1996, 9, 02), new BigDecimal(2799.93), "Gerente")
        ));
       
        //formatando data para dd/MM/yyyy
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        System.out.println("Lista de Funcionários");
        System.out.println("Nome  | Data de Nascimento  | Salário  |  Função");
        for(int i =0; i < funcionarios.size(); i++){
            System.out.println(funcionarios.get(i).getNome()+" | "+funcionarios.get(i).getDataNascimento().format(formatter)+" | "+ funcionarios.get(i).getSalario().setScale(2, ROUND_CEILING)+ " | "+ funcionarios.get(i).getFuncao());
        }
        System.out.println();
        
        // remove João
        funcionarios.removeIf(f -> f.getNome().equalsIgnoreCase("João"));
        
        System.out.println("Lista de Funcionários após remoção do João");
        System.out.println("Nome  | Data de Nascimento  | Salário  |  Função");
        for(int i =0; i < funcionarios.size(); i++){
            System.out.println(funcionarios.get(i).getNome()+" | "+funcionarios.get(i).getDataNascimento().format(formatter)+" | "+ funcionarios.get(i).getSalario().setScale(2, ROUND_CEILING)+ " | "+ funcionarios.get(i).getFuncao());
        }
        System.out.println();
        
        funcionarios.forEach(f -> f.aumentarSalario(new BigDecimal("0.10")));
        
        //não sei  Agrupar os funcionários por função em um MAP, sendo a chave a “função” e o valor a “lista de funcionários”.
        
        //ordenando funcionários por ordem alfabética
        List<Funcionario> funcionariosOrdenados = new ArrayList<>(funcionarios);
        funcionariosOrdenados.sort(Comparator.comparing(Funcionario::getNome));
        
        System.out.println("Lista de Funcionários ordenados por ordem alfabética");
        for(int i =0; i < funcionariosOrdenados.size(); i++){
            System.out.println(funcionariosOrdenados.get(i).getNome()+" | "+funcionarios.get(i).getDataNascimento().format(formatter)+" | "+ funcionariosOrdenados.get(i).getSalario().setScale(2, ROUND_CEILING)+ " | "+ funcionariosOrdenados.get(i).getFuncao());
        }
    }
    
}
