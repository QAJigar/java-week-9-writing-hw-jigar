package homework_week_9;

import java.util.ArrayList;

/**
 * Created by Jigar Patel
 */
/*
Write a Java program to test an array list is empty or not. Define array list with underground tube names
 */

public class Programme_7_UnderGroundTubeNames {
    public void isEmpty(){
        ArrayList<String> tubeName = new ArrayList<>();
        tubeName.add("Bakerloo Lines");
        tubeName.add("Central Lines");
        tubeName.add("Circle Lines");
        tubeName.add("District Lines");
        tubeName.add("Hammersmith_and_City_line");
        tubeName.add("Jubilee_line");
        tubeName.add("Metropolitan_line");
        tubeName.add("Northern_line");
        tubeName.add("Piccadilly_line");
        tubeName.add("Victoria_line");
        tubeName.add("Waterloo_and_City_line");
        System.out.println("Given Array List : " + tubeName);
        if (tubeName.isEmpty()){
            System.out.println("Given Array List is Empty!!");
        }
    }

    public static void main(String[] args) {
        Programme_7_UnderGroundTubeNames obj = new Programme_7_UnderGroundTubeNames();
        obj.isEmpty();
    }
}
