package accessModOne;

public class ModOneFirstClass {
    public int a = 5; // public modifier
    private String myName = "Priyanka"; // private modifier
    protected int b = 3; // protected modifier

    public static void main(String[] args) {
        ModOneFirstClass myObj = new ModOneFirstClass();
        System.out.println(myObj.a);
        System.out.println(myObj.myName);
        System.out.println(myObj.b);


    }
}
