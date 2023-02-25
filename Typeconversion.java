import java.util.Scanner;

public class Typeconversion {
    /**
     * @param args
     */
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            float num1  = sc.nextFloat();
            int num2 = sc.nextInt();

            float sum =  num1 + num2;
            System.out.println(sum);
        }
    }
    
}
