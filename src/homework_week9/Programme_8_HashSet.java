package homework_week9;

import java.util.HashSet;

/**
 * Created by Jay Vaghani
 */
/*
Use a Hashset that stores integer object. store the number 4, 7, and 8 to sets.
show which numbers are between 1 and 10 are in the set. (hint :use the loop and if else)
 */

public class Programme_8_HashSet {

    public static void main(String[] args) {
        // create a HashSet object called numbers
        HashSet<Integer> numbers = new HashSet<>();

        // Add values to the set
        numbers.add(4);
        numbers.add(7);
        numbers.add(8);

        // show which numbers between 1 and 10 are in the set
        for(int i = 1; i<=10; i++){
            if (numbers.contains(i)){
            System.out.println(i+ "is found in the set.");
        }else {
                System.out.println(i+ "is not found in the set. ");
            }
        }
    }
}
