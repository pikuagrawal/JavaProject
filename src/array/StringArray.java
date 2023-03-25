package array;
public class StringArray {
    public static void main(String[] args) {
        String[] studentName = {"Priyanka", "Nisha", "Krishna", "Surya"};

        System.out.println("Print all string values by for loop:");
        for(int i = 0; i < studentName.length; i++ ){
            System.out.println(studentName[i]);
        }
        System.out.println("========================================");
        System.out.println("Print all string values in reverse order by for loop:");
        for(int i = studentName.length - 1; i >= 0; i-- ){
            System.out.println(studentName[i]);
        }
        System.out.println("========================================");
        System.out.println("Print all string values by for each loop:");
        for (String x : studentName) {
            System.out.println(x);
        }
    }
}
