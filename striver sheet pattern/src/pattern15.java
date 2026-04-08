public class pattern15 {
    public static void main(String[] args) {
        for(int a = 5;a>=0; a--){
            for(char ch='a';ch<='a'+a;ch++){
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
