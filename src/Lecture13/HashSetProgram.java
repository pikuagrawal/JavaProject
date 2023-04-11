package Lecture13;

import java.util.HashSet;
public class HashSetProgram {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(12);
        hashSet.add(23);
        hashSet.add(53);
        hashSet.add(21);
        System.out.println("Print the value of hashset " + hashSet);
        System.out.println("size of the hasset "  + hashSet.size());
        hashSet.remove(12);
        System.out.println("Print the value of hashset " + hashSet);
        System.out.println("size of the hasset "  + hashSet.size());
        for(int i : hashSet){
            System.out.println(i);
        }
    }
}
