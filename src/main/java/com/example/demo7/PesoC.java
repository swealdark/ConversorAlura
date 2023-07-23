package com.example.demo7;

import java.util.HashMap;

public class PesoC {

    private static final HashMap<String,Double> valsContent = new HashMap<String,Double>(){{
        put("Gramo",1000.0);
        put("Kilogramo",1.0);
        put("Libra",2.20462);
        put("Onza",35.274);
        put("Tonelada",0.001);
        put("Quintal",0.01);
        put("Stone",0.157473);
        put("Arroba",0.09);
        put("Grano",15432.36);
        put("Microgramo",1000000.0);
    }};


    public String eval(String valDe,String valA,String valInput){
        Double result = (valsContent.get(valA)  * Integer.parseInt(valInput))/ valsContent.get(valDe);
        return result.toString();


    }
}
