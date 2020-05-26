class Solution {
    public int findMaxLength(int[] nums) {
     
      HashMap<Integer, Integer> hm = new HashMap<>();
      int c=0, max=0;
        hm.put(0,-1);
        for(int i = 0;i<nums.length;i++){
          if(nums[i]==0)
              c=c-1;
        else
            c=c+1;
            if(hm.containsKey(c)){
                max = Math.max(max,i - hm.get(c));
            }
            else{
                hm.put(c,i);
            }
      }
        return max;
        
    }
}