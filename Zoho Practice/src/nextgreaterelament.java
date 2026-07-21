import java.util.HashMap;
import java.util.Stack;

public class nextgreaterelament {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        int[] arr={1,4,3,21,6,9,12};
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=arr.length-1;i>=0;i--){
            while(!st.isEmpty()&&arr[i]>=st.peek()){
                st.pop();
            }
            if(st.isEmpty()){
                hm.put(arr[i],-1);
            }
            else{
                hm.put(arr[i],st.peek());
            }
            st.push(arr[i]);
        }
        for(int i:hm.keySet()){
            System.out.print(hm.get(i)+"  ");
        }
    }
}
