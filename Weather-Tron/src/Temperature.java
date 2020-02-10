/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author montr
 */
//Creates the temperature object and stores the temperature of the midday and 
//morning;
public class Temperature {

    private double aveMiddayTemp = 50 * Math.random() + 51;
    private double aveMorningTemp = 50 * Math.random() + 1;
    private Measurement mornTemp;
    private Measurement middTemp;
//creates the morning and midday objects

    public Temperature() {
        double morning = this.aveMorningTemp;
        double midday = this.aveMiddayTemp;
        mornTemp = new Measurement(Math.round(this.aveMorningTemp), "F",
                Math.round((this.aveMorningTemp - 32) * (5.0 / 9.0)), "C");
        middTemp = new Measurement(Math.round(this.aveMiddayTemp), "F",
                Math.round((this.aveMiddayTemp - 32) * (5.0 / 9.0)), "C");

    }
//changes the temperature according to the change in clouds

    public void cloudTemp(Clouds cloud, double morningTemp, double middayTemp) {
        if (cloud.Clouds().equalsIgnoreCase("None")) {
            this.aveMiddayTemp += 6.0;
            this.aveMorningTemp += 6.0;
        } else if (cloud.Clouds().equalsIgnoreCase("Light")) {
            this.aveMorningTemp += 3.0;
            this.aveMiddayTemp += 3.0;
        } else if (cloud.Clouds().equalsIgnoreCase("Medium")) {
            this.aveMiddayTemp -= 3.0;
            this.aveMorningTemp -= 3.0;
        } else if (cloud.Clouds().equalsIgnoreCase("Heavy")) {
            this.aveMiddayTemp -= 14.0;
            this.aveMorningTemp -= 14.0;
        }
    }
//Changes the temperature according to the wind direction

    public void windTemp(Wind wind) {
        if (wind.windDirection().equalsIgnoreCase("N")) {
            this.aveMorningTemp -= Math.round(0.65 * (wind.windSpeed()));
        } else if (wind.windDirection().equalsIgnoreCase("S")) {
            this.aveMorningTemp += Math.round(0.50 * (wind.windSpeed()));
        }

    }
//Changes the temperature according to the amount of rain

    public void rainTemp(Rain rain) {
        if (rain.getRainAmount() > 0) {
            this.aveMorningTemp -= 0.9 * rain.getRainAmount();
        }
    }
//Changes the temperature according to the amount of snow

    public void snowTemp(Snow snow) {
        if (snow.getSnowAmount() > 0) {
            this.aveMorningTemp -= 0.15 * snow.getSnowAmount();
        }
    }
//Retrieves the morning temperature

    public double getMorningTemperature() {
        return this.aveMorningTemp;
    }
//Retrieves the midday temperature

    public double getMiddayTemperature() {
        return this.aveMiddayTemp;
    }
//Prints the measurement objetcts mornTemp and middTemp to the screen

    public String toString() {

        return "Morning Temperature: " + mornTemp + " \n" + "Midday Temperature"
                + ":" + middTemp;
    }
}
