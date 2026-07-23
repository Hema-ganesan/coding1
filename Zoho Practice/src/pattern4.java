import java.util.Scanner;

//input:n=5
//output:
//1
//2 6
//3 7 10
//4 8 11 13
//5 9 12 14 15
import java.util.Scanner;

class pattern4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            int start = 1;

            for (int j = 0; j <= i; j++) {

                if (j == 0) {
                    start = 1;
                } else {
                    start = 1;
                    for (int k = 0; k < j; k++) {
                        start += (n - k);
                    }
                }

                System.out.print(start + (i - j) + " ");
            }

            System.out.println();
        }
    }
}