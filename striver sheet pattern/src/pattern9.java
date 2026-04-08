public class pattern9 {
    public static void main(String[] args) {
        int n = 3;

        // Upper half
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n - i - 1; j++){
                System.out.print(" ");
            }
            for(int j = 0; j < 2*i + 1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower half
        for(int i = n - 2; i >= 0; i--){
            for(int j = 0; j < n - i - 1; j++){
                System.out.print(" ");
            }
            for(int j = 0; j < 2*i + 1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}