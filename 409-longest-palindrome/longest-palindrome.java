class Solution {
    public int longestPalindrome(String s) {
        
        int[] ch = new int[128];

        for(char c : s.toCharArray()){
            ch[c]++;
        }
        int result =0;

        for(int i : ch){
            result += i/2 * 2;
        }

        if(result < s.length()){
            result+=1;
        }
           return result;
    }
}