class Solution {
    public int[] twoSum(int[] nums, int target) {
            HashMap<Integer,Integer> hm = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int rn = target - nums[i];
          if(hm.containsKey(rn)){
            int[] arr = {hm.get(rn),i};
            return arr;
          }
          hm.put(nums[i],i);
        }
        return null;
    }
}


         
     
 