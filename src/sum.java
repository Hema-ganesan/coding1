import java.util.*;

public class sum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = 0;
        for (; n > 0; n = n / 10) {
            int n1 = n % 10;
            sum = sum + n1;
        }
        System.out.println(sum);
        int d= 0;
        int n3=0;
        for (; sum > 0; sum = sum / 10) {
            d = sum % 10;
            n3 = n3 + d;

        }

        System.out.println(n3);
    }
}