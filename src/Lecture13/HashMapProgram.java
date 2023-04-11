package Lecture13;

import java.util.HashMap;

public class HashMapProgram {
    //key---value
    public static void main(String[] args) {
        HashMap<String, String> stateCapital = new HashMap<>();
        stateCapital.put("Uttar Pradesh", "Lucknow");
        stateCapital.put("Madhya Pardesh", "Bhopal");
        stateCapital.put("Bihar", "Patna");
        stateCapital.put("Gujrat", "Ghandhinagar");
        System.out.println(stateCapital);

        //get value of gujrat
        System.out.println("===============");
        System.out.println(stateCapital.get("Gujrat"));

        // remove value of bihar
        System.out.println("===============");
        System.out.println(stateCapital.remove("Bihar"));
        System.out.println("===============");
        System.out.println(stateCapital);

        //get size of hashmap
        System.out.println("===============");
        System.out.println("size: " + stateCapital.size());

        // Get all keys
        System.out.println("===============");
        System.out.println("Print all keys:");
        for(String i : stateCapital.keySet()){
            System.out.println(i);
        }
        // Get all values
        System.out.println("===============");
        System.out.println("Print all values:");
        for (String i :stateCapital.values()){
            System.out.println(i);
        }
    }
}
