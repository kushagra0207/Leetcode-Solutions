class Solution {
    public int[] sortedSquares(int[] nums) {
        int a=0;
        for(int i=0;i<nums.length;i++){
            a=nums[i];
            nums[i]=a*a;
        }
        Arrays.sort(nums);
        return nums;
    }
}