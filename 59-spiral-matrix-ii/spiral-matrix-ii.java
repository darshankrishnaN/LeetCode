class Solution {
    public int[][] generateMatrix(int n) {
        

        int[][] arr = new int[n][n];
        
        int end = n*n;
        int val=1;
        int rowbegin = 0;
        int rowend  = arr.length-1;
        int colbegin = 0;
        int colend = arr[0].length-1;
        while (rowbegin <= rowend && colbegin <= colend)  {
        for(int i = colbegin; i<=colend ; i++){
           arr[rowbegin][i]=val++;
        }
        rowbegin++;

        for(int i=rowbegin ; i<=rowend ;i++){
            arr[i][colend]=val++;
        }
        colend--;  
        
        if(rowbegin <= rowend){
        for(int i=colend ; i>=colbegin ;i--){
            arr[rowend][i]=val++;
        }
        }
        rowend--;
       
        if(colbegin <= colend){
        for(int i=rowend ; i>=rowbegin ;i--){
            arr[i][colbegin]= val++;
        }
        }
        colbegin++;

    }
    return arr;
}
}
