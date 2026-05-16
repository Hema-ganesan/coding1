public class arrayrotationcount {
    public static void main(String[] args) {
        int[] nums={7,8,9,1,2,3,4,5};
        int l=0,h=nums.length-1;
        int ans=Integer.MAX_VALUE;
        int index=-1;
        while(l<=h){
            int m=l+(h-l)/2;
            if(nums[l]<=nums[h]){
                if(nums[l]<ans){
                    ans=nums[l];
                    index=l;
                }
            }
            if(nums[l]<=nums[m]){
                if(nums[l]<ans){
                    ans=nums[l];
                    index=l;
                }
                l=m+1;
            }
            else{
                if(nums[m]<ans){
                    ans=nums[m];
                    index=m;
                }
                h=m-1;
            }
        }
        System.out.println(ans);
        System.out.println(index);
    }
}