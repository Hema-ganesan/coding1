

import java.util.Scanner;
public class substringsearch_2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        String s1 = sc.nextLine();
        String[][] arr= new String[n][n];
        int k=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(k<s.length()) {
                    arr[i][j] = String.valueOf(s.charAt(k));
                    k++;
                }
                else{
                    arr[i][j] = " ";
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        String res = "";
        int k1=0;
        int i1=-1;
        int j1=-1;

        int[][] index=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(res.length()<s1.length() && arr[i][j].equals(String.valueOf(s1.charAt(k1)))) {
                    if (k1 == 0) {
                        i1 = i;
                        j1 = j;

                    }
                    res += (String.valueOf(s1.charAt(k1)));
                    k1++;
                    if(k1==s1.length()) {
                        System.out.println(s1.charAt(0) + " -> (" + i1 + "," + j1 + ")");
                        System.out.println(s1.charAt(s1.length() - 1) + " -> (" + i + "," + j + ")");
                        return;
                    }
                }
            }
        }
        System.out.println(res);
    }
}
