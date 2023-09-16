class Solution {
    public boolean canJump(int[] nums) {
//         if (nums.length == 1) 
//             return true;
        
//         if (nums[nums.length - 2] + nums.length - 2 < nums.length - 1)
//             return false;
        
//         int fIndex = nums.length - 2;
        
//         for (int i = nums.length - 3; i >= 0; i--) {
//              if (nums[i] + i >= fIndex) 
//                     fIndex = i;
             
//         }
        
//         return fIndex == 0 ? true: false;
        
        int maxReach = 0;
        
        for (int i = 0; i < nums.length; i++) {
            if (i > maxReach)
                return false;
            
            maxReach = Math.max(maxReach, nums[i] + i);
            
            if (maxReach >= nums.length - 1)
                return true;
        }
        
        return false;
    }
}