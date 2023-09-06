class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int removeIndex = 0, maxLen = 0;
        
        for (int i = 0; i < s.length(); i++) {
            while (set.contains(s.charAt(i))) {
                set.remove(s.charAt(removeIndex));
                removeIndex++;
            }
            set.add(s.charAt(i));
            maxLen = Math.max(maxLen, set.size());
        }
        return maxLen;
    }
}