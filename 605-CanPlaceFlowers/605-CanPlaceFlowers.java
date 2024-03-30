
            if (i != 0)
                left = flowerbed[i - 1];

            if (flowerbed[i] == 0 && left == 0 && right == 0) {
                n--;
                flowerbed[i] = 1;
            }    
        }

        return n <= 0;
    }
}
[
