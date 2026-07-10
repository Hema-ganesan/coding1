import java.util.HashMap;

public class frequencysort {
    public static void main(String[] args) {
        int[] arr={1,1,1,1,15,15,2,3,4,5,6,7,7,5,2,11,11,11};
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int i=0;i<arr.length;i++) {
            if(map.containsKey(arr[i])) {
                map.put(arr[i],map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
            }
        }
        while(!map.isEmpty()){
            int maxfreq=0;
            int maxele=0;
            for(int key:map.keySet()){
                if(map.get(key)>maxfreq){
                    maxfreq=map.get(key);
                    maxele=key;
                }
            }
            for(int i=0;i<maxfreq;i++) {
                System.out.print(maxele+" ");
            }
            map.remove(maxele);
        }
    }
}
