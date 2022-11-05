/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ooc.yoursolution;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import ooc.enums.Make;

/**
 *
 * @author Alany and Thaynna
 */
public class BookingSystem implements BookingSystemInterface{

    @Override
    public RentACarInterface setupRentACar(BufferedReader in) throws IOException {
        //loop over the items in the buffered reader and create the cars

        String name = in.readLine(); //name will always be the first line in the file

        RentACarInterface rentACar = new RentACar(name); // create a new car with name and empty list of cars

        String carLine;


        ArrayList<CarInterface> cars = new ArrayList<>(); //create new arraylist to store created cars
        
        // while there are more lines in the reader keep creating feed items
        while ((carLine = in.readLine()) !=null){ // car details will always be on the following lines
            String[] carDetails = carLine.split(":"); // search source https://www.baeldung.com/string/split
            String makeString = carDetails[0];
            Make make = Make.valueOf(makeString);
            String rateString = carDetails[1];
            double rate = Double.parseDouble(rateString); // search sourcehttps://www.geeksforgeeks.org/convert-string-to-double-in-java/
            int numberOfCarsToCreate = Integer.parseInt(carDetails[2]);
            
            
            for (int i = 1; i <= numberOfCarsToCreate; i++) {
                CarInterface car = new Car(i,make,rate);
                cars.add(car);
            }
            
        }
        
    rentACar.setCars(cars);  // set the cars attribute on the rentACar object
        return rentACar;
    }
    
    
}
