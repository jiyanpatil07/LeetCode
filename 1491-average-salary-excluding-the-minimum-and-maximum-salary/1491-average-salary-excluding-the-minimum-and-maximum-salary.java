class Solution {
    public double average(int[] salary) {
        int sum=0, max=Integer.MIN_VALUE, min=Integer.MAX_VALUE;
        
        for(int i=0;i<salary.length;i++){
            sum += salary[i];
            max = Math.max(max, salary[i]);
            min = Math.min(min, salary[i]);
        }
        
        sum -= (min + max);
        return (double)sum/ (double)(salary.length-2);
    }
}
