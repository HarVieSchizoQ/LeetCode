
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int max = findMax(candies);

class Solution {
        for (int candy: candies) {
            if (extraCandies + candy >= max)
                result.add(true);
            else
                result.add(false);
        }
[
