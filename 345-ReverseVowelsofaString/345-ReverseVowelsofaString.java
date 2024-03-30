                char temp = arrayStr[left];
                arrayStr[left] = arrayStr[right];
                arrayStr[right] = temp;
            if (!rV) right--;
            if (lV && rV) {

            if (!lV) left++;
            boolean lV = isVowel(arrayStr[left]);
            boolean rV = isVowel(arrayStr[right]);
        while (left < right) { 
                left++;
                right--;
            }
        }   

        return new String(arrayStr);
    } 
"
