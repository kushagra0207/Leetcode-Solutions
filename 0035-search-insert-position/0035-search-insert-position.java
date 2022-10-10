class Solution {
    public int searchInsert(int[] nums, int target) {
        int start=0;// Kushagra Gupta Java Developer
	   int end=nums.length-1;
	 
	    int res=0;
        //If target less than our first element,new element will be placed at 0th index
        if(target<nums[0]){
            return 0;
        }
         while(start<=end) {
              int mid=start+(end-start)/2;

              if(nums[mid]==target) {
                  return mid;
              }else if(nums[mid]<target){
                  start=mid+1;
                
              }else if(nums[mid]>target) {
                  end=mid-1;

              }
          }
        return end+1;
        
    }
}