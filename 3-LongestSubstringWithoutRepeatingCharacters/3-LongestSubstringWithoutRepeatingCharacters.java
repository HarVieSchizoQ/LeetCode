        for (int i = 0; i < s.length(); i++) {
            while (set.contains(s.charAt(i))) {
                set.remove(s.charAt(removeIndex));
            }
                removeIndex++;
            set.add(s.charAt(i));
            max = Math.max(max, set.size());
        }

        return max;

    }
}
"
