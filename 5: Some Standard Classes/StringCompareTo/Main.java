/*
String.compareTo(String) compares two strings by their position on the ASCII chart.
Here is the order of the ASCII chart:
- Digits
- Capital letters
- Lowercase letters
*/

public class Main {
    public static void main(String[] args) {
        // Compare strings with numbers
        String str1 = "123";
        String str2 = "124";
        System.out.println(str1.compareTo(str2)); // evals to negative, so str1 before str2

        // Compare strings by letter index
        String str3 = "ABC";
        String str4 = "ABD";
        System.out.println(str3.compareTo(str4)); // evals to negative, so str3 before str4

        // Compare strings letter case
        String str5 = "ABC";
        String str6 = "ABc";
        System.out.println(str5.compareTo(str6)); // evals to negative, so str5 before str6
    }    
}
