package array;

public class CharArray {
    public static void main(String[] args) {
        char[] ch = {'A','B','C','D','E'};

        System.out.println("Print all character values by for loop:");
        for (int i = 0; i < ch.length; i++){
            System.out.println(ch[i]);
        }
        System.out.println("========================================");
        System.out.println("Print all character values by for each loop:");
        for (char x : ch) {
            System.out.println(x);
        }
    }
}
