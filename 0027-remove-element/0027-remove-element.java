class Solution {
    public int removeElement(int[] nums, int val) {
        
        int res=0;
        
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]==val){
                nums[i]=Integer.MAX_VALUE;
                res++;
                
            }
        }
        Arrays.sort(nums);
        return nums.length-res;
       
    }
}