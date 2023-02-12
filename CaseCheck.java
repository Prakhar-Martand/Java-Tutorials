import java.util.Scanner;

public class CaseCheck {

    static String CaseTest(char ch){
        if(extracted(ch))
            return "UpperCase";
        return "LowerCase";
    }
    private static boolean extracted(char ch) {
        return ch>= 'A' && ch<= 'Z';
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            char ch = sc.next().trim().charAt(0);
            
            System.out.println(CaseTest(ch));
        }
    }
}
