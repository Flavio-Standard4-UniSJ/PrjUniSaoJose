
package tela;

import geral.Atleta;
import javax.swing.JOptionPane;
import modalidades.Corredor;
import modalidades.Nadador;


public class PrincipalAtleta {


    public static void main(String[] args) {
        Atleta atleta;
        int op = 1;
        while(op != 0){
            op = Integer.parseInt(JOptionPane.showInputDialog("*** Menu ***\n1 - Corredor \n2 - Nadador\n0 - Sair"));
            if(op != 0){
                if(op == 1){
                    atleta = new Corredor();
                }else{
                    atleta = new Nadador();
                }
                atleta.setNome(JOptionPane.showInputDialog("nome do atleta"));
                atleta.setNumero(JOptionPane.showInputDialog("número do atleta"));
                atleta.setT1(Double.parseDouble(JOptionPane.showInputDialog("1º tempo do atleta")));
                atleta.setT2(Double.parseDouble(JOptionPane.showInputDialog("2º tempo do atleta")));
                atleta.setT3(Double.parseDouble(JOptionPane.showInputDialog("3º tempo do atleta")));
                JOptionPane.showMessageDialog(null, "Resultado Final\n numero: "+atleta.getNumero()+ "\nNome:  "+atleta.getNome()+ "\nTempo: "+atleta.calculaTempo() );
            }
        }
    }
    
}
