package array;

public class MyArray {
    public static void main(String[] args) {
        // int[] a = {2,4,12,45,23,48};
        int[] a = {2, 4, 10};

        int mul = 1;
        for (int k : a) {
            mul = mul * k;
        }
        System.out.println(mul);
    }}

       /* int b = a.length;
        System.out.println("Print the value of array length:");
        System.out.println(b);
        a[2] = 24;
        a[1] = a[2]* a[3];
        System.out.println("Print the all values of the array by for loop:");


        for (int i = 0; i<b; i++){
            System.out.println(a[i]);
        }
        System.out.println("Print the all values of the array by for each loop:");
        for (int x: a) {
            System.out.println(x);*/




