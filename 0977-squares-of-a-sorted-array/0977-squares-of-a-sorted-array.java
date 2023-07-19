class Solution {
    // public int[] sortedSquares(int[] nums) {
    //     // for(int i =0;i<nums.length;i++){
    //     //     nums[i]=nums[i]*nums[i];
    //     // }
    //     // System.out.println(Arrays.toString(nums));
    //     // Arrays.sort(nums);
    //     //     return  nums;
    // }
      public int[] sortedSquares(int[] nums) {
        // for(int i =0;i<nums.length;i++){
          int [] res=new int[nums.length];
          int i=0;
          int j=nums.length-1;
          int index=nums.length-1;
          while(i<=j){
              int var=nums[i]*nums[i];
              int var2=nums[j]*nums[j];
              if(var>var2){
                  res[index]=var;
                  i++;
              }
              else{
                  res[index]=var2;
                  j--;
              }
              index--;
          }
         return res;
    }
}