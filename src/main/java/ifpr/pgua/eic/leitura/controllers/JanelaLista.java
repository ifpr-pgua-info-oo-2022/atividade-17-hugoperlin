package ifpr.pgua.eic.leitura.controllers;


import java.net.URL;
import java.util.ResourceBundle;

import ifpr.pgua.eic.leitura.App;
import ifpr.pgua.eic.leitura.models.GerenciadorLeituras;
import ifpr.pgua.eic.leitura.models.Leitura;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;

public class JanelaLista implements Initializable{


    @FXML
    private ListView<Leitura> ltvLeituras;

    @FXML
    private TextArea taDetalhes;
    
    private GerenciadorLeituras gerenciador;

    public JanelaLista(GerenciadorLeituras gerenciador){
        this.gerenciador = gerenciador;

    }

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        ltvLeituras.getItems().clear();
        ltvLeituras.getItems().addAll(gerenciador.getLeituras());
    }

    @FXML
    private void mostrarDetalhes(MouseEvent evt){

        Leitura leitura = ltvLeituras.getSelectionModel().getSelectedItem();

        if(leitura != null){
            taDetalhes.clear();
            taDetalhes.appendText("Título:"+leitura.getTitulo()+"\n");
            taDetalhes.appendText("Autor:"+leitura.getAutor()+"\n");
            taDetalhes.appendText("Nota:"+leitura.getNota()+"\n");
            taDetalhes.appendText("Opinião:"+leitura.getOpiniao()+"\n");
            taDetalhes.appendText("Data:"+leitura.getDataLeitura()+"\n");
            
        }


    }

    @FXML
    private void voltar(ActionEvent evento) {
        App.popScreen();
    }



}
