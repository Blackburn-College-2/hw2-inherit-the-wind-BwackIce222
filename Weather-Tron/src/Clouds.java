/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author montr
 */
//Creates a cloud object
public class Clouds {

    private final String cloudType[] = {"None", "Light", "Medium", "Heavy"};
    private String cloud;
    //returns the status of the clouds

    public String Clouds() {
        int type = (int) (4 * Math.random());
        return cloudType[type];
    }

    //Prints the cloud status to the screen
    @Override
    public String toString() {
        return "Clouds: " + Clouds();
    }
}
