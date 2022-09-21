package ifpr.pgua.eic.leitura.controllers;


import java.net.URL;
import java.util.ResourceBundle;

import ifpr.pgua.eic.leitura.App;
import ifpr.pgua.eic.leitura.models.GerenciadorLeituras;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;

public class JanelaLista implements Initializable{

    
    private GerenciadorLeituras gerenciador;

    public JanelaLista(GerenciadorLeituras gerenciador){
        this.gerenciador = gerenciador;

    }

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        
    }

    @FXML
    private void mostrarDetalhes(MouseEvent evt){
    }

    @FXML
    private void voltar(ActionEvent evento) {
        App.popScreen();
    }



}
