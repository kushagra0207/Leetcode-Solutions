class Solution {
    public int sumOfUnique(int[] nums) {
        HashMap<Integer,Integer> hash = new HashMap<>();
        int sum=0;
        for(int x:nums){
            hash.put(x,hash.getOrDefault(x,0)+1);
        }
        for(Map.Entry<Integer,Integer> e:hash.entrySet()){
            if(e.getValue()==1){
                sum = sum + e.getKey();
                
            }
        }
        return sum;
    }
}