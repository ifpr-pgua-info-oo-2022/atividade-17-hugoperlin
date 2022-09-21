package ifpr.pgua.eic.leitura.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import ifpr.pgua.eic.leitura.App;
import ifpr.pgua.eic.leitura.models.GerenciadorLeituras;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class JanelaCadastro implements Initializable{
    


    private GerenciadorLeituras gerenciador;

    public JanelaCadastro(GerenciadorLeituras gerenciador){
        this.gerenciador = gerenciador;
    }

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        
    }

    @FXML
    private void cadastrar(ActionEvent evento){
        
    }

    @FXML
    private void limpar(){
    }

    @FXML
    private void voltar(ActionEvent evento){
        App.popScreen();
    }




}
