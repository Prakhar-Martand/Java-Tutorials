import java.util.*;
public class Loops {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int x = in.nextInt();
            for (int i = 0; i < x; i++) {
                System.out.println(i);
            }
            int i = 1;
            while(x>0){
                
                System.out.println(i);
                i++;
                x--;
            }
        }
        
    }
}
