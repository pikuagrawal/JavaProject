package array;

public class IntArray {
    public static void main(String[] args) {
        int[] money = {1,2,3,4,5,6,7};

        System.out.println("Print all integer values by For Loop:");
        for (int i = 0; i<money.length; i++){
            System.out.println(money[i]);
        }

        System.out.println("Print all integer values by For Each Loop:");
        for (int x : money) {
            System.out.println(x);
        }
    }
}
