package com.example;

/**
 * Created by nsotres on 9/17/15.
 *
 * This class handles running the actual project by doing the conversions and displaying them to user.
 */
public class Conversions {

    //Global variables

    //Units to be converted
    int meterGiven = 28; 		    //Meters
    int kilometerGiven = 168; 		//Kilometers
    int centimetersGiven = 47; 		//Centimeters
    int kiloPerHourGiven = 27;		// Kilometers per hour to Feet per sec
    int litersGiven = 92; 		    //Liters
    int kilosGiven = 200; 		    //Kilograms


    //Conversion values
    double meterMultiplier = 3.281;		    //1 meter = 3.281 ft
    double kilometerMultiplier = 0.621;	    //1 kilometer = 0.621 mi
    double centimeterMultiplier = 0.393;	//1 centimeter = 0.393 in
    double literMultiplier = 0.264;		    //1 Liter = 0.264 gallon
    double kiloMultiplier = 2.204;		    //1 kilo = 2.20 lbs

    //English conversion values
    double milesInKilometer = 0.621;	//1 kilometer = 0.621 mi
    int ftInMile = 5280;			    //1 mile = 5280ft
    int minInHour = 60;			        //1 hour = 60 min
    int secInMin = 60;			        //1 minute = 60 sec

    public void printGivenValues(){
        System.out.println("Values to be converted into English system:\n");
        System.out.println("28 meters");
        System.out.println("168 kilometers");
        System.out.println("47 centimeters");
        System.out.println("27 kilometers per hour");
        System.out.println("92 liters");
        System.out.println("200 kilograms");
        System.out.println("--------------\n");
    }

    public void runConversions(){
        System.out.println("Conversion results:\n");
        double feetConverted = meterGiven * meterMultiplier;
        System.out.println("28 meters = " + feetConverted + " feet.");
        double milesConverted = kilometerGiven * kilometerMultiplier;
        System.out.println("168 kilometers = " + milesConverted + " miles.");
        double inchesConverted = centimetersGiven * centimeterMultiplier;
        System.out.println("47 centimeters = " + inchesConverted + " inches.");
        double feetPerSecondConverted = kiloPerHourGiven * milesInKilometer * ftInMile * minInHour * secInMin;
        System.out.println("27 kilometers per hour = " + feetPerSecondConverted + " feet per second");
        double gallonsConverted = litersGiven * literMultiplier;
        System.out.println("92 liters = " + gallonsConverted + " gallons.");
        double poundsConverted = kilosGiven * kiloMultiplier;
        System.out.println("200 kilograms = " + poundsConverted + " pounds.");
    }

}
