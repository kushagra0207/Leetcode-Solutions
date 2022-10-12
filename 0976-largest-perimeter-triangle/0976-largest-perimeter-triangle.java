class Solution {
    public int largestPerimeter(int[] nums) {
        
        Arrays.sort(nums);
        int n = nums.length;
        int perimeter=0;
        for(int i=n-1;i>=2;i--){
            if(nums[i]<(nums[i-1]+nums[i-2])){
                return (nums[i]+nums[i-1]+nums[i-2]);
                
            }
        }
        
        
      return perimeter;
    }
}