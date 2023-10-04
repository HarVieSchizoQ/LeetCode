class Solution {
    public int maximumSum(int[] arr) {
        int prevWithNotDeleted = arr[0], prevWithDeleted = 0;
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            prevWithDeleted = Math.max(prevWithNotDeleted, prevWithDeleted + arr[i]);
            prevWithNotDeleted = Math.max(prevWithNotDeleted + arr[i], arr[i]);
            max = Math.max(max, Math.max(prevWithDeleted, prevWithNotDeleted));
        }
        return max;
    }
}