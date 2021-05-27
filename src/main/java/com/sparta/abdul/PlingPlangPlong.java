package com.sparta.abdul;

public class PlingPlangPlong {
    public static String generatePlingPlangPlong(int n) {

        String generatorResponse = "";
        if(n%3 == 0){
            generatorResponse += "Pling";
        }

        if(n%5 == 0){
            generatorResponse += "Plang";
        }

        if(n%7 == 0){
            generatorResponse += "Plong";
        }

        if(n%3 != 0 && n%5 != 0 && n%7 != 0){
            generatorResponse = Integer.toString(n);
        }
        return generatorResponse;
    }
}
