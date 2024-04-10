               
            if (s.charAt(left) != s.charAt(right))
                return false;
            while (!Character.isAlphabetic(s.charAt(right)) && right > 0)
                right--;
        while (left < right) { 
            
            while (!Character.isAlphabetic(s.charAt(left)) && left < right)
                left++;
            
        s = s.toLowerCase();
        
                
            left++;
            right--;
            
                
"
