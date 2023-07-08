class Solution {
    public int[] separateDigits(int[] nums) {
        int count=0;
                    ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            String currentNum = Integer.toString(nums[i]);
            System.out.println(currentNum);
            for (int j = 0; j < currentNum.length(); j++) {
                System.out.println(currentNum.charAt(j));
                count++;
                              arrayList.add(Integer.parseInt(String.valueOf(currentNum.charAt(j))));

            }
    
        } 
        int[] array = new int[arrayList.size()];
        for(int i=0;i<array.length;i++){
            
            array[i]=arrayList.get(i);
            
        }
               
        return array;
    }
}