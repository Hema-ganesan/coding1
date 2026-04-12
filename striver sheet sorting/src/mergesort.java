import java.util.Arrays;

public class mergesort {
    public static void main(String[] args) {
        int a[] = {10, 2, 6, 3, 8, 29};
        a = mergesort(a);
        System.out.println(Arrays.toString(a));
    }

    public static int[] mergesort(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }
        int mid = arr.length / 2;
        int[] l = mergesort(Arrays.copyOfRange(arr, 0, mid));
        int[] r = mergesort(Arrays.copyOfRange(arr, mid, arr.length));
        return merge(l, r);
    }

    public static int[] merge(int[] l, int[] r) {
        int b[] = new int[l.length + r.length];
        int i = 0, j = 0, k = 0;

        while (i < l.length && j < r.length) {
            if (l[i] <= r[j]) {
                b[k++] = l[i++];
            } else {
                b[k++] = r[j++];
            }
        }

        while (i < l.length) {
            b[k++] = l[i++];
        }

        while (j < r.length) {
            b[k++] = r[j++];
        }

        return b;
    }
}
