package conditionalStatement;

public class AddNumber {
    public static void main(String[] args) {
        System.out.println("Add numbers 1 to 50");
        int sum = 0;
        for(int i = 1; i <= 50; i++){
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
