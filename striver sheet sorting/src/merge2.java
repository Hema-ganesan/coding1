import java.util.Arrays;

public class merge2 {
    public static void main(String args[]) {
        int a[] = {10, 20, 37, 2, 1, 36};
        a = mergesort(a, 0, a.length - 1);
        System.out.println(Arrays.toString(a));
    }

    public static int[] mergesort(int[] a, int low, int high) {
        if (low >= high) {
            return a;
        }
        int mid = (low + high) / 2;
        mergesort(a, low, mid);
        mergesort(a, mid + 1, high);
        merge(a, low, mid, high);
        return a;
    }

    public static void merge(int[] a, int low, int mid, int high) {
        int i = low, j = mid + 1;
        int temp[] = new int[high - low + 1];
        int k = 0;
        while (i<=mid &&j<=high){
            if (a[i]<a[j]){
                temp[k++]=a[i++];
            }
            else{
                temp[k++]=a[j++];
            }
        }
        while (i<=mid){
            temp[k++]=a[i++];
        }
        while (j<=high){
            temp[k++]=a[j++];
        }
        for (int l=low;l<=high;l++) {
            a[l]=temp[l-low];
        }
    }
}