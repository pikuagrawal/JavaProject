package practice;

public class FindVowelNumber {
    public static void main(String[] args) {
        String name = "Hello EveryOne";
        name = name.toLowerCase();
        System.out.println("Print the String in Lowercase: " + name);
        int count = 0;
        System.out.println("Length of the String " + name.length());
        for (int i = 0; i < name.length(); i++) {
            if(name.charAt(i) == 'a' || name.charAt(i) =='e' || name.charAt(i) =='i'
                    || name.charAt(i) =='o' || name.charAt(i) =='u'){

                System.out.println("String contains " + name.charAt(i) + " at the index " + i  );
                count++;
            }
        }
        System.out.println("Print total number of vowels in String: "+ count);
    }
}