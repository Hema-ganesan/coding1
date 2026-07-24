//-----A-----
//----ABA----
//---ABCBA---
//--ABCDCBA--
//-ABCDEDCBA-
//ABCDEFEDCBA


public class abcpattern {
    public static void main(String[] args) {
        int n = 6;

        for (int i = 1; i <= n; i++) {

            // Print leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("-");
            }

            // Print increasing letters
            for (int j = 0; j < i; j++) {
                System.out.print((char) ('A' + j));
            }

            // Print decreasing letters
            for (int j = i - 2; j >= 0; j--) {
                System.out.print((char) ('A' + j));
            }
            for (int j = 1; j <= n - i; j++) {
                System.out.print("-");
            }


            System.out.println();
        }
    }
}