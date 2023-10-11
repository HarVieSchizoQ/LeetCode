class Solution {
    public String reverseWords(String s) {
        StringBuilder result = new StringBuilder();
        boolean flag = true;

        for (int i = 0; i < s.length(); i++) {
            if (!Character.isWhitespace(s.charAt(i))) {
                int j = i + 1; 
                while (j < s.length() && !Character.isWhitespace(s.charAt(j)))
                    j++;
                if (flag)
                    result.insert(0, s.substring(i, j));
                else
                    result.insert(0, s.substring(i, j) + " ");

                flag = false;
                i = j;
            }
        }

        return result.toString();
    }
}