public class Solution {
    public int maxSubarraySumCircular(int[] A) {
     
        int flag=0, min=A[0];
        for(int i=0;i<A.length;i++){
            if(A[i]>0){
                flag=1;
                break;
            }
            if(min<A[i])
                min=A[i];
        }
        
        if(flag==0)
            return min;
        
        for(int i=0;i<A.length;i++)
            A[i]=-1*A[i];
        int m= Kadane(A);
        for(int i=0;i<A.length;i++)
            A[i]=-1*A[i];
        
        return Math.max(Kadane(A), Arrays.stream(A).sum() + m);
    }
    
    public int Kadane(int[] A){
        int prev=A[0], max=A[0];
        for(int i=1;i<A.length;i++){
            prev = ((prev+A[i])>A[i])?prev+A[i]:A[i];
            if(prev>max)
                max=prev;
        }
        return max;
    }
}class MaxSubCircularArray {
    
}