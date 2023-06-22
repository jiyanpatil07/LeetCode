class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer>hs=new HashSet<>();
        int maxStreak=0;
        for(int num:nums) hs.add(num);
      for(int num:hs){
          if(!hs.contains(num-1)){
              int currentNum=num;
              int currentStreak=1;
              while(hs.contains(currentNum+1)){
                  currentStreak++;
                  currentNum++;
              }
              maxStreak=Math.max(currentStreak,maxStreak);
          }
    }
        return maxStreak;
}
}