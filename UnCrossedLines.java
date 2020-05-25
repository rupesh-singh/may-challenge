class Solution {
    public int maxUncrossedLines(int[] A, int[] B) {
       int dp[][] = new int[B.length+1][A.length+1];
       
        for(int i =0;i<=B.length;i++)
            dp[i][0]=0;
        for(int i =0;i<=A.length;i++)
            dp[0][i]=0;
        
        for(int i = 1;i <= B.length;i++){
            for(int j=1;j <= A.length;j++){
                if(B[i-1]==A[j-1]){
                    dp[i][j] = dp[i-1][j-1]+1;
                }
                else{
                    dp[i][j]= (dp[i-1][j])>(dp[i][j-1])?dp[i-1][j]:dp[i][j-1];
                }
            }
        }
        return dp[B.length][A.length];
        
    }
}