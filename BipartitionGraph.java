class Solution {
    public boolean possibleBipartition(int N, int[][] dislikes) {
        int[] color = new int[N+1];
        List<List<Integer>> graph = new ArrayList<>();
        
        for (int i = 0; i <= N; i++) {
            List<Integer> tmp = new ArrayList<>();
            graph.add(tmp);
        }
        for (int i = 0; i < dislikes.length; i++) {
            int m = dislikes[i][0];
            int n = dislikes[i][1];
            graph.get(m).add(n);
            graph.get(n).add(m);
        }
        
        
        Queue<Integer> q = new LinkedList<>();
        for(int i = 1;i<=N;i++){
        
            if(color[i]==0)
                color[i]=1;
            q.offer(i);
            
            while (q.size()!=0){
                int curr = q.poll();
                
                for(int j : graph.get(curr)){
                    if(color[j]==0){
                        color[j]=color[curr]==1?2:1;
                        q.offer(j);
                    }
                    else if(color[j]==color[curr]){
                        System.out.println(i+" "+j);
                        return false;
                    }
                }
                
            }
        }
        return true;
        
    }
    
}