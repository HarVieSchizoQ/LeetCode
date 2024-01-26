class Solution {
    public String longestCommonPrefix(String[] strs) {
        String base = strs[0];
        String result = "";

        for (int i = 0; i < base.length(); i++) {
            char current = base.charAt(i);
            for(int j = 0; j < strs.length; j++) {
                String str = strs[j];
                
                if (i >= str.length() || current != str.charAt(i))
                    return result;
            }
            result += current;
        
        }

        return result;
    }
}
[
