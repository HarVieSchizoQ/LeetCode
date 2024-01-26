            } else {
                b--;
                nums1[x] = nums1[a];
            }
                a--;
            x--;
        } 

        while (b >= 0) {
            nums1[x] = nums2[b];
            b--;
            x--;
        }
    }  
}
[
