class Solution {
    public int searchInsert(int[] nums, int target) {
        
        boolean flag = false;
        int min = 0;
        for(int i = 0; i < nums.length; i++) {
            if(target == nums[i])
                return i;
            else {
                if(target > nums[nums.length - 1]) return nums.length;
                if(target >= nums[i] && target <= nums[i + 1]) min = i + 1;
            }
        }
        return min;
    }
}    