public class rotate {
    public static void main(String[] args) {
        String s = "hello";
        int k = 2;
        k = k % s.length();
        String result = s.substring(k) + s.substring(0, k);
        System.out.println(result);
    }
}
