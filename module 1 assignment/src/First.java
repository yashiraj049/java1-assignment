//Question1 :- Write a Java method that takes a character input parameter and determines whether it's a vowel (a, e, i, o, u) or
// a consonant using a switch statement.

import java.util.Scanner;
public class First {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your Character");
        char ch = scanner.next().charAt(0);

        System.out.println(checkCharacter(ch));

    }

    public static String checkCharacter(char ch) {
        ch = Character.toLowerCase(ch);


        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                return "Vowel";
            default:
                if(ch>= 'a'&& ch<= 'z')
                    return "Consonant";
                else
                    return "Not a letter";
        }
    }
}