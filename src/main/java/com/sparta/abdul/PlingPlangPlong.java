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
        return generatorResponse;
    }
}
