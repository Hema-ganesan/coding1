public class patternnew {
    public static void main(String[] args) {
        int n = 26;

        for (int i = 1; i <= n; i++) {

            // Left part
            for (int j = 0; j < i; j++) {
                System.out.print((char)('A' + j));
            }

            // Middle spaces
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            // Right part
            for (int j = i - 1; j >= 0; j--) {
                System.out.print((char)('A' + j));
            }

            System.out.println();
        }
    }
}