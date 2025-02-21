class Solution {
    public int numberOfSubstrings(String s) {
    
       
       
        int count=0;
        int i=0;
        Map<Character,Integer> map=new HashMap<>();
        for(int j=0;j<s.length();j++)
        {
             map.put(s.charAt(j),map.getOrDefault(s.charAt(j),0)+1);
            while(map.size()==3)
            {
                count=count+s.length()-j;
                 map.put(s.charAt(i),map.get(s.charAt(i))-1);
                if(map.get(s.charAt(i))==0)
                {
                    map.remove(s.charAt(i));
                }
                i++;
            }
           
        }
        return count;

        
    }
}
  