package com.company;

import java.util.Map;

public class Main {

    static final String resultTemp = "[COUT] CO_RESULT = %s";

    static final String unknowParaTemp = "[COUT] Unknown Parameter: [%s]";

    static final String errorTemp = "[COUT] Bazel build error: %s";



    public static void main(String[] args) {
        try{
            Map map = System.getenv();
            String data = map.get("CO_DATA").toString();
            String param[] = data.split("\\s");

            for (String p : param){
                System.out.println(String.format(resultTemp,p));
            }

        }catch (Exception e){
            System.out.println(String.format(errorTemp,e.toString()));
        }

    }
}
