import javax.security.auth.PrivateCredentialPermission;

public class Reverse {
    public static void main(String[] args) {
        int num = 23579;

        System.out.println(Reversed(num));
    }

    private static int Reversed(int n){

        int rev = 0;
        while(n > 0){
            rev = (rev)*10 + (n%10);
            n = n/10;
        }
        return rev;
    }
}
