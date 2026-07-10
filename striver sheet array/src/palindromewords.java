import java.util.Scanner;

public class palindromewords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String temp = "";
        int k = 0;

        String[] arr = new String[s.length()];

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch != ' ') {
                temp = temp + ch;
            } else {
                arr[k] = temp;
                k++;
                temp = "";
            }
        }
        arr[k++] = temp;


        for (int i = 0; i < k; i++) {
            boolean ispalindrome = true;
            for (int j = 0; j < arr[i].length() / 2; j++) {
                if (arr[i].charAt(j) != arr[i].charAt(arr[i].length() - j - 1)) {
                    ispalindrome = false;
                    break;
                }
            }
            if(ispalindrome==true){
                System.out.print("");
            }
            else{
                System.out.print(arr[i]+" ");
            }
        }
    }
}
