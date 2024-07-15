class Solution {
    public void setZeroes(int[][] matrix) {
       int m = matrix.length;
        int n = matrix[0].length;
        
        int[] colM = new int[m];  // Creates an array of size m with all elements initialized to 0
        int[] colN = new int[n];  // Creates an array of size n with all elements initialized to 0

        // First pass to find the zeros
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    colM[i] = 1;
                    colN[j] = 1;
                }
            }
        }

        // Second pass to set matrix elements to zero where necessary
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (colM[i] == 1 || colN[j] == 1) {
                    matrix[i][j] = 0;
                }
            }
        }

     
    }
}