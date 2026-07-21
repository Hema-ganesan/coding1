//Question 2: Maximum Sum Circular Subarray
//Given an integer array of size N, which may contain both positive and negative integers,
// find the maximum possible sum of a non-empty circular subarray.
//In a circular array, the element after the last index is the first element of the array.
// Therefore, a subarray may wrap around from the end of the array to the beginning.
//Input
//The first line contains an integer N, the size of the array.
//The second line contains N space-separated integers.
//Output
//Print a single integer representing the maximum sum of a circular subarray.
//Example 1
//Input:
//        4
//        5 -3 5
//Output:
//        10
//Explanation: The maximum circular subarray is [5, 5] (wrapping around), whose sum is 10.
//Example 2
//Input:
//        5
//        -3 -2 -5 -1 -6
//Output:
//        -1
//Explanation: Since all elements are negative, the answer is the largest single element, -1.

import java.util.Scanner;

public class MaxSumSubArrayCircular {
    public static  void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=5;
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();

        int sum=0;
        int max=-1;
        for(int i=0;i<n;i++) {
            if (arr[i] < 0) {
                sum = 0;
            }
            else{
                sum+=arr[i];
                if(sum>max){
                    max=sum;
                }
            }
        }
        System.out.println(max);
    }
}
