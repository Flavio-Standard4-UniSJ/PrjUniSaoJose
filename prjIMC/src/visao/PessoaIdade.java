package visao;

import javax.swing.JOptionPane;
import modelo.Pessoa;


public class PessoaIdade {


    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        p.setNome(JOptionPane.showInputDialog(null,"informe o nome")); 
        p.setAnoNascimento(Integer.parseInt(JOptionPane.showInputDialog(null, "o ano de nascimento")));
        p.setAnoAtual(Integer.parseInt(JOptionPane.showInputDialog(null, "ano atual: ")));
        p.setPeso(Double.parseDouble(JOptionPane.showInputDialog(null, "indique o peso: ")));
        p.setAlturaCm(Double.parseDouble(JOptionPane.showInputDialog(null, "altura em centímetros: ")));
        JOptionPane.showMessageDialog(null, "Nome: "+p.getNome()+"\n Nascimento: "+p.getAnoNascimento()+"\n Ano actual: "+p.getAnoAtual()+"\n Peso: "+p.getPeso()+" \n Altura: "+p.getAlturaCm()); 
        p.calculaIdade();
        p.resultado(p.calculaImc());
    }
    
}
