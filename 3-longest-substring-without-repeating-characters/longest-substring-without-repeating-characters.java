class Solution {
    public int lengthOfLongestSubstring(String s) {
    
      int left = 0;
      int right = 0;
      int len = 0;
      HashMap <Character,Integer> mp = new HashMap<>();

      while(right<s.length()){
          if(mp.containsKey(s.charAt(right)))
          {

            left = Math.max(mp.get(s.charAt(right))+1,left);
          }
          
          mp.put(s.charAt(right),right);

          len = Math.max(len,right-left+1);
          right++;
      }
      return len;
    }
}


        
      
      
      
      