class Solution {
    public boolean checkInclusion(String p, String s) {
        
        int[] m= new int[26];
        
        for(int i=0;i<p.length();i++){
            m[p.charAt(i)-'a']++;
        }
        
        int start=0,end=0;
        while(end<s.length()){
            
            if(m[s.charAt(end)-'a']>0){
                m[s.charAt(end++)-'a']--;
            
                    if(end-start == p.length())
                       return true;
            }
            
            else if(start==end)
            {
                start++;
                end++;
            }
            
            else{
                m[s.charAt(start++)-'a']++;
            }
            
            
        }
    
    
        return false;
    }
}
