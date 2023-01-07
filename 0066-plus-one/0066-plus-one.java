class Solution {
    public int[] plusOne(int[] digits) {
//          int[] sample = { 1,0};
//         int lastIndex=digits.length-1;
//         System.out.println(digits[lastIndex]);
//          if(digits[lastIndex]==9){
             
//             return sample;
            
//         }else{
//                      digits[lastIndex]++;

//          }
   

       
//         return digits;
        
        
        for(int i=digits.length-1;i>=0;i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            digits[i]=0;
        }
        digits= new int[digits.length+1];
        digits[0]=1;
        return digits;
    }
}