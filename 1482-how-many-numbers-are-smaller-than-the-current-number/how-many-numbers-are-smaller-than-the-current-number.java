class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        
        int count = 0;
        int k =0;
        int[] arr = new int[nums.length];

        for(int i=0;i<nums.length;i++){
            count = 0;
            for(int j=0;j<nums.length;j++){

                if(j!=i && nums[j] < nums[i]){
                   count++;
              }
          
            }
                  arr[k++] = count;
                  
        }
        return arr;
}
}