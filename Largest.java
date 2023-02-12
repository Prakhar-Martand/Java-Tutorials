import java.util.*;

public class Largest {


    static int MaxNum(int a, int b, int c){
        int max = Math.max(c, Math.max(a,b));

        return max;
    }


    public static void main(String[] args) {
       try( Scanner sc = new Scanner(System.in);){
            int a = 10, b =12, c = 5;

            System.out.println(MaxNum(a,b,c));
       }

    }
}
