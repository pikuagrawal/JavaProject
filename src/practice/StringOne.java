package practice;
class IfElseMethod {

    public static void myMethod(char x){
        for (int i = 5; i<10; i++)
            if(x == 'X' && i == 10)
                System.out.println(1);
            else
        System.out.println(2);
    }

    public static void main(String[] args) {
        myMethod('X');
    }
}