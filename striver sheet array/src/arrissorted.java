public class arrissorted {
    public static void main(String[] args) {
        int arr[]={1,3,5,3,2,8,9,0,4};
        boolean b=true;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                b=false;
            }
        }
        System.out.println(b);
    }
}
