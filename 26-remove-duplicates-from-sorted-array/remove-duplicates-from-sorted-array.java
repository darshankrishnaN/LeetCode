class Solution {
    public int removeDuplicates(int[] nums) {
    
   int k =0;
   int n = nums.length;
   int count = 0;
    
for(int i=1 ;i<n;i++){
    if(nums[k]!=nums[i]){
        nums[k+1]=nums[i];
        k++;
        count++;
    }
   
}
return count+1;
    }
}
