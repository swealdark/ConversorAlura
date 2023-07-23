package com.example.demo7;


public class TemperaturaC {

    public String eval(String valDe,String valA,String valInput){
        Double resp = 0.0;
        if(valDe == "Celcius"){
            if(valA == "Kelvin"){
                resp = Integer.parseInt(valInput) + 273.15;
            }else{
                resp = (double)(Integer.parseInt(valDe) * 9/5) + 32;
            }
        }else if(valDe == "Kelvin"){
            if(valA == "Celcius"){
                resp = Integer.parseInt(valInput) - 273.15;
            }else{
                resp = (Integer.parseInt(valInput) - 273.15)*9/5 + 32;
            }
        }else{
            if(valA == "Kelvin"){
                resp = (Integer.parseInt(valInput) - 32) * 5/9 + 273.15;
            }else{
                resp = (double)((Integer.parseInt(valInput) - 32)*5/9);
            }
        }

        return Double.toString(resp);
    }

}
