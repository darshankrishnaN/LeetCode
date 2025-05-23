class Solution {
    public String mergeAlternately(String word1, String word2) {
          StringBuilder sb = new StringBuilder();
          int i=0;
          int j=0;
          int n1 = word1.length();
          int n2 = word2.length();
        
        while(i<n1 || j<n2){
             if(i<n1){
                sb.append(word1.charAt(i));
             }
             if(j<n2){
                sb.append(word2.charAt(j));
             }
             i++;
             j++;
            
        }
        return sb.toString();
    }
}