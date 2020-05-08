class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
     
        int m = getSlope(coordinates[0][0], coordinates[0][1], coordinates[1][0], coordinates[1][1]);
        int c = getConstant(coordinates[0][0], coordinates[0][1], m);
        
        for(int i =0;i<coordinates.length;i++){
            if(coordinates[i][1]!= (m * coordinates[i][0] + c))
                return false;
        }
        return true;
    }
    
    public int getSlope(int x1, int y1, int x2, int y2){
         return ((x2-x1)==0)?0:(y2-y1)/(x2-x1);
    }
    
    public int getConstant(int x1, int y1, int slope){
        return y1- slope * x1;
    }
}