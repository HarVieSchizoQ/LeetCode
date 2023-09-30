class Solution {
    public String mergeAlternately(String word1, String word2) {
        String res = "";
        int w1 = 0, w2 = 0, i = 0;

        while (w1 < word1.length() && w2 < word2.length()) {
           
            if (i % 2 == 0) {
                res += word1.charAt(w1);
                w1++;
            } else {
                res += word2.charAt(w2);
                w2++;
            }
            i++;
        }

        if (w1 != word1.length())
            res += word1.substring(w1);
        if (w2 != word2.length())
            res += word2.substring(w2);

        return res;
    }
}