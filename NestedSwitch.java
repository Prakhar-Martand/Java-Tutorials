import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int empID = in.nextInt();
            String department = in.next();

            switch (empID) {
                case 1 -> System.out.println("JOHN DOE the CEO");
                case 2 -> System.out.println("Gujju the COO");
                case 3 -> {
                    switch (department) {
                        case "IT" -> System.out.println("The User is from IT");
                        case "Services" -> System.out.println("They make the company great");
                    }
                }

                default -> System.out.println("Wrong input !");
            }
        }
    }
}
