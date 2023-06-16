package homework_week9;

import java.util.ArrayList;

/**
 * created by Jay Vaghani
 */
/*
Write a java program to create a new array list, add some colours(string)
and printout the collection using for each loop.
 */

public class Programme_4_ColoursArrayList {

    public static void main(String[] args) {
        ArrayList<String> colourList = new ArrayList<>();
        colourList.add("Red");
        colourList.add("BLUE");
        colourList.add("GREEN");
        colourList.add("YELLOW");
        colourList.add("BLACK");
        colourList.add("WHITE");
        colourList.add("ORANGE");
        colourList.add("PURPLE");
        colourList.add("CYAN");

        for ( String colorList : colourList ){
            System.out.print(colorList +" , ");
        }
    }
}
