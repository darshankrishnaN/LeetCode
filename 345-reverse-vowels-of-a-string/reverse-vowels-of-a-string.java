class Solution {
    public String reverseVowels(String s) {
       char[] arr = s.toCharArray();
       int i=0;
       int j=arr.length-1;

       while(i<j){
        if(arr[i]=='i' || arr[i]== 'e' || arr[i]== 'o' || arr[i]== 'a' || arr[i]== 'u' || arr[i]== 'A' || arr[i]== 'E' || arr[i]== 'I' || arr[i]== 'O' || arr[i]== 'U' ){
        if( arr[j]== 'a' || arr[j]== 'e' || arr[j]== 'o' || arr[j]== 'i' || arr[j]== 'u' || arr[j]== 'A' || arr[j]== 'O' ||  arr[j]== 'E' ||  arr[j]== 'I' ||  arr[j]== 'U'){
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        i++;
        j--; 
        }
       else{
        j--;
       }
        }
        else{
            i++;
        }
       }
        return String.valueOf(arr);
    }
}
       
       
