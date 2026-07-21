public class sumofconsequtivepostivenum {
    public static void main(String[] args) {
        int[] arr={1,2,3,-1,2,3,2};
        int sum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                sum=0;
            }
            else {
                sum += arr[i];
                if (sum > max) {
                    max = sum;
                }
            }
        }
        System.out.print(max);
    }
}
