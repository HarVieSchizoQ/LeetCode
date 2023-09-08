class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int maxCon = 0;
        
        for (int n: nums)
            set.add(n);
            
        for (int num: nums) {
            if (!set.contains(num - 1)) {
                int forward = 1;
                int curLen = 1;
                
                while (set.contains(num + forward)) {
                    forward++;
                    curLen++;
                }
                
                maxCon = Math.max(maxCon, curLen); 
            }
        }
            
        return maxCon;
    }
}
