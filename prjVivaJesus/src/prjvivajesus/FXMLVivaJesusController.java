/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prjvivajesus;

import geral.Aluno;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author miserere
 */
public class FXMLVivaJesusController implements Initializable {
    
     @FXML
    private TextField txtTa3;

    @FXML
    private TextField txtTa2;

    @FXML
    private Label lblResult;

    @FXML
    private Button btnTotal;

    @FXML
    private TextField txtTa1;

    @FXML
    private TextField txtNome;

    @FXML
    private Button btnMedia;
    
   @FXML
    void calculaTotal(ActionEvent event) {
        //https://www.devmedia.com.br/conversoes-em-java/2695
        String n= txtNome.getText();
        float n1= Float.parseFloat(txtTa1.getText());
        float n2= Float.parseFloat(txtTa2.getText());
        float n3= Float.parseFloat(txtTa3.getText());
        Aluno alu= new Aluno(n1,n2,n3);
        System.out.println("nome: "+alu.getNome()+"\nnota 1:"+alu.getTa1()+"\n nota 2: "+alu.getTa2()+"\nnota 3: "+alu.getTa3());
        System.out.println("media: "+alu.calcTotal());
        lblResult.setText(Float.toString(alu.calcTotal()));
    }

    @FXML
    void calculaMedia(ActionEvent event) {
        String n= txtNome.getText();
        float n1= Float.parseFloat(txtTa1.getText());
        float n2= Float.parseFloat(txtTa2.getText());
        float n3= Float.parseFloat(txtTa3.getText());
        Aluno alu= new Aluno(n1,n2,n3);
        System.out.println("nome: "+alu.getNome()+"\nnota 1:"+alu.getTa1()+"\n nota 2: "+alu.getTa2()+"\nnota 3: "+alu.getTa3());
        System.out.println("media: "+alu.calcMedia());
        lblResult.setText(Float.toString(alu.calcMedia()));
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

}
