                left++;
                right--;    
            }
        }

        for (String str: strArr) {
           if (!str.isEmpty())
                res.append(str + " ");
        }   

                strArr[right] = temp;

                String temp = strArr[left];
                strArr[left] = strArr[right];
                right--;    
            
            if (!strArr[left].isEmpty() && !strArr[right].isEmpty()) {
"
