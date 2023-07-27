class Solution {
    public int maxSubArray(int[] nums) {
        int sum=0;
        int max=nums[0];
      for(int i=0;i<nums.length;i++){
          
          
          //add the current index array element;
          sum=sum+nums[i];
          
          
          //check the if the sum is greater than the previous max;
          if(max<sum)max=sum;
          //check if the the sum is negative or not if it is then make sum =0
          if(sum<0)sum=0;
          
      }
        return max;
    }
}