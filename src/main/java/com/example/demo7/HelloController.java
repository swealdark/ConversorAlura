package com.example.demo7;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.util.Arrays;
import java.util.List;

public class       HelloController {
    @FXML
    private Button peso;
    @FXML
    private Button longitud;
    @FXML
    private Button divisas;
    @FXML
    private Button temperatura;
    @FXML
    private Button convert;
    @FXML
    private TextField displayInput;
    @FXML
    private TextField displayOuput;
    @FXML
    private ComboBox<String> deOption;
    @FXML
    private ComboBox<String> aOption;
    /*Codigo que se ejecutara al inicializar */
    @FXML
    public void initialize(){

        peso.getStyleClass().add("select");
        longitud.getStyleClass().remove("select");
        divisas.getStyleClass().remove("select");
        temperatura.getStyleClass().remove("select");




        List<String> vals = Arrays.asList("Gramo","Kilogramo","Libra","Onza","Tonelada","Quintal","Stone","Arroba","Grano","Microgramo");
        /*deOption*/
        deOption.setVisibleRowCount(5);
        deOption.getItems().clear();
        deOption.getItems().addAll(vals);
        deOption.setVisibleRowCount(5);
        /*aOption*/
        aOption.setVisibleRowCount(5);
        aOption.getItems().clear();
        aOption.getItems().addAll(vals);
        aOption.setVisibleRowCount(5);
        deOption.requestLayout();
        aOption.requestLayout();
        /*Convert*/
        PesoC ddd = new PesoC();
        convert.setOnAction(event->{
            String deInput = displayInput.getText();
            String selectDeOption = deOption.getValue();
            String selectAOption = aOption.getValue();
            String aOutput = ddd.eval(selectDeOption,selectAOption,deInput);
            displayOuput.setText(aOutput);
        });
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
        /*deOption*/
        deOption.getItems().clear();
        deOption.getItems().addAll(vals);
        deOption.setVisibleRowCount(5);
        /*aOption*/
        aOption.getItems().clear();
        aOption.getItems().addAll(vals);
        aOption.setVisibleRowCount(5);
        deOption.requestLayout();
        aOption.requestLayout();
        /*Convert*/
        PesoC ddd = new PesoC();
        convert.setOnAction(event->{
            String deInput = displayInput.getText();
            String selectDeOption = deOption.getValue();
            String selectAOption = aOption.getValue();
            String aOutput = ddd.eval(selectDeOption,selectAOption,deInput);
            displayOuput.setText(aOutput);
        });


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


        List<String> vals = Arrays.asList("Metro","Kilómetro","Centímetro","Milímetro","Pulgada","Pie","Yarda","Milla","Nanómetro","Micrómetro");
        deOption.getItems().clear();
        deOption.getItems().addAll(vals);
        deOption.setVisibleRowCount(5);

        aOption.getItems().clear();
        aOption.getItems().addAll(vals);
        aOption.setVisibleRowCount(5);
        deOption.requestLayout();
        aOption.requestLayout();
        /*Convert*/
        LongitudC gg = new LongitudC();
        convert.setOnAction(event->{
            String deInput = displayInput.getText();
            String selectDeOption = deOption.getValue();
            String selectAOption = aOption.getValue();
            String aOutput = gg.eval(selectDeOption,selectAOption,deInput);
            displayOuput.setText(aOutput);
        });


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

        /*Update display*/

        OptionDivisas nnn = new OptionDivisas();
        nnn.updateDisplay(deOption,aOption);


        /*Convert*/
        DivisasC cccd = new DivisasC();
        convert.setOnAction(event->{
            String deInput = displayInput.getText();
            String selectDeOption = deOption.getValue();
            String selectAOption = aOption.getValue();

            selectDeOption = nnn.extractKey(selectDeOption);
            selectAOption = nnn.extractKey(selectAOption);


            String aOutput = cccd.eval(selectDeOption,selectAOption,deInput);
            System.out.println(aOutput);
            /*!!!!!!!!!!! el signo - se pone a la derecha si es un negativo*/
            displayOuput.setText(aOutput);
            System.out.println(aOutput);
        });

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



        List<String> vals = Arrays.asList("Celcius","Farenheit","Kelvin");
        deOption.getItems().clear();
        deOption.getItems().addAll(vals);
        deOption.setVisibleRowCount(deOption.getItems().size());
        /*aOption*/

        aOption.getItems().clear();
        aOption.getItems().addAll(vals);
        aOption.setVisibleRowCount(deOption.getItems().size());

        deOption.requestLayout();
        aOption.requestLayout();
        /*Convert*/
        TemperaturaC ccc = new TemperaturaC();
        convert.setOnAction(event->{
            String deInput = displayInput.getText();
            String selectDeOption = deOption.getValue();
            String selectAOption = aOption.getValue();
            String aOutput = ccc.eval(selectDeOption,selectAOption,deInput);
            /*!!!!!!!!!!! el signo - se pone a la derecha si es un negativo*/
            displayOuput.setText(aOutput);
        });

    }

}