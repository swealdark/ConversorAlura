package com.example.demo7;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HelloController {
    @FXML
    private Button peso;
    @FXML
    private Button longitud;
    @FXML
    private Button divisas;
    @FXML
    private Button temperatura;
    @FXML
    private ComboBox<String> deOption;
    /*Codigo que se ejecutara al inicializar */
    @FXML
    public void initialize(){
        peso.getStyleClass().add("select");
        longitud.getStyleClass().remove("select");
        divisas.getStyleClass().remove("select");
        temperatura.getStyleClass().remove("select");
    }
    public void peso(ActionEvent e){
        /* Opcion selecionada*/
        Button clickedButton = (Button) e.getSource();
        if(clickedButton.getStyleClass().contains("select")){
            return;
        }
        clickedButton.getStyleClass().add("select");
        longitud.getStyleClass().remove("select");
        divisas.getStyleClass().remove("select");
        temperatura.getStyleClass().remove("select");




        List<String> vals = Arrays.asList("Gramo","Kilogramo","Libra","Onza","Tonelada","Quintal","Stone","Arroba","Grano","Microgramo");
        deOption.setVisibleRowCount(deOption.getItems().size());
        deOption.getItems().clear();
        deOption.getItems().addAll(vals);
        deOption.setVisibleRowCount(deOption.getItems().size());
    }
    public void longitud(ActionEvent e){
        /* Opcion selecionada*/
        Button clickedButton = (Button) e.getSource();
        if(clickedButton.getStyleClass().contains("select")){
            return;
        }
        clickedButton.getStyleClass().add("select");
        peso.getStyleClass().remove("select");
        divisas.getStyleClass().remove("select");
        temperatura.getStyleClass().remove("select");

    }
    public void divisas(ActionEvent e){
        /* Opcion selecionada*/
        Button clickedButton = (Button) e.getSource();
        if(clickedButton.getStyleClass().contains("select")){
            return;
        }
        clickedButton.getStyleClass().add("select");
        longitud.getStyleClass().remove("select");
        peso.getStyleClass().remove("select");
        temperatura.getStyleClass().remove("select");
    }
    public void temperatura(ActionEvent e){
        /* Opcion selecionada*/
        Button clickedButton = (Button) e.getSource();
        if(clickedButton.getStyleClass().contains("select")){
            return;
        }
        clickedButton.getStyleClass().add("select");
        longitud.getStyleClass().remove("select");
        divisas.getStyleClass().remove("select");
        peso.getStyleClass().remove("select");




        deOption.setVisibleRowCount(deOption.getItems().size());
        deOption.getItems().clear();
        deOption.getItems().add("Cel");
        deOption.getItems().add("Far");
        deOption.getItems().add("Kel");
        deOption.setVisibleRowCount(deOption.getItems().size());
    }

}