class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        Set hs = new HashSet();
        for(char ch : jewels.toCharArray()){
            hs.add(ch);
        }
        for(char ch : stones.toCharArray()){
            if(hs.contains(ch)){
                count+=1;
            }
        }
        return count;
    }
}