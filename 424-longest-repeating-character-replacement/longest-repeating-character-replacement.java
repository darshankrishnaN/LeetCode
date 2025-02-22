class Solution {
    public int characterReplacement(String s, int k) {
     
     int maxfreq = 0;
     int l = 0 ;
     int r = 0;
     int max = 0;
    HashMap<Character,Integer> mp = new HashMap<>();
     while(r<s.length()){

        mp.put(s.charAt(r),mp.getOrDefault(s.charAt(r),0)+1);
        maxfreq = Math.max(maxfreq , mp.get(s.charAt(r)));

        if((r-l+1) - maxfreq > k){
          mp.put(s.charAt(l),mp.get(s.charAt(l))-1);
          l++;
          }
          
          max = Math.max(max , r-l+1);
          r++;
 

     }
        return max;
    }
}