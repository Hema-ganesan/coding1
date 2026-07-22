import java.util.Scanner;

class pattern24{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            //spaces
            for(int j=i;j<=n-1;j++){
                System.out.print(" ");
            }
            //number
            int num=i;
            for(int j=1;j<=n;j++){
                System.out.print(num+"");
                num+=(n-j);
            }
            System.out.println();
        }
    }
}