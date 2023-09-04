class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;
        
        HashMap<Character, Integer> map = new HashMap<>();
        
        for (int i = 0; i < s.length(); i++) {
            char sC = s.charAt(i);
            char tC = t.charAt(i);

            map.put(sC, map.getOrDefault(sC, 0) + 1);
            map.put(tC, map.getOrDefault(tC, 0) - 1);
        }

        for (int freq : map.values()) {
            if (freq != 0) 
                return false;
        }
        return true;
    }
}
