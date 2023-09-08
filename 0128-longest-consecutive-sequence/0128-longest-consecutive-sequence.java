class Solution {
    public int longestConsecutive(int[] nums) {
        Map<Integer, Boolean> map = new HashMap<>();
        int maxCon = 0;
        
        for (int n: nums)
            map.put(n, false);
            
        for (int num: nums) {
            if (!map.containsKey(num - 1)) {
                int forward = 1;
                int curLen = 1;
                
                while (map.containsKey(num + forward) && map.get(num) == false) {
                    forward++;
                    curLen++;
                }
                
                maxCon = Math.max(maxCon, curLen); 
                map.put(num, true);
            }
        }
            
        return maxCon;
    }
}
