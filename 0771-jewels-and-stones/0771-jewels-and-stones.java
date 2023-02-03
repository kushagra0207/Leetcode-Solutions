class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count =0;
        for(int i=0;i<jewels.length();i++){
            char k = jewels.charAt(i);
            for(int j=0;j<stones.length();j++){
                char p = stones.charAt(j);
                
                if(k==p){
                    count++;
                }
            }
        } 
        return count;
    }
}