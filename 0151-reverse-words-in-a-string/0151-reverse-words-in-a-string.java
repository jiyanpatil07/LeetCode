class Solution {
    public String reverseWords(String s) {
            String[] newString = s.trim().split("\\s+"); // Split by one or more spaces
        int i = 0;
        int j = newString.length - 1;
        while (i < j) {
            String temp = newString[i];
            newString[i] = newString[j];
            newString[j] = temp;
            i++;
            j--;
        }
        String result = String.join(" ", newString); // Join with a space between words
        return result;
    }
}