package com.example.demo7;

import org.json.JSONObject;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class DivisasC {
    public String eval(String valDe,String valA,String valInput){
        try{
            //Solicitar peticion
            URL url = new URL("http://api.exchangeratesapi.io/v1/latest?access_key=1af055d8c6a46996593334d402590ca4");
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
                JSONObject jsonObject = new JSONObject(informationString.toString());
                JSONObject vals = (JSONObject) jsonObject.get("rates");
                BigDecimal valDeFinal = (BigDecimal) vals.get(valDe);
                BigDecimal valAFinal = (BigDecimal) vals.get(valA);
                /*Solo falta realizar la operacion de multiply para hallar el valor*/
                BigDecimal result = (valAFinal.multiply(BigDecimal.valueOf(Integer.parseInt(valInput))) ).divide(valDeFinal, 2, RoundingMode.HALF_UP);
                return result.toString();
            }

        }catch(Exception e){
            e.printStackTrace();
        }

        return "Try again";
    }
}
