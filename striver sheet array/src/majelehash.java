import java.util.HashMap;

public class majelehash {
    public static void main(String[] args) {
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        int arr[]={10,1,3,2,1,3,4,2,6,3,2,6,1,1,1,3,5,1,1,1,1,1,1,1,1,1};
        for(int i=0;i<arr.length;i++) {
            map.put(arr[i],map.getOrDefault(arr[i], 0) + 1);
        }
        for(int key : map.keySet()) {
            if(map.get(key)>arr.length / 2) {
                System.out.println("Majority element: " + key);
                return;
            }
        }
    }
}
