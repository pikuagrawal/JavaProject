package accessModTwo;

public class ModTwoSecondClass {
    public static void main(String[] args) {
        System.out.println(ModTwoThirdClass.name);
        ModTwoThirdClass.myFirstMethod();
        ModTwoThirdClass thirdObj = new ModTwoThirdClass();
        System.out.println(thirdObj.d);
        thirdObj.myMethod();
    }
}
