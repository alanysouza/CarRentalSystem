/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ooc.yoursolution;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import ooc.enums.Make;
import ooc.enums.Month;

/**
 *
 * @author Thaynna Vieira
 */
public class Car implements CarInterface{
    
    private Map<Month, boolean[]> availability;
    private Make make;
    private double rate;
    private int id;
    
    
    public Car (int id, Make make, double rate) { //constructor to set the id, make and rate when creating a new Car();
        this.make = make;
        this.id = id;
        this.rate = rate;
        this.availability = createAvailability(); // populate the availability Map with default values when the Car is created
    }

    @Override
    public Map<Month, boolean[]> createAvailability() {
        Map<Month, boolean[]> cal = new HashMap<>();
        for (Month month :Month.values()) {
            //create the value for month
            boolean[] availability = new boolean[month.getNumberOfDays()]; //boolean array with size the same as the number of days in the current month
            Arrays.fill(availability,true); // set the default value for all days in the month to true
            cal.put(month, availability); // put the month and availability, key value pair in the Map<Month, boolean[]> cal
        }
        return cal;
    }

    @Override
    public Make getMake() {
        return make;
    }

    @Override
    public void setMake(Make make) {
        this.make = make;
    }

    @Override
    public double getRate() {
        return this.rate;
    }

    @Override
    public void setRate(double rate) {
        this.rate = rate; 
    }

    @Override
    public Map<Month, boolean[]> getAvailability() {
        return availability;

    }

    @Override
    public void setAvailability(Map<Month, boolean[]> availability) {
        this.availability = availability;

    }

    @Override
    public int getId() {
        return this.id;

    }

    @Override
    public boolean isAvailable(Month month, int day) {

    }

    @Override
    public boolean book(Month month, int day) {

    }
    
}
