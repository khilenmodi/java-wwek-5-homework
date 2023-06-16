package homework_week9;

import java.util.ArrayList;

/**
 * Created by Jay Vaghani
 */
/*
Write a java program to test an array list is empty or not. Define array list with
underground tube names
 */

public class Programme_7_UnderGroundTubeNames {
    public void isEmpty(){
        ArrayList<String> tubeNames = new ArrayList<>();
        tubeNames.add("Bakerloo_lines");
        tubeNames.add("Central_lines");
        tubeNames.add("Circle_lines");
        tubeNames.add("District_lines");
        tubeNames.add("Hammersmith_and_city_lines");
        tubeNames.add("Jubilee_lines");
        tubeNames.add("Metropolitan_lines");
        tubeNames.add("Northern_lines");
        tubeNames.add("Piccadilly_lines");
        tubeNames.add("Victoria_lines");
        tubeNames.add("Waterloo_and_City_lines");
        System.out.println("Given Array list :" +tubeNames);
        if (tubeNames.isEmpty()){
            System.out.println("Given Array list is Empty !!");
        }else {
            System.out.println("Given Array List is not Empty!!");
        }

    }

    public static void main(String[] args) {
        Programme_7_UnderGroundTubeNames obj = new Programme_7_UnderGroundTubeNames();
        obj.isEmpty();
    }
}
