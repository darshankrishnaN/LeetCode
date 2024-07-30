class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxcandies = 0;
        for(int c : candies){

            maxcandies = Math.max(c,maxcandies);
        }

        List<Boolean> ans = new ArrayList<>();
        for(int d : candies){
            if(d + extraCandies >= maxcandies){
               ans.add(true);
            }
            else{
                ans.add(false);
            }
        }
        return ans;
    }
}

