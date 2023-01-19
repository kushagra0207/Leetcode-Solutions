class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        /* Writer Kushagra Gupta done - 19 January 2023 
        
        Method 1 */
        
//         int a =0;
//        int b=0;
        
//         for(int i=0;i<nums.length;i++){
//             for(int j=i+1;j<nums.length;j++){
//                 if(nums[i]+nums[j]==target){
//                     a=i;
//                      b =j;
//                 }
//             }
//         }
//         int[] arr = new int[2];
//         arr[0]=a;
//         arr[1]=b;
//         return arr;
        
        
        // Mathod 2 using HashMap
        
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++){
            int rem = target-nums[i];
            if(map.containsKey(rem)){
                
                int aer = map.get(rem);
                if(aer==i){continue;}

                return new int[] {map.get(rem),i};

}
            
        }
        
        
        
        
        
        return new int[]{};
      
        
    }
}