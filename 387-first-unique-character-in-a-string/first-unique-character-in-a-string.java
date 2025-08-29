class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> m = new HashMap<>();
        
        for(int i=0;i<s.length();i++){

            if(m.containsKey(s.charAt(i))){
                m.put(s.charAt(i),2);
            }

            else{
                m.put(s.charAt(i),1);
            }
        }
            
     for(int i=0;i<s.length();i++){

        if(1 == m.get(s.charAt(i))){

            return i;
        }
     }

        
        return -1;
          
           

        }
    }
