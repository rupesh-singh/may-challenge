class Solution {
    public int countSquare(int[][] matrix) {
     
        int r[][] = new int[matrix.length+1][matrix[0].length+1]; 
        int sum=0;
        for(int i = 1;i<=matrix.length;i++)
            for(int j=1;j<=matrix[0].length;j++)
                if(matrix[i-1][j-1]!=0){
                r[i][j] = Math.min( Math.min(r[i-1][j],r[i][j-1]) , r[i-1][j-1])+1;
                    // System.out.println(r[i][j]);
                    sum = sum + r[i][j];
                }
     
        return sum;
    }
    

}