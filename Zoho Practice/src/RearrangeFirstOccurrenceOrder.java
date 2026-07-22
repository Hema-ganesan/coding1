import java.util.*;

public class RearrangeFirstOccurrenceOrder {
    public static void main(String[] args) {

        String str = "cccabbbbcca";

        int[] fre = new int[256];
        ArrayList<Character> bry = new ArrayList<>();
        boolean[] seen = new boolean[256];

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            fre[ch]++;

            if (!seen[ch]) {
                seen[ch] = true;
                bry.add(ch);
            }
        }

        StringBuilder bh = new StringBuilder();
        boolean rem = true;

        while (rem) {
            rem = false;

            for (char ch : bry) {
                if (fre[ch] > 0) {
                    bh.append(ch);
                    fre[ch]--;
                    rem = true;
                }
            }
        }

        System.out.println(bh);
    }
}