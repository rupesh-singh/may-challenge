class Solution {
        
    public String frequencySort(String s) {
        HashMap<Character,Integer> hm = new HashMap<>();
        
        for(char c: s.toCharArray()){
            if(hm.containsKey(c)){
                hm.put(c, hm.get(c)+1);
            }
            else
                hm.put(c,1);
        }
        
         Map<Character,Integer> sortedMap = 
            hm.entrySet()
              .stream()
              .sorted((k1,k2)-> k2.getValue().compareTo(k1.getValue()))
              .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(e1, e2)->e1,LinkedHashMap::new));   
        String o="";
        for(Map.Entry<Character,Integer> e : sortedMap.entrySet()){
            for(int i=1;i<=e.getValue();i++)
                o=o+e.getKey();
        }
        return o;
    }
}