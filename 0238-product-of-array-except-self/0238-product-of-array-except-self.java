class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] left = new int[nums.length];
        int[] right = new int[nums.length]; 
        int leftCounter = 1, rightCounter = nums.length - 2; 
        
        left[0] = 1;
        right[right.length - 1] = 1;
        
        int prod = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            prod *= nums[i];
            left[leftCounter++] = prod; 
        }
        
        prod = 1;
        for (int i = nums.length - 1; i > 0; i--) {
            prod *= nums[i];
            right[rightCounter--] = prod;
        }
        
        int[] res = new int[nums.length];
        for (int i = 0; i < res.length; i++)
            res[i] = left[i] * right[i];
        
        return res;
        
    }
}