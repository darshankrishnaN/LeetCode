class Solution {
    public int countGoodSubstrings(String s) {
        
        int r = 0;
        int l =0;
        int count = 0;
        int n = s.length();

        while(r<n){
           
           if(r-l+1 == 3){
            if(s.charAt(l) != s.charAt(l+1) && s.charAt(l) != s.charAt(l+2) && s.charAt(l+1) != s.charAt(l +2)  ){
                count++;
            }
            l++;
           }
           r++;

        }
        return count;
    }
}


        


