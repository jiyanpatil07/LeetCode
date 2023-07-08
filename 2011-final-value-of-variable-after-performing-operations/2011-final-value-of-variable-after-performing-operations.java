class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int output=0;
        for (int i = 0; i < operations.length; i++) {
            if (operations[i].contains("+")) {
                output++;
            }
            else{
                output--;
            }
        }
        return output;
    }
}