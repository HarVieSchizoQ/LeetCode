            if (mat.length % 2 == 0)
                sum += mat[j++][i]; 
            else {
                if (j != mat.length / 2)
                    sum += mat[j++][i];         
                else
                    j++;
            }        
        }

        return sum;
    }
}
[
