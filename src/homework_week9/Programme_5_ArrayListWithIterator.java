package homework_week9;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 * created by Jay Vaghani
 */
/*
Write a java program to iterate through all elements in an array list using Iterator
 */

public class Programme_5_ArrayListWithIterator {
    public static void main(String[] args) {
        ArrayList<String> fruitList = new ArrayList<>();
        fruitList.add("Apple");
        fruitList.add("BANANA");
        fruitList.add("GRAPE");
        fruitList.add("MANGO");
        fruitList.add("KIWI");
        fruitList.add("ORANGE");
        fruitList.add("BLACKBERRY");
        fruitList.add("STRAWBERRY");
        fruitList.add("CHERRY");
        ListIterator<String> iterate = fruitList.listIterator();
        while(iterate.hasNext()){
            System.out.println(iterate.next() + " ,");
        }
    }
}
