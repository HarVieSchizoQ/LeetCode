class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> set = new HashSet<>();
        Arrays.sort(nums);
        
        for (int i = 0; i < nums.length - 2; i++) {
            int low = i + 1;
            int high = nums.length - 1;
            
            while (low < high) {
                if (nums[i] + nums[low] + nums[high] == 0) {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[low]);
                    list.add(nums[high]);
                    set.add(list);
                    high--;
                    low++;
                } else if (nums[i] + nums[low] + nums[high] > 0)
                    high--;
                else 
                    low++;
            }
        }
        
        return new ArrayList<>(set);
    }
}