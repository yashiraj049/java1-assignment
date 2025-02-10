//Question 5:-Write a Java program that reads an integer from the user and divides 100 by the entered number.
//Implement exception handling to manage scenarios where the user enters zero (which causes a division by zero) and when the user inputs a non-integer value.


import java.util.InputMismatchException;
import java.util.Scanner;

public class Fifth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");
        int divisor = scanner.nextInt();
            try {
                int result = 100 / divisor;
                System.out.println("100 divided by " + divisor + " is " + result);
            } catch (InputMismatchException e) {
                System.out.println("Error: Invalid input. Please enter an integer.");
            }catch (ArithmeticException e){
                System.out.println("Error : Division by zero is not allowed ");
            }
        }

    }

