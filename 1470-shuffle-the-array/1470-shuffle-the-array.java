class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[2*n];
        int j =0;
       for(int i=0;i<n;i++){
           result[j]=nums[i];
           j = j+2;
           
           
       }
        int  k=1;
        for(int i=n;i<2*n;i++){
           result[k] = nums[i];
            
            k = k+2;
            
            
        }
        return result;
        
    }
}