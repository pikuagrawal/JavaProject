package Lecture13;

import java.util.ArrayList;

public class FindMaxNumArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> obj = new ArrayList<>();
        obj.add(23);
        obj.add(24);
        obj.add(21);
        obj.add(12);
        obj.add(35);
        System.out.println("Print the all value in arraylist " + obj);

        int min = obj.get(0);
        int max = obj.get(0);

        // find smallest number form arraylist

        for(int i = 1; i<obj.size(); i++) {
            if (obj.get(i) < min) {
                min = obj.get(i);
            }
        }
        System.out.println("Print the smallest number: " + min );

        // find largest number form arraylist

            for(int i = 1; i<obj.size(); i++) {
                if (obj.get(i) > max) {
                    max = obj.get(i);
                }
            }
        System.out.println("Print the largest number: " + max );
    }
}
