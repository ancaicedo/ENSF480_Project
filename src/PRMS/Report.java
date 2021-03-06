package PRMS;

import java.util.ArrayList;
import Property.*;

/**
 * @author Zheng Chen <a
 * href="mailto: zheng.chen1@ucalgary.ca</a>

 * @version 1.0
 * 
 * @since 1.0
 */

public class Report {
    private String start;
    private String end;
    private int HouseListed;
    private int HouseRented;
    private int HouseActive;   
    private ArrayList<Property> RentedHouseList;

    /**
     * Report Constructor.
     * @param start
     * @param end
     * @param HouseListed
     * @param HouseRented
     * @param HouseActive
     * @param RentedHouseList
     */
    public Report(String start, String end, int HouseListed, int HouseRented, int HouseActive, ArrayList<Property> RentedHouseList) {
        this.start = start;
        this.end = end;
        this.HouseListed = HouseListed;
        this.HouseRented = HouseRented;
        this.HouseActive = HouseActive;
        this.RentedHouseList = RentedHouseList;
    }

    //Return a formatted report as a String
    /**
     * display function to display all attributes in the report requirement
     * @return String
     */
    public String Display(){
        String display=String.format("Total number of houses listed in the period: %s\n", HouseListed);
        display += String.format("Total number of houses rented in the period: %s\n",HouseRented);
        display += String.format("Total number of active listing: %s\n\n",  HouseActive);
        display += String.format("%-" + 15 + "s", "Landlord");
        display += String.format("%-" + 10 + "s", "HouseID");
        display += "House Quadrant\n";

        for(Property x: RentedHouseList){
            String temp = String.format("%-" + 15 + "s", x.getLandlordName());
            temp += String.format("%-" + 10 + "s", x.getID());
            temp += x.getQuadrant();
            temp += "\n";
            display += temp;
        }
        
        return display;
    }

    /*public static void main(String[] args){
        Property t = new Property("1004", "Apartment", 2, 1, false, "123 road", "Active", 1000, "november", "december", "Mike", "mike@ucalgary.ca");
        ArrayList<Property> tt = new ArrayList<Property>();
        tt.add(t);
        Report test = new Report (2,2,2,tt);
        System.out.println(test.Display());

    }*/

    
}
