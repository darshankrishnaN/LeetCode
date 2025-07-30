class Solution {
    public int maximumWealth(int[][] accounts) {
        
   int sum =0;
   int max = 0;

  
   for(int i=0;i<accounts.length;i++)  //row
   {
      sum=0;
    for(int j =0;j<accounts[i].length;j++) // col
    {   
     
        sum +=  accounts[i][j];
     

    }
       max = Math.max(sum,max);
       
   }
       return max;
    }
}

