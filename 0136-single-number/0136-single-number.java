class Solution {
    public int singleNumber(int[] arr) {
        int xor=0;
        for(int num:arr){
            xor=xor^num;
        }
        return xor;
    }
}