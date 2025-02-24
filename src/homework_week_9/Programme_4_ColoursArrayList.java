package homework_week_9;

import java.util.AbstractList;
import java.util.ArrayList;

/**
 * Created by Jigar Patel
 */
/*
Write a Java program to create a new array list, add some colours (string)
and printout the collection using for each loop.
 */

public class Programme_4_ColoursArrayList {

    public static void main(String[] args) {
        AbstractList<String> colorList = new ArrayList<>();
        colorList.add("RED");
        colorList.add("BLUE");
        colorList.add("GREEN");
        colorList.add("YELLOW");
        colorList.add("BLACK");
        colorList.add("WHITE");
        colorList.add("ORANGE");
        colorList.add("PURPLE");
        colorList.add("CYAN");
        for (String colourList : colorList){
            System.out.println(colourList + ", ");
        }
    }
}
