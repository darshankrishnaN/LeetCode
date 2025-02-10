class Solution {
    public int[] sortArrayByParity(int[] nums) {
        
        int n = nums.length;
        int temp = 0;
        int i = 0;
        int j = n-1;

        while(i<j){
            while(i<j && nums[j]%2!=0){
            j--;
        }

           while(i<j && nums[i]%2==0){
            i++;
        }
        
        if(i<j){
            temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
    
        
    }
              return nums;

    }
}



      