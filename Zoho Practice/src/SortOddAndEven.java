public class SortOddAndEven {
    public static void main(String[] args) {
        int[] arr={1,4,7,2,9,10,3};
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                for(int j=i+1;j<arr.length;j++){
                    if(arr[j]%2==0 && arr[i]>arr[j]){
                        int temp=arr[j];
                        arr[j]=arr[i];
                        arr[i]=temp;
                    }
                }
            }
            else{
                for(int j=i+1;j<arr.length;j++){
                    if(arr[j]%2!=0 && arr[i]<arr[j]){
                        int temp=arr[j];
                        arr[j]=arr[i];
                        arr[i]=temp;
                    }
                }
            }

        }
        for(int x:arr){
            System.out.print(x+" ");
        }
    }
}
