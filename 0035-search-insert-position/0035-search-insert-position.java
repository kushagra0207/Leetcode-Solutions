class Solution {
    public int searchInsert(int[] nums, int target) {
        int q = 0, w = nums.length-1,r=-1;
while (q <= w) {
r = (w + q) >> 1;
if (nums[r] > target)
w = r - 1;
else if (target > nums[r])
q = r + 1;
else
return r;
}
return nums[r]>target?r:r+1;
    }
}