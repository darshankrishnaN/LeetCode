class Solution {
    public void setZeroes(int[][] matrix) {
       int m = matrix.length;
       int n = matrix[0].length;
        
    int[] colM = new int[m];
    int[] colN = new int[n];
    
     for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
             
        if(matrix[i][j]==0){
            colM[i]=1;
            colN[j]=1;
        }

        }
     }

    for(int i=0;i<m;i++){
    for(int j=0;j<n;j++){
        if(colM[i]==1 || colN[j]==1){
            matrix[i][j] = 0;
        }
    }
    }
   
    }
}



     

 