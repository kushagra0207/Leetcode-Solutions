class Solution {
    public int singleNumber(int[] nums) {
        int Kushagra=0;
    for(int i=0;i<nums.length;i++){
        Kushagra=Kushagra^nums[i];  // LC Kushagra 1702
    }
    return Kushagra;
        
    }
}