class Solution {
    public int removeDuplicates(int[] nums) {
        // int count=1;
//         for(int i=0;i<nums.length;i++){
            
//             for(int j=1;j<nums.length-1;j++){
//                 if(nums[i]==nums[j]){
//                     count++;
//                     // nums[i]=nums[i];
//                 nums[count]=nums[j+1];
                    
//                 }
                
//             }
            
            
//         }
//         return count;
        int count=1;
        for(int i =0;i<nums.length-1;i++){
            if(nums[i]!=nums[i+1]){
                nums[count]=nums[i+1];
                count++;
            }
        }
        return count;
    }
}