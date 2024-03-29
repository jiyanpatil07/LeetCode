class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        findAll("(", 1, 0, result, n);
        return result;
    }
    
    void findAll(String current, int open, int close, List<String> result, int n) {
        if (current.length() == 2 * n) {
            result.add(current);
            return;
        }
        
        if (open < n) {
            findAll(current + "(", open + 1, close, result, n);
        }
        
        if (close < open) {
            findAll(current + ")", open, close + 1, result, n);
        }
    }
}
