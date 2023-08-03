class Solution {
    void helper(int idx,String dig,List<String> ans,String temp, HashMap<Character, String> map){
        if(idx == dig.length()){
            ans.add(temp);
            return;
        }
        String s = map.get(dig.charAt(idx));
        for(int i = 0; i<s.length();i++){
            String ns = temp+s.charAt(i);
            helper(idx+1,dig,ans,ns,map);
        }
    }
    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();   
        if(digits == null || digits.length() == 0) return ans;
        HashMap<Character, String> map = buildMap();
        helper(0,digits,ans,"",map);
        return ans;
    }
        private HashMap<Character, String> buildMap(){
        HashMap<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
        return map;
    }
}