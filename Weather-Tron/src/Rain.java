/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author montr
 */
//Creates an object of Rain
public class Rain extends Temperature {

    private Measurement rain;
    private Temperature temp;

    //Creates the rain object
    public Rain() {
        rain = new Measurement(Math.round(getRainAmount()), "cm",
                Math.round(getRainAmount() / 2.54), "in");
    }

    //gets the amount of rain
    public double getRainAmount() {
        double amount = 5 * Math.random();
        return amount;
    }

    //determines weather it should rain or not
    public boolean downfall(Temperature temp) {
        if (temp.getMiddayTemperature() > 70) {
            return true;
        } else {
            return false;
        }
    }

    //prints out the measurement vairable rain to the screen
    public String toString() {
        return "Precipitation: " + rain + " Rain";

    }
}
