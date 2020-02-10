/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author montreal.thomas
 */
//Creates a simulation of snow
public class Snow extends Rain {

    private Measurement snow;
    //snow constructor  

    public Snow() {
        snow = new Measurement(Math.round(getSnowAmount()), "cm",
                Math.round(getSnowAmount() / 2.54), "in");
    }
    //gets the amount of snow

    public double getSnowAmount() {
        double amount = 50 * Math.random();
        return amount;
    }

    //overrides the Rain's downfall method
    @Override
    public boolean downfall(Temperature temp) {
        if (temp.getMiddayTemperature() < 35) {
            return true;
        } else {
            return false;
        }
    }

    //prints the measurement variable snow to the screen
    public String toString() {
        return "Precipitation: " + snow + " Snow";

    }
}
