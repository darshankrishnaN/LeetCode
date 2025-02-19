class Solution {
    public int maxScore(int[] cardPoints, int k) {
         
    int lsum = 0;
    for(int i=0;i<=k-1;i++){
        lsum+=cardPoints[i];
    }

    int max = lsum;
    int j = cardPoints.length-1;
    int rsum = 0;
   

    for(int i=k-1;i>=0;i--){
        lsum -= cardPoints[i];
        rsum += cardPoints[j];
        j--;

        max = Math.max(max,lsum+rsum);
    }
    return max;

    }
}