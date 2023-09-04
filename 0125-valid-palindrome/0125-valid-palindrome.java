class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int left = 0, right = s.length() - 1;

        while (left < right) {

            while ((!Character.isAlphabetic(s.charAt(left)) || Character.isWhitespace(s.charAt(left))) && left < right && !Character.isDigit(s.charAt(left))) 
                left++;

            while ((!Character.isAlphabetic(s.charAt(right)) || Character.isWhitespace(s.charAt(right))) && left < right && !Character.isDigit(s.charAt(right)))
                right--;

            if (s.charAt(left) != s.charAt(right)) 
                return false;

            left++;
            right--;
        }
        return true;
    }
}