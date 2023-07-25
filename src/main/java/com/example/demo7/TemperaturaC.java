package com.example.demo7;


public class TemperaturaC {

    public String eval(String valDe,String valA,String valInput){
        Double resp = 0.0;
        if(valDe == "Celcius"){
            if(valA == "Kelvin"){
                resp = Integer.parseInt(valInput) + 273.15;
            }else if(valA == "Farenheit"){
                resp = (double)(Integer.parseInt(valInput) * 9/5) + 32;
            }else{
                resp = (double) Integer.parseInt(valInput);
            }
        }else if(valDe == "Kelvin"){
            if(valA == "Celcius"){
                resp = Integer.parseInt(valInput) - 273.15;
            }else if(valA == "Farenheit"){
                resp = (Integer.parseInt(valInput) - 273.15)*9/5 + 32;
            }else{
                resp = (double) Integer.parseInt(valInput);
            }
        }else{
            if(valA == "Kelvin"){
                resp = (Integer.parseInt(valInput) - 32) * 5/9 + 273.15;
            }else if(valA == "Farenheit"){
                resp = (double) Integer.parseInt(valInput);
            }
            else {
                resp = (double)((Integer.parseInt(valInput) - 32)*5/9);
            }
        }

        return Double.toString(resp);
    }

}
