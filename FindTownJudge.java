class Solution {
    public int findJudge(int N, int[][] trust) {
        HashMap<Integer,Integer> hm= new HashMap<>();
        if(N==1)
            return 1;
        for(int i=0;i<trust.length;i++){
            if(hm.containsKey(trust[i][1]))
                hm.put(trust[i][1],hm.get(trust[i][1])+1);
            else
                hm.put(trust[i][1],1);
        }
        int flag=0;
        for(Map.Entry<Integer,Integer> entry : hm.entrySet()){
            flag=0;
            if(entry.getValue()==(N-1)){
                for(int i=0;i<trust.length;i++){
                    if(trust[i][0]==entry.getKey()){
                        flag=1;
                        break;
                    }
            }
                if(flag==0)
                    return entry.getKey();
            }
        }
        return -1;
    }
}