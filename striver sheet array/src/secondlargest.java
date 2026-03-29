public class secondlargest {
    public static void main(String[] args) {
        int arr[]={1,2,7,100};
        int largest=Integer.MIN_VALUE;
        int slar=-1;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>largest)
            {
                slar=largest;
                largest=arr[i];
            }
            else if(arr[i]>slar && arr[i]!=largest)
            {
                slar=arr[i];
            }
        }
        System.out.println(largest);
        System.out.println(slar);
    }
}

