package conditionalStatement;

public class LeapYear {

    public static void leapYearMethod(int year){
        if ((year % 400 == 0)||((year % 4 == 0)&& (year % 100 != 0))){

            System.out.println(year + " is a leap year");
        }
        else {
            System.out.println(year + " is not a leap year");
        }
    }
    public static void main(String[] args) {
        //int year = 1900;
        //int year = 1600;
       // int year = 1904;
       /* if ((year % 400 == 0)||((year % 4 == 0)&& (year % 100 != 0))){
            System.out.println(year + " is a leap year");
        }
        else {
            System.out.println(year + " is not a leap year");
        }*/

        leapYearMethod( 2004);
        leapYearMethod(1904);
        leapYearMethod(2003);
        leapYearMethod(1600);

    }

}
