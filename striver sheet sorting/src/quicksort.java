public class quicksort {
    public static void main(String[] args) {
        int arr[]={10,39,21,9,3,2};
        int l=0;
        int h= arr.length - 1;
        qs(arr,l,h);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void qs(int a[],int l,int h){
        if(l<h){
            int part=partition(a,l,h);
            qs(a,l,part-1);
            qs(a,part+1,h);
        }
    }
    public static int partition(int a[],int l,int h){
        int p=a[l];
        int i=l;
        int j=h;
        while(i<j){
            while(i<=h && a[i]<=p){
                i++;
            }
            while(a[j]>p){
                j--;
            }
            if(i<j){
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
        }
        int temp=a[l];
        a[l]=a[j];
        a[j]=temp;
        return j;
    }
}