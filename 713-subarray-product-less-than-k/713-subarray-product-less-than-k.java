class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
      int len=nums.length;
      if(len<=1){
        return 0;
      }
      int count =0;
      for(int i=0;i<=len-1;i++){
        int prod=0;
        prod=nums[i];
        if(prod<k){
          count++;
          for(int j=i+1;j<=len-1&&prod<k;j++){
            prod*=nums[j];
            if(prod<k){
              count++;
            }
          }
        }
      }
      return count;  
    }
}