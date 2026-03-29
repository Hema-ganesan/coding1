class largest{
    public static void main(String [] args){
        int arr[]={1,4,5,2,8,6};
        int large=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(large<=arr[i]){
                large=arr[i];
            }
        }

            System.out.print(large);
    }
}
