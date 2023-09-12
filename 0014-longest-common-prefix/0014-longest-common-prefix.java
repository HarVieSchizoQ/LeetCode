class Solution {
    public String longestCommonPrefix(String[] strs) {
        String s = strs[0];
        String res = "";
        
        for (int i = 0; i < s.length(); i++) {
            boolean flag = true;
            int x = 0;
            while (x < strs.length) {
                if (i < strs[x].length() && strs[x].charAt(i) != s.charAt(i)) {
                    flag = false;
                    return res;
                }
                if (i >= strs[x].length())
                    return res;
                x++;
            }
            if (flag)
                res += s.charAt(i);
        }
        return res;
    }
}