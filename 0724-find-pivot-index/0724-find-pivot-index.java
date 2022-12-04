class Solution {
    public int pivotIndex(int[] nums) {
          int sum = 0;
        for(int a : nums ){
            sum += a;
        }
        int preSum = 0, rightSum = sum;
        for(int i = 0; i < nums.length; i++){
            rightSum = rightSum - nums[i];
            if(preSum == rightSum) return i;
            preSum += nums[i];
        }
        return -1;
    }
}