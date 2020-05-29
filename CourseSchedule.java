class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        if(prerequisites.length==0)
            return true;
        int[] out = new int[numCourses];
        List<List<Integer>> li = new LinkedList<>();
        
        for(int i=0;i<numCourses;i++)
            li.add(new LinkedList<Integer>());
        
        for( int[] a : prerequisites){
         li.get(a[1]).add(a[0]);
         out[a[0]]++;
        }
        
        // for(int i=0;i<li.size();i++)
        //     System.out.println(i+":=>"+li.get(i));
        
        int index=-1;
        for(int i = 0;i<numCourses;i++){
            index = -1;
            for(int j=0;j<numCourses;j++){
                if(out[j]==0){
                    index=j;
                    break;
                }
            }
            // System.out.println(index);
            if(index==-1)
                return false;
            else{
                for(int k = 0;k<li.get(index).size();k++){
                    if(out[li.get(index).get(k)]>0)
                        out[li.get(index).get(k)]--;
                }
                out[index]=-1;
            }
        }
        return true;
    }
}