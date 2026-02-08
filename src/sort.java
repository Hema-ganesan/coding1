import java.util.Arrays;
import java.util.Scanner;

class Sort {
    public int largestElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length - 1];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Sort obj = new Sort();
        System.out.println(obj.largestElement(arr));
    }
}
