class Solution {
    public int[] twoSum(int[] numbers, int target) {
  
        int n = numbers.length;
        int i = 0;
        int j = n - 1;
        int[] lag = new int[2]; // Fixed array declaration
        
        while (i < j) {
            if (numbers[i] + numbers[j] == target) {
                lag[0] = i+1; // Store first index
                lag[1] = j+1; // Store second index
                return lag; // Return as soon as we find the pair
            } 
            else if (numbers[i] + numbers[j] < target) {
                i++; // Move left pointer right if sum is too small
            } 
            else {
                j--; // Move right pointer left if sum is too large
            }
        }
        
        return new int[]{}; // Return empty array if no valid pair is found
    }
}

      
      