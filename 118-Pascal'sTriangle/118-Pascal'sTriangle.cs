
                prevList.Insert(0, 0);
                prevList.Add(0);

                for (int x = 0; x < prevList.Count - 1; x++) { 
                    int val = prevList[x] + prevList[x + 1];
                    subList.Add(val);
                }
                IList<int> prevList = new List<int>(result[result.Count - 1]);
                IList<int> subList = new List<int>(); 
                continue;
            } else {
                initial.Add(1);
                result.Add(initial);
                i++;
            if (i == 0) {
                IList<int> initial = new List<int>();
5
