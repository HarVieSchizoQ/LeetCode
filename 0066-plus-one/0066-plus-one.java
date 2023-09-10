class Solution {
    public int[] plusOne(int[] digits) {
        int carry = 0;
        
        for (int i = digits.length - 1; i >= 0; i--) {
            
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
            carry = 1;
            
        }
        int[] res = new int[digits.length + 1];
        res[0] = 1;
        return res;
    }
}