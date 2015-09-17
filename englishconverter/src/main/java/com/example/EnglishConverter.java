/**
 * Metric to English Converter
 * Created by nsotres on 9/17/15.
 *
 * This project takes a few given values in metric and converts them into the English system.
 */

package com.example;

public class EnglishConverter {

    public static void main(String [] args){
        System.out.println("Metric to English Converter\nFelix Sotres\nPRG130- Java for Android");
        System.out.println("This program will take a few values given in Metric and convert them to the English system.\n");

        Conversions runConversions = new Conversions();
        //print given values
        runConversions.printGivenValues();
        //run conversions and print results
        runConversions.runConversions();
    }
}
