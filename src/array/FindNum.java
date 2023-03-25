package array;
public class FindNum{
    public static void findLargestNumber(int[] a){
        int temp;
        for (int i = 0; i<a.length-1; i++){
            if(a[i]>a[i+1]) { // a[0]>a[1]
                temp = a[i];
                a[i] = a[i + 1];
                a[i + 1] = temp;
            }
        }
        System.out.println("Print the largest number of the array: " +  a[a.length-1]);
    }
    public static void findSmallestNumber(int[] a){
        int temp;
        for (int i = 0; i<a.length-1; i++){
            if(a[i]<a[i+1]) {
                temp = a[i];
                a[i] = a[i + 1];
                a[i + 1] = temp;
            }
        }
        System.out.println("Print the smallest number of the array: " +  a[a.length-1]);
    }
    public static void main(String[] args) {
        int[] x = {6,56,87,332,3,70,21};
        int[] y = {4,44,56,235,560,69,1,60,21,2};
        findLargestNumber(x);
        findLargestNumber(y);
        findSmallestNumber(x);
        findSmallestNumber(y);

    }
}
