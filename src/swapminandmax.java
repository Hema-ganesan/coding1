import java.util.Scanner;
import java.util.*;
public class swapminandmax {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] a = sc.nextLine().split(" ");
        int[] a1 = new int[a.length];
        int max = 0;
        int min=0;
        for(int i = 0; i < a.length; i++) {
            a1[i] = Integer.parseInt(a[i]);
        }
        for(int i=0;i<a1.length;i++){
            if(a1[i] > a1[max]){
                max = i;
            }
            if(a1[i]<a1[min])
                min = i;
        }
        int swap=a1[max];
        a1[max]=a1[min];
        a1[min]=swap;
        for(int i=0;i<a1.length;i++){
            System.out.print(a1[i]+" ");
        }
    }

}
