import java.util.Scanner;

class Functions_and_Methods {
/*
 * Syntax for the functions and methods are:
 *  access modifier return_type name(parameters){
 *          body of statements
 *          return type_requested 
 * }
 * 
 */

    public static int sum(int a, int b){
        return (a+b);
    }

    public static int muliple(int a, int b){
        return (a*b);
    }

    public static int difference(int a, int b){
        return (a-b);
    }

    public static double division(int a, int b){
        return (a/b);
    }
    public static void main(String[] args) {
        try (//Q. take input of 2 numbers and print the sum
        Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter number 1: ");
            int num1 = sc.nextInt();
            System.out.println("Enter second number :");
            int num2 = sc.nextInt();

            System.out.println("Sum of the numbers is :" + sum(num1, num2));
            System.out.println("Product of the numbers is :" + muliple(num1, num2));
            System.out.println("Difference of the numbers is :" + difference(num1, num2));
            System.out.println("Division of the numbers is :" + division(num1, num2));
        }
    
    }  
}
