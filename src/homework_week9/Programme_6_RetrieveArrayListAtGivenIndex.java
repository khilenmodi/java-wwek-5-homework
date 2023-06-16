package homework_week9;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Jay Vaghani
 */
/*
Write a java program to retrieve an element (at a specified index) from a given array list
 */

public class Programme_6_RetrieveArrayListAtGivenIndex {
    public static void main(String[] args) {
        ArrayList<String> vegetableList = new ArrayList<>();
        vegetableList.add("CUCUMBER");
        vegetableList.add("POTATO");
        vegetableList.add("CAULIFLOWER");
        vegetableList.add("BRINGLE");
        vegetableList.add("ONION");
        vegetableList.add("BEETROOT");
        vegetableList.add("MUSHROOM");
        vegetableList.add("BITTER_GROUND");
        System.out.println(vegetableList);
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter an index number : ");
        int index = scan.nextInt();
        if (index < vegetableList.size()){
            System.out.println(vegetableList.get(index));
        }else {
            System.out.println("Invalid index!!");
        }
        scan.close();
    }
}
