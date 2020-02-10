/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author montr
 */
//Creates an object of wind
public class Wind {

    private String direction;
    private double windSpeed = 70 * Math.random();
    private Measurement wind;
//Creates the wind object

    public Wind() {
        direction = this.windDirection();
        wind = new Measurement(Math.round(this.windSpeed),
                "kph", Math.round(this.windSpeed / 1.609),
                "mph " + windDirection());
    }
//Determines the direction of the wind

    public String windDirection() {
        String directions[] = {"N", "E", "S", "W"};
        int d = (int) (4 * Math.random());
        this.direction = directions[d];
        return direction;
    }
//returns the speed of the wind

    public double windSpeed() {

        return windSpeed;
    }

    //Prints the Measurement object wind, to the screen
    @Override
    public String toString() {
        return "Wind: " + wind;
    }

}
