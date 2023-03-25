package accessModOne;

import accessModTwo.ModTwoFourthClass;

public class ModOneFourthClass {
    protected int c= 6;

    public static void main(String[] args) {
        ModOneFirstClass myObject = new ModOneFirstClass();
        System.out.println(myObject.b);

        ModOneFourthClass myObject1 = new ModOneFourthClass();
        System.out.println(myObject1.c);
    }
}
