public class pattern16 {
    public static void main(String[] args) {
        for(int a = 0; a < 5; a++){
            char ch=(char)('a'+ a);
            for(int b = 0; b <=a; b++){
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
