class Solution {
    public int minMutation(String start, String end, String[] bank) {
       if (start.length() != end.length()) {
            return -1;
        }

        Set<String> sequences = new HashSet<>();

        char[] code = {'A', 'C', 'G', 'T'};

        for (String seq : bank) {
            sequences.add(seq);
        }

        if (!sequences.contains(end)) {
            return -1;
        }

        int level = 0;
        Set<String> visited = new HashSet<>();
        Set<String> beginSet = new HashSet<>();
        Set<String> endSet = new HashSet<>();

        beginSet.add(start);
        endSet.add(end);

        Set<String> temp = null;

        while (!beginSet.isEmpty() && !endSet.isEmpty()) {
            System.out.println("beginSet size: " + beginSet.size() + " endSet size: " + endSet.size());
            if (beginSet.size() >= endSet.size()) {
                temp = beginSet;
                beginSet = endSet;
                endSet = temp;
            }

            temp = new HashSet<>();

            for (String gene : beginSet) {
                char[] letters = gene.toCharArray();

                for (int i = 0; i < letters.length; i++) {
                    char oldC = letters[i];

                    for (char c : code) {
                        if (c == oldC) continue;
                        letters[i] = c;

                        String nextGene = new String(letters);

                        if (endSet.contains(nextGene)) {
                            return level + 1;
                        }

                        if (sequences.contains(nextGene) && !visited.contains(nextGene)) {
                            visited.add(nextGene);
                            temp.add(nextGene);
                        }
                    }
                    letters[i] = oldC;
                }
            }
            beginSet = temp;
            ++level;
        }
        return -1;  
    }
}