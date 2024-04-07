        for (int i = k; i < nums.length; i++) {
            int inner = nums[i - k];
            int current = nums[i];
            
            currSum -= inner;
            currSum += current;
            
        max = currSum / k;
        
            
            max = Math.max(max, currSum / k);
        }

        return max;
    }
}
[
