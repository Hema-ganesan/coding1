public class wave {
    public static void main(String[] args) {

        int[] arr = {10, 5, 6, 3, 2, 20, 100, 80};
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            if (i % 2 == 0) {   // even index
                if (arr[i] < arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }}
            else {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}