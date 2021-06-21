package javaday;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<Integer>();
            numbers.add(10);
            numbers.add(30);
            numbers.add(40);
            numbers.add(50);



        for (int i = 0; i < numbers.size(); i++ ){
            int lowest = 0;
            if (i < lowest){
                lowest = i;

            }
            System.out.println("Lowest number is " + lowest);
        }


        }




    }

