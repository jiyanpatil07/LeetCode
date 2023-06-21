class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int result=0;
        int start=0;
        for(int i=0;i<nums.length;i++){
            
            if(i>0 &&nums[i-1]>=nums[i]){
                start=i;
            }
            result = Math.max(result, i - start + 1);
            
        }
        return result;
    }
}