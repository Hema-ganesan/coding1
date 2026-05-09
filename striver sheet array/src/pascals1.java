public class pascals1 {
    public static void main(String[] args) {
        int c = 4, r = 2;
        int res = 0;
        for (int i = 0; i < c; i++) {
            res = 1;

            res = res * (c - i);
            res = res / (i + 1);

        }
        System.out.println(res);
    }
}
