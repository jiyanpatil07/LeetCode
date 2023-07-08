class Solution {
    public int mostWordsFound(String[] sentences) {
      int result=0;
        for(int i=0;i<sentences.length;i++){
            
            int currentLength=sentences[i].split(" ").length;
            System.out.println(currentLength);
            if(currentLength>result){
                result=currentLength;
            }
            
        }
        return result;
    }
}