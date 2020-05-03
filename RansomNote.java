class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> hm= new HashMap<>();
        
        for(char c: magazine.toCharArray()){
            if(hm.containsKey(c))
                hm.put(c,hm.get(c)+1);
            else
                hm.put(c,1);
        }
        
        for(char c: ransomNote.toCharArray()){
            if(hm.containsKey(c) && hm.get(c)>=1)
                hm.put(c,hm.get(c)-1);
            else
                return false;
        }
        
        return true;
    }
}