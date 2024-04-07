        for (int i = 0; i < s.length(); i++) {
            String current = "" + s.charAt(i);
            
            for (int j = i + 1; j < s.length(); j++) {
                if (!current.contains("" + s.charAt(j))) 
                    current += s.charAt(j);
                else 
                    break;
            }
            
            max = Math.max(max, current.length());
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        
class Solution {
"
