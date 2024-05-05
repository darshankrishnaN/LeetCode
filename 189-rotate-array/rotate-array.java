class Solution {
    public void rotate(int[] nums, int k) {
    k%=nums.length;
     int n = nums.length;
     reversenum(nums,0,n-1);
      reversenum(nums,0,k-1);
       reversenum(nums,k,n-1);
}
public void reversenum(int[] nums,int i,int j){
    while(i<j){
        int temp = nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
        i++;
        j--;
    }

}
}
