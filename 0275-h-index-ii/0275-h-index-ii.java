class Solution {
    public int hIndex(int[] c) {
        int l=0,h=c.length-1,k=c.length;
        while(l<=h)
        {
            int m=(l+h)/2;
            if(c[m]==(k-m))
                return k-m;
            else if(c[m]>(k-m))
                h=m-1;
            else
                l=m+1;
        }
        return k-l;
    }
}