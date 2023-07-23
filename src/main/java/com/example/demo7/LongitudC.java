package com.example.demo7;

import java.util.HashMap;

public class LongitudC {

    private final HashMap<String,Double> valsContent = new HashMap<String,Double>(){{
        put("Metro",1.0);
        put("Kilómetro",0.001);
        put("Centímetro",100.0);
        put("Milímetro",1000.0);
        put("Pulgada",39.3701);
        put("Pie",3.28084);
        put("Yarda",1.09361);
        put("Milla",0.000621371);
        put("Nanómetro",1000000000.0);
        put("Micrómetro",1000000.0);
    }};


    public String eval(String valDe,String valA,String valInput){
        Double result = (valsContent.get(valA)  * Integer.parseInt(valInput))/ valsContent.get(valDe);
        return result.toString();


    }
}
