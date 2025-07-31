class Solution {
    public int[] shuffle(int[] nums, int n) {
    
    int k =0;
    int[] arr = new int[nums.length];
    
    int i = 0;
    int j = n;
    while(k<nums.length){

        arr[k++] = nums[i];
        arr[k++] = nums[j];

        i++;
        j++;
    }
    return arr;
    }
}

      
      


      