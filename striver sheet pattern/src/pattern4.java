public class pattern4 {
    public static void main(String[] args) {
//        1
//        2 2
//        3 3 3
//        4 4 4 4
        for(int i = 0; i < 5; i++){
            int num=i+1;
            for(int j = 0; j <= i; j++){
                System.out.print(num+" ");
            }
            System.out.println();
        }
    }
}
