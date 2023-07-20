class Solution {
    public boolean isPowerOfThree(int n) {

        for(int x = 0; x < 31; x++) {
            if(n == Math.pow(3,x)) {
                return true;
            }
        }   

        return false;
    }
}