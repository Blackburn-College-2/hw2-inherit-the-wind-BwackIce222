/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author montr
 */
public class Runner {

    /**
     * @param args the command line arguments
     */
    //Creates a 10-day forcast
    public static void main(String[] args) {
        for (int counter = 1; counter < 11; counter++) {
            System.out.println("Day " + counter + " :");
            Wind wind = new Wind();
            Clouds cloud = new Clouds();
            Temperature temp = new Temperature();
            Snow snow = new Snow();
            Rain rain = new Rain();
            if (snow.downfall(temp)) {
                System.out.println(snow.toString());
            } else if (rain.downfall(temp)) {
                System.out.println(rain.toString());
            } else {
                System.out.println("Precipitation: None");
            }
            System.out.println(cloud.toString());
            System.out.println(wind.toString());
            System.out.println(temp.toString());
        }

    }

}
