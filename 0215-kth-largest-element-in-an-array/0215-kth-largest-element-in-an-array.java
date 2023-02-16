class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        int a = nums.length-k;
        return nums[a];
        
    }
}