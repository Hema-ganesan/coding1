import java.util.*;
public class arraysub {
    public static void main(String[] args) {
        int[] a1={1,2,7,0,5};
        int[] a2={1,3,4,8,9,2};
        int diff=0;
        ArrayList<Integer> ans = new ArrayList<>();
        int borrow=0;
        int i=a1.length-1;
        int j=a2.length-1;
        while(i>=0||j>=0||diff!=0) {
            int d1 = 0;
            if (i >= 0) {
                d1 = a1[i--];
            }
            int d2 = 0;
            if (j >= 0) {
                d2 = a2[j--];
            }
            diff = d2 - d1 - borrow;
            if(diff < 0) {
                diff += 10;
                borrow = 1;
            } else {
                borrow = 0;
            }
            ans.add(diff);
        }
        for(int h=ans.size()-1;h>=0;h--) {
            if(ans.get(h)!=0){
                System.out.print(ans.get(h));
            }
        }
        System.out.print("\n");
    }
}
