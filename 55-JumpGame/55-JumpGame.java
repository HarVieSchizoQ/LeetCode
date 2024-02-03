class Solution {
    public boolean canJump(int[] nums) {
        int goal = nums.length - 1;
        for (int i = nums.length - 2; i >= 0; i--) {

            if (nums[i] + i >= goal)
        } 
    }
                goal--;

        return goal != nums.length - 1 && nums[0] != 0 ? true : false;
        if (nums.length == 1)
            return true;

}
[
