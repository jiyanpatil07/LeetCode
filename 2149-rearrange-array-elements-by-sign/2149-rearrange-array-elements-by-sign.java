class Solution {
    public int[] rearrangeArray(int[] nums) {
        
        
        int pos=0;
        int neg=1;
        int[] arr=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            
            
            if(nums[i]<0){
                arr[neg]=nums[i];
                neg=neg+2;
            }
            else{
                arr[pos]=nums[i];
                pos=pos+2;
            }
        }
        return arr;
    }
}