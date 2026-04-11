import java.util.*;
public class selectionsort {
    public static void main(String[] args) {
        int arr[]={10, 3, 2, 5, 7, 49, 30};

//        for(int i=0;i<arr.length;i++) {
//            int min = arr[i];
//            int j;
//            for (j = i + 1; j < arr.length-1; j++) {
//                if (arr[j] < min) {
//                    min = arr[j];
//                }
//            }
//            int temp = min;
//            min = arr[j];
//            arr[j] = temp;
//        }
        for(int i=0;i<arr.length-1;i++){
            int min=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

}
