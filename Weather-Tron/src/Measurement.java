/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author montr
 */
public class Measurement {

    private double value;
    private String unit;
    private double valueT;
    private String unitT;

//Creates an instance of a measurement and takes in the paramters double 
    //and String
    public Measurement(double value, String unit, double valueT, String unitT) {
        this.value = value;
        this.unit = unit;
        this.unitT = unitT;
        this.valueT = valueT;
    }

    //Returns the value of an aspects of a shape's parameters
    public double getValue() {
        return value;
    }
// Overrides the toString method for Measurement

    @Override
    public String toString() {
        return value + " " + unit + "/" + valueT + " " + unitT;
    }

}
