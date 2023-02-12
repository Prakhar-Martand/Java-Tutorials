import java.util.Scanner;

public class Fibancci {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int x= sc.nextInt();

            System.out.println(Fib(x));
        }
        
    }

    private static int Fib(int x) {
        int p = 0, i = 1, count = 2;
        while(count <= x ){
            int temp = i;
            i = i+p;
            p = temp;
            count++;
        }
        return i;
    }
}
