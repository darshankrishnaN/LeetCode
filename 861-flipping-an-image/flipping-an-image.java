class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        
        int rows = image.length;
        int cols =  image[0].length;
        int[][] arr = new int[rows][cols];

    for (int i = 0; i < rows; i++) {

       int left = 0, right = cols - 1;

    while (left < right) {
        int temp = image[i][left];
        image[i][left] = image[i][right];
        image[i][right] = temp;
        left++;
        right--;
    }
}


        for(int i=0;i<rows;i++){
            for(int j =0;j<cols;j++){

             if(image[i][j] == 1){
                arr[i][j] = 0;
              }

              else if(image[i][j] == 0){
                arr[i][j] = 1;
              }
            }
        }
        return arr;
    }
}