import java.util.Scanner;

public class Nextchartovowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();

        String vowels = "aeiouAEIOU";
        char[] arr = word.toCharArray();

        for(int i = 0; i < arr.length - 1; i++){
            if(vowels.indexOf(arr[i]) != -1){
                arr[i + 1] = Character.toUpperCase(arr[i + 1]);
            }
        }

        System.out.println(new String(arr));
    }
}