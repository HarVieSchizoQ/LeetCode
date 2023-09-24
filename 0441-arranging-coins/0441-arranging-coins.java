class Solution {
    public int arrangeCoins(int n) {
        int l = 1, r = n;
        int max = 0;
        
        while (l <= r) {
            int m = l + (r - l) / 2;
            double calc = ((double)m * (m + 1) / 2); 
            
            if (calc > n)
               r = m - 1;
            else {
               l = m + 1;
               max = Math.max(max,m);
            } 
            
        } 
        return max;
    }
}