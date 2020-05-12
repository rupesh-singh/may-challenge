class Solution {
    public int singleNonDuplicate(int[] nums) {
        int i=0;
        if(nums.length==1)
            return nums[0];
        while(i+1<nums.length){           
            if(nums[i]!=nums[i+1])
                return nums[i];
            
            i=i+2;
            
        }
      
        return nums[nums.length-1];
    }
}