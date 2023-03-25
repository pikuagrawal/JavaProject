package variables;

public class AllTypesVariables {

    static int oldHouseNum = 46; //static variable
    int newHouseNum = 106; //instance or global variable

    public static void main(String[] args) {
        int myHouseNum = 56; // Local Variable
        System.out.println("Local Variable:" + myHouseNum);
        System.out.println("Static Variable:" + oldHouseNum);

    }
    public static void myMethod(){

        int yourHouseNum = 989;  // Local Variable
    }
}
