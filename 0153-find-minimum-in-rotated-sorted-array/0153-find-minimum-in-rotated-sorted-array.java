class Solution {
    public int findMin(int[] nums) {
        int low = 0, high = nums.length - 1; 
        int res = nums[0];
        
        while (low <= high) {
            if (nums[low] < nums[high]) {
                res = Math.min(res, nums[low]);
                break;
            }
            
            int mid = (low + high) / 2;
            res = Math.min(res, nums[mid]);
            if (nums[mid] >= nums[low])
                low = mid + 1;
            else 
                high = mid - 1;
        }
        return res;
    }
}