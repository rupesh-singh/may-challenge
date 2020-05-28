class Solution {
    public int[] countBits(int num) {
        int[] count = new int[num+1];
        
        for(int i = 1; i<=num;i++ ){
            int c = 0;
            
            count[i]=count[i/2]+i%2;
        }
        return count;
    }
}