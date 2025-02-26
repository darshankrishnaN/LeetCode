class Solution {
    public int[] buildArray(int[] nums) {
    int[] ans = new int[nums.length]; // Initialize the answer array

    for (int i = 0; i < nums.length; i++) {
        int value = nums[i]; // Get value from nums at index i
        ans[i] = nums[value]; // Use value as an index to get nums[value]
    }

    return ans;
}
}
