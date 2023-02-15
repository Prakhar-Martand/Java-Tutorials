import java.util.Scanner;

public class WeekDay {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the weekday number : ");
            int x = (sc.nextInt())%7;

            switch(x){
                case 1,2,3,4,5 -> System.out.println("weekdays");
                case 6,0 -> System.out.println("It is a weekend");
            }
        }
    }
}
