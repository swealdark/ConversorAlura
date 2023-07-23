package com.example.demo7;

import com.google.gson.GsonBuilder;
import javafx.scene.control.ComboBox;
import org.json.JSONObject;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;
import com.google.gson.Gson;
public class OptionDivisas {
    JSONObject jsonObject;
    JSONObject symbols;
    public OptionDivisas(){
        try{
            //Solicitar peticion
            URL url = new URL("http://api.exchangeratesapi.io/v1/symbols?access_key=1af055d8c6a46996593334d402590ca4");
            HttpURLConnection conn =(HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.connect();
            //Comprabar si fue correcta
            int responseCode = conn.getResponseCode();
            if(responseCode != 200){
                throw new RuntimeException("Ocurrio un error" + responseCode);
            }else{
                StringBuilder informationString = new StringBuilder();
                Scanner scanner = new Scanner(url.openStream());

                while(scanner.hasNext()){
                    informationString.append(scanner.nextLine());
                }
                //Your Account
                //Your API key is:
                //2qjArKAdAQbv2mQx9HzhtTMBuqrK46
                //
                //Please note that our Free Plan requires you to display the following message prominently with a backlink:
                //
                //Powered by <a href="https://www.amdoren.com">Amdoren</a>
                scanner.close();
                //Abrir scaner que lea el flujo de datoss
                //imprimir en consola
                jsonObject = new JSONObject(informationString.toString());
                symbols = (JSONObject) jsonObject.get("symbols");
//                deOption.setMaxHeight(200);
//                deOption.prefHeight(Math.min(deOption.getItems().size() * 25 + 30, 200));
                /*!!!!!!!!!! ordenar alfabeticamente*/
            }

        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public void updateDisplay(ComboBox<String> deOption,ComboBox<String> aOption) {

                deOption.getItems().clear();
                aOption.getItems().clear();
                for (String key: symbols.keySet()) {
                    String value = (String) symbols.get(key);
                    deOption.getItems().add(value);
                    aOption.getItems().add(value);


                }
                deOption.setVisibleRowCount(5);
                aOption.setVisibleRowCount(5);
                deOption.requestLayout();
                aOption.requestLayout();
                /*!!!!!!!!!! ordenar alfabeticamente*/



    }
    public String extractKey(String deAOption) {
        for (String key : symbols.keySet()) {
            String value = (String) symbols.get(key);
            if (value == deAOption) {
                return key;
            }}
        return "PEN";
    }
}
