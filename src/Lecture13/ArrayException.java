package Lecture13;
public class ArrayException {
    public static void main(String[] args) {
        int[] a = {2,3,4,5,6};
        a[0] = 5;
        for (int j : a) {
            System.out.println(j);
        }
        try{
        System.out.println(a[8]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        finally {
            System.out.println("remove the exception error");
        }
    }
}
