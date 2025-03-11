class Solution {
    public int largestAltitude(int[] gain) {
        int max =0;
        int n = gain.length;
        int value =0;
        for(int i=0;i<n;i++){
          value+=gain[i];
           max = Math.max(max,value);
           }
        
        return max;
    }
}