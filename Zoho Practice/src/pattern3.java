//program
//        p           m
//          r       a
//            o   r
//              g
//            o   r
//          r       a
//        p           m



import java.util.Scanner;

public class pattern3 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        String rev="";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }
        String[][] arr=new String[str.length()][str.length()];
        for(int i=0;i<str.length();i++){
            for(int j=0;j<str.length();j++){
                if(i==j)  {
                    arr[i][j] = str.charAt(i) + "";
                }
                else if(j==str.length()-1-i){
                    arr[i][j]=rev.charAt(i) + "";
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