import java.io.IOException;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) throws IOException {
        try (Scanner sc = new Scanner(System.in)) {
            while (true) {

                System.out.println("Enter the first number: ");
                int a = sc.nextInt();
                System.out.println("Enter the second number: ");
                int b = sc.nextInt();
                // Opertions only availale are +, -, /, *, %
                System.out.println("Enter operation: ");
                char ch = sc.next().trim().charAt(0);

                // Operations

                if (ch == '+')
                    System.out.println(a + b);
                else if (ch == '-')
                    System.out.println(a - b);
                else if (ch == '*')
                    System.out.println(a * b);
                else if (ch == '/')
                    System.out.println(a / b);
                else if (ch == '%')
                    System.out.println(a % b);
                else if (ch == 'q' || ch == 'Q'){
                    System.out.println("Exiting the calculator");
                    break;

                }
                else
                    System.out.println("Re-Enter the operator");

            }
        }

        // Take input from the user until it says q or Q

    }
}
