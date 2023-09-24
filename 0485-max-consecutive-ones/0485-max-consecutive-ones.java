class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int max = 0;
    
        for (int i = 0; i < nums.length; i++) {
             int len = 0;
            
             while (i < nums.length && nums[i] == 1) {
                len++;
                 i++;
             } 
            max = Math.max(max, len);
        }
        return max;
    }
}