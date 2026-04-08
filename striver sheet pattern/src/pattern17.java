public class pattern17 {
    public static void main(String[] args) {

        for(int i=0;i<5;i++){
            for(int j=0;j<5-i-1;j++){
                System.out.print(" ");
            }
            char ch='a';
            int bp=(2*i+1)/2;
            for(int j=0;j<2*i + 1;j++){
                System.out.print(ch);
                if(j<bp){
                    ch++;
                }
                else{
                    ch--;
                }
            }
            for(int j=0;j<5-i-1;j++){
                System.out.print(" ");
            }
            System.out.println();
        }

    }
}
