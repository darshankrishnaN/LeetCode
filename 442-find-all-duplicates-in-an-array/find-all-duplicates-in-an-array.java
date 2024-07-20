class Solution {
    public List<Integer> findDuplicates(int[] nums) {
   
        Set<Integer> hm = new HashSet<Integer>(); 
        List<Integer> res = new ArrayList<Integer>();
        for(int i:nums){
            if(hm.contains(i)){
                res.add(i);
            }
            hm.add(i);

        }
        return res;
    }
}
