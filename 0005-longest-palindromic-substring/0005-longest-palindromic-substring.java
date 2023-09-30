class Solution {
    public String longestPalindrome(String s) {
        if (s.length() == 1) return s;
        
        String LPS = "";

        for (int i = 1; i < s.length(); i++) {
            int low = i, high = i;

            while (low >= 0 && high < s.length() && s.charAt(low) == s.charAt(high)) {
                low--;
                high++;
            }
            
            String palindrome = s.substring(low + 1, high);
            if (palindrome.length() > LPS.length())
                LPS = palindrome;
            
            // handle odd palindromes
            low = i - 1; 
            high = i;
            
            while (low >= 0 && high < s.length() && s.charAt(low) == s.charAt(high)) {
                low--;
                high++;
            }
            
            palindrome = s.substring(low + 1, high);
            if (palindrome.length() > LPS.length())
                LPS = palindrome;
        }
        
        return LPS;
    }
}