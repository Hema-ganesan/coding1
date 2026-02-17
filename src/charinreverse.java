import java.util.Scanner;

public class charinreverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);

        for(char c = ch; c >= 'a'; c--) {
            System.out.print(c + " ");
        }
    }
}
