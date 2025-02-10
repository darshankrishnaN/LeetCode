class Solution {
    public String clearDigits(String s) {
        
        Stack<Character> ck = new Stack<>();
           for(char c : s.toCharArray()){

           if(c >= '0' && c<='9'){
             ck.pop();
             
           }
           else{
            ck.push(c);
           }
        }
        String res="";
        for(char c : ck){
            res+=c;
        }
        return res;

    }
}

