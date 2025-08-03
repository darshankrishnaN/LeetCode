class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        

        if((mat.length * mat[0].length) != (r*c)){
             return mat;
        }

        int[][] arr = new int[r][c];
        int rn = 0;
        int cn = 0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                 
                 arr[rn][cn] = mat[i][j];
                 cn++;

                 if(cn == c){
                    cn = 0;
                    rn++;
                 }
            }
        }
         return arr;
    }
   
}
