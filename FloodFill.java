class Solution {
    int visited[][] = null;
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        if(image.length==0)
            return image;
        visited= new int[image.length][image[0].length];
        flood(image,sr,sc,newColor,image.length,image[0].length, image[sr][sc]);
        return image;
    }
    
    public void flood(int[][] image, int sr, int sc, int newColor, int n, int m, int old) {
      
        if(sr<0 || sr>=n || sc<0 || sc>=m)
            return;
      
          // System.out.println(sr+"  "+sc);
        if(visited[sr][sc]==1 || image[sr][sc]!=old)
            return;
        
        visited[sr][sc]=1;
        image[sr][sc]=newColor;
        
        flood(image, sr-1,sc,newColor,n,m,old);
        flood(image, sr,sc-1,newColor,n,m,old);
        flood(image, sr+1,sc,newColor,n,m,old);
        flood(image, sr,sc+1,newColor,n,m,old);
        
    }
}