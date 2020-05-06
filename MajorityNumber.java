class Solution {
    public int majorityElement(int[] nums) {
//         HashMap<Integer,Integer> hm= new HashMap<Integer,Integer>();
//         for(int a : nums){
//             if(hm.containsKey(a))
//                 hm.put(a,hm.get(a)+1);
//             else
//                 hm.put(a,1);
            
//             if(hm.get(a)>nums.length/2)
//                 return a;
//         }
        
//         return -1;
        
        int count =0;
        int candidate=0;
        
        for(int a: nums){
            if(count==0)
                candidate=a;
            if(a==candidate)
                count+=1;
            else
                count+=-1;
        }
        
        return candidate;
    }
}