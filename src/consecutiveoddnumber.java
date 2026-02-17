import java.util.Scanner;

public class consecutiveoddnumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] a = sc.nextLine().split(" ");
        int[] a1 = new int[a.length];
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < a.length; i++){
            a1[i] = Integer.parseInt(a[i]);
            if(a1[i] > max){
                max = a1[i];
            }
        }
        System.out.println(max + 2);
//        if(max % 2 == 0){
//            System.out.println(max + 1);
//        } else {
//        System.out.println(max + 2);
        }

    }

