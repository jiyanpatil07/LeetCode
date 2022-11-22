class Solution {
    public int[] sumZero(int n) {
        int newarr[] = new int[n];
        if(n%2==0){
            
            for(int i=0;i<n;i=i+2){
                newarr[i]=i+1;
                newarr[i+1]=-(i+1);
            }
            
            
        }
        else{
            for(int i=0;i<n-1;i=i+2){
                newarr[i]=i+1;
                newarr[i+1]=-(i+1);
            }
            newarr[n-1]=0;
        }
        return newarr;
        
    }
}