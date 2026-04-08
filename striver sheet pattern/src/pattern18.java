public class pattern18 {
    public static void main(String[] args) {
        for(int j=0;j<5;j++){
            char ch=(char)('e'-j);
            for(char i=ch;i<='e';i++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}