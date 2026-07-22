//*****
//**-**
//*---*

public class pattern23 {
    public static void main(String[] args) {
        int n = 3;
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < 2 * n - 1; j++) {

                if (i == 0) {
                    // First row: all stars
                    System.out.print("*");
                }
                else if (j <= n - i - 1 || j >= n + i - 1) {
                    // Left stars and right stars
                    System.out.print("*");
                }
                else {
                    // Middle spaces
                    System.out.print("-");
                }
            }

            System.out.println();
        }
    }
}