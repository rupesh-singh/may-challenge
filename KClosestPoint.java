class Solution {
    public int[][] kClosest(int[][] points, int K) {
     
        int dist[] = new int[points.length];
        for(int i=0;i<points.length;i++){
            dist[i]= dist(points[i][0], points[i][1]);
        }
        
        Arrays.sort(dist);
     int distK = dist[K-1];

        int[][] ans = new int[K][2];
        int t = 0;
        for (int i = 0; i < points.length; ++i)
            if (dist(points[i][0], points[i][1]) <= distK)
                ans[t++] = points[i];
        return ans;
        
        
//         List<point> li = new ArrayList<>();
        
//         for(int[] a: points){
//             point p = new point(a[0],a[1], Math.sqrt(Math.pow(Math.abs(a[0]),2)+ Math.pow(Math.abs(a[1]),2)));
//             li.add(p);
//         }
        
//         Collections.sort(li, new Comparator<point>(){
//             public int compare(point p1, point p2){
//                 return Double.valueOf(p1.dist).compareTo(Double.valueOf(p2.dist));
//             }
//         });
        
//         int[][] out = new int[K][2];
        
//         for(int i = 0;i<K;i++){
//                 point p = li.get(i);
//                 out[i][0]=p.getP1();
//                 out[i][1]=p.getP2();
//             }
//         return out;
    }
    
    public int dist(int p1, int p2) {
        return p1*p1 + p2*p2;
    }
}

// class point{
//     int p1;
//     int p2;
//     double dist;
//     point(int p1,int p2, double d){
//         this.p1=p1;
//         this.p2=p2;
//         this.dist = d;
//     }    
// }