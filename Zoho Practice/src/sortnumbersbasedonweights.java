import java.util.Arrays;
import java.util.Scanner;

public class sortnumbersbasedonweights {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int[] res=new int[n];
        for(int j=0;j<n;j++) {
            int num;
            int sum = 0;
            num = arr[j];
            for (int i = 0; i * i <= num; i++) {
                if (i * i == num) {
                    sum += 5;
                    break;
                }
            }
            if (num % 4 == 0 && num % 6 == 0) {
                sum += 4;
            }
            if (num % 2 == 0) {
                sum += 3;
            }
            res[j]=sum;
        }
        for(int j=0;j<n;j++){
            System.out.print(res[j]+" ");
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (res[i] < res[j]) {
                    int temp = res[i];
                    res[i] = res[j];
                    res[j] = temp;
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);// + " -> " + res[i]);
        }
    }
}
