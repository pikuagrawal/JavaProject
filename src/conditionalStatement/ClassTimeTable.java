package conditionalStatement;

public class ClassTimeTable {
    public static void main(String[] args) {
        System.out.println("Print time table class for school:");
        for(int i = 9; i <= 15; i++){
            switch(i) {
                case 9:
                    System.out.println(i + " to " + (i+1) + " Math Class");
                    break;
                case 10:
                    System.out.println(i + " to " + (i+1) + " English class");
                    break;
                case 11:
                    System.out.println(i + " to " + (i+1) + " History class");
                    break;
                case 12:
                    System.out.println(i + " to " + (i+1) + " Art class");
                    break;
                case 13:
                    System.out.println(i + " to " + (i+1) + " Science class");
                    break;
                case 14:
                    System.out.println(i + " to " + (i+1) + " Hindi class");
                    break;
                case 15:
                    System.out.println(i + " to " + (i+1) + " Computer class");
                    break;

            }
        }
    }
}
