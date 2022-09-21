package ifpr.pgua.eic.leitura.controllers;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

import ifpr.pgua.eic.leitura.App;
import ifpr.pgua.eic.leitura.models.GerenciadorLeituras;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.VBox;

public class JanelaCadastro implements Initializable{
    
    @FXML
    private TextField tfTitulo;

    @FXML
    private TextField tfAutor;

    @FXML
    private TextField tfNota;

    @FXML
    private TextField tfOpiniao;

    @FXML
    private DatePicker dpData;

    @FXML
    private VBox root;


    private GerenciadorLeituras gerenciador;

    public JanelaCadastro(GerenciadorLeituras gerenciador){
        this.gerenciador = gerenciador;
    }

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        
    }

    @FXML
    private void cadastrar(ActionEvent evento){
        String titulo = tfTitulo.getText();
        String autor = tfAutor.getText();
        String opiniao = tfOpiniao.getText();
        LocalDate data = dpData.getValue();
        String sNota = tfNota.getText();

        double nota = Double.valueOf(sNota);

        //adicionar uma classe de estilo em
        //tempo de execução
        if(nota < 0){
            tfNota.getStyleClass().add("valor-invalido");
            return;
        }else{
            tfNota.getStyleClass().remove("valor-invalido");
        }

        boolean res = gerenciador.cadastraLeitura(titulo, autor, opiniao, data, nota);
        String msg="";

        if(res){
            msg = "Cadastro realizado!";
            limpar();
        }else{
            msg = "Cadastro não realizado!";
        }

        Alert alert = new Alert(AlertType.INFORMATION,msg);
        alert.showAndWait();
    }

    @FXML
    private void limpar(){
        tfTitulo.clear();
        tfAutor.clear();
        tfNota.clear();
        tfOpiniao.clear();
        dpData.setValue(null);
    }

    @FXML
    private void voltar(ActionEvent evento){
        App.popScreen();
    }




}
