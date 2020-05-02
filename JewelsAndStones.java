class Solution {
    public int numJewelsInStones(String J, String S) {
        HashMap<Character,Integer> hm= new HashMap<>();
        
        for(char s: S.toCharArray())
        {
            if(hm.containsKey(s)){
                hm.put(s,hm.get(s)+1);
            }
            else
                hm.put(s,1);
        }
    int count=0;
    for(char s: J.toCharArray()){
        if(hm.containsKey(s))
            count=count+hm.get(s);
    }
    return count;
}
}