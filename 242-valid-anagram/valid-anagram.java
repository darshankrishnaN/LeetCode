class Solution {
    public boolean isAnagram(String s, String t) {
     
     if(s.length() != t.length() ){
        return false;
     }
     char[] c = s.toCharArray();
     char[] r = t.toCharArray();

     Arrays.sort(c);
      Arrays.sort(r); 

return Arrays.equals(c,r);
    }
}


