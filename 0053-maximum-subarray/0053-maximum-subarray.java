class Solution {
    public int maxSubArray(int[] nums) {
         if(nums.length==1){
                return nums[0];
            }
        
        int sum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            // if(nums[])
           
            sum=sum+nums[i];
            if(max<sum){
                max=sum;
            }
            if(sum<0){
                sum=0;
            }
        }
        return max;
    }
}