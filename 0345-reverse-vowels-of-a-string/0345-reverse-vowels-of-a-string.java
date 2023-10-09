class Solution {
    public String reverseVowels(String s) {
       
        char[] ch = s.toCharArray();
        int l = 0, r = ch.length - 1; 
        
        while (l < r) {
            if (isVowel(ch[l]) && isVowel(ch[r])) {
                char temp = ch[l];
                ch[l] = ch[r];
                ch[r] = temp;
                l++;
                r--;
            } else if (isVowel(ch[l]))
                r--;
             else if (isVowel(ch[r]))
                 l++;
            else {
                l++;
                r--;
            }
        }
        
        return new String(ch);
    }
    
     public boolean isVowel(char ch) {
        char lowerCase = Character.toLowerCase(ch);
         
        return lowerCase == 'a' || lowerCase == 'e' ||
               lowerCase == 'i' || lowerCase == 'o' || lowerCase == 'u';
    }
}