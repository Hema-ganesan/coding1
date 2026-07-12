//Input : PROGRAM
//OUTPUT :
//P     P
// R   R
//  O O
//   G
//  R R
// A   A
//M     M

import java.util.Scanner;

public class pattern1 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        String[][] arr=new String[str.length()][str.length()];
        for(int i=0;i<str.length();i++){
            for(int j=0;j<str.length();j++){
                if(i==j || j==str.length()-1-i) {
                    arr[i][j] = str.charAt(i) + "";
                }
                else{
                    arr[i][j] =" " ;
                }
            }
        }
        for(int i=0;i<str.length();i++){
            for(int j=0;j<str.length();j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}