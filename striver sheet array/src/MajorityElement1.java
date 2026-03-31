public class MajorityElement1 {
    public static void main(String[] args) {
        int arr[]={2,2,2,2,1,3,2};

        for(int i=0;i<arr.length;i++){
            int count=0;

            for(int j=0;j<arr.length;j++){
                if(arr[j]==arr[i]) {
                    count++;
                }
            }

            if(count > arr.length/2){
                System.out.println(arr[i]);
                break;
            }
        }
    }
}