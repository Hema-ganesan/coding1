import java.util.*;
public class upperboundBS{
    public static void main(String[]args){
        int[] arr = {0, 1, 3, 5, 7, 8, 9, 11, 15, 18, 20};
        int l = 0;
        int h = arr.length - 1;
        int ans = arr.length;
        int target = 18;
        while (l <= h) {
            int m = l + (h - l) / 2;
            if (arr[m] > target) {
                ans = m;
                h = m - 1;
            } else l = m + 1;
        }
        System.out.print(ans);
    }
}
