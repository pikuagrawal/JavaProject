package conditionalStatement;

public class CheckWeek {
    public static void findWeekDay(int a)
    {
        switch (a){
            case 1:
                System.out.println("Day: Monday");
                break;
            case 2:
                System.out.println("Day: Tuesday");
                break;
            case 3:
                System.out.println("Day: Wednesday");
                break;
            case 4:
                System.out.println("Day: Thursday");
                break;
            case 5:
                System.out.println("Day: Friday");
                break;
            case 6:
                System.out.println("Day: Saturday");
                break;
            case 7:
                System.out.println("Day: Sunday");
                break;
            default:
                System.out.println("Input is incorrect");
        }
    }
    public static void main(String[] args) {
        findWeekDay(5);
        findWeekDay(9);
        findWeekDay(1);

    }
}
