class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        
        int[] arr = modArr(flowerbed);
        
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] == 0 && arr[i - 1] != 1 && arr[i + 1] != 1) {
                arr[i]  = 1;
                n--;
            }    
        }
        
        return n <= 0 ? true: false;
    }
    
    int[] modArr(int[] arr) {
        int[] newArr = new int[arr.length + 2];
        
        System.arraycopy(arr, 0, newArr, 1, arr.length);
        return newArr;
    } 
}