public class miniregex{
    public static void main(String[] args) {
        String text = "abcbbcabb";
        String pattern = "cb*cab+";
        int n = text.length();
        int m = pattern.length();
        for (int i = 0; i < n; i++) {
            int t = i;   // pointer for text
            int p = 0;   // pointer for pattern
            while (p < m && t < n) {
                if (p + 1 < m && pattern.charAt(p + 1) == '*') {
                    char prev = pattern.charAt(p);
                    p = p + 2;
                    while (t < n && text.charAt(t) == prev) {
                        t++;
                    }
                }
                else if (p + 1 < m && pattern.charAt(p + 1) == '+') {
                    char prev = pattern.charAt(p);
                    p = p + 2;
                    if (t >= n || text.charAt(t) != prev) {
                        break;
                    }
                    while (t < n && text.charAt(t) == prev) {
                        t++;
                    }
                }
                else {
                    if (text.charAt(t) != pattern.charAt(p)) {
                        break;
                    }
                    t++;
                    p++;
                }
            }
            if (p == m) {
                System.out.println(text.substring(i, t));
                break;
            }
        }
    }
}
