class Solution {
    public int sumOfMultiples(int n) {
        ArrayList<Integer> list=new ArrayList<>();
        int sum=0;
        for(int i=1;i<=n;i++){
            
            if(i%3==0||i%5==0||i%7==0){
             sum=sum+i;
            }
            
            
            
        }
        System.out.println(list);
        return sum;
    }
}