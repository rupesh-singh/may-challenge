class Solution {
    public int[][] intervalIntersection(int[][] A, int[][] B) {
        List<int[]> out = new ArrayList<>();
        if(A.length==0 || B.length==0 )
            return new int[0][];
        int a=0, b=0,c=0;
        int astart = A[0][0], aend=A[0][1], bstart=B[0][0], bend = B[0][1], ostart=0, oend=0;
        while(a<A.length && b<B.length){
            
            if(A[a][0]>= B[b][0]){
                ostart = A[a][0];
            }
            else{
                ostart=B[b][0];
            }
            
            if(A[a][1]>= B[b][1]){
                oend = B[b][1];
                b++;
            }
            else{
                oend=A[a][1];
                a++;
            }
            // System.out.println("hello: "+ostart+","+oend);
            if(ostart<=oend)
            out.add(new int[]{ostart,oend});        
                
        }
        
        return out.toArray(new int[out.size()][]);
    }
}