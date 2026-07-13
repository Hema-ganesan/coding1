//PROBLEM STATEMENT:
//Explanation:
//To calculate the weight the rules are:
//1. if a number is  even number add 3
//2. if a number is a multiple of 6 and divisible of 4 add 4
//3. if a number is a perfect square add 5
//
//let us take example if this is my input
//Input:
//enter number of values:n
//n=5
//10
//36
//49
//53
//12
//
//The output should be in the descending order of their weight
//Output:
//36
//12
//49
//10
//28
//The Output should depend on
//36 -> 12
//12 -> 7
//49 -> 5
//10 -> 3
//53 -> 0


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
            System.out.println(arr[i] + " -> " + res[i]);
        }
    }
}
