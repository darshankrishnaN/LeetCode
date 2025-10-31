class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        
    HashMap<Integer,Integer> map = new HashMap<>();
 

        for(int i=0;i<nums.length;i++){
            
          if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
           else{
               map.put(nums[i],1);

            }
            }
            
            int count=0;
            for(int key : map.keySet()){
             int values = map.get(key); 
                if(values>=2){
                   count++;
                }
            }

        int[] ans = new int[count];

         int index = 0;

        // Step 4: Fill ans array
        for (int key : map.keySet()) {
            int value = map.get(key);
            if (value >= 2) {
                ans[index++] = key;
            }
        }
           
          return ans; 
    }
}