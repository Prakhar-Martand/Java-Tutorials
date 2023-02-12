import java.util.Scanner;

public class Counting {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
        
        long num = in.nextLong();    
        int target = in.nextInt();

        System.out.println(Frequency(num, target));
        
        
        }
        
    }

    private static int Frequency(long num, int target) {
       int f = 0;
       while(num > 0){
            if(num%10 == target)
            f++;
            
            num = num/10;
       }
     
        return f;
    }
}
