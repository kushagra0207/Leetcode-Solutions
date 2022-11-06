class Solution {
    public void sortColors(int[] nums) {
            
            // Kushagra Gupta - Programmer Specialist
        // color = red || white || blue;
            
            // color red =0;
            // color white = 1;
            // color blue= 2;
            
            
//             Method - 1 By using Arrays.sort method but will not do as per the question.
            
            
//             Arrays.sort(nums);
//             With Time Complexity - O(N log N)

//                     Now we will do same question with O(N) T.C
//             Method - 2
//                we count objects by loop iterative. We will count hoe many red , blue and white elemnets are there and then after counting we arrange as sequence red, white and blue.             
            
      int n = nums.length;
            int white=0;
            int red=0;
            int blue =0;
      for(int i=0;i<n;i++){
              if(nums[i]==0) red++;
              else if(nums[i]==1) white++;
              else blue++;
      }      
            for(int i=0;i<n;i++){
                    
                    if(red!=0){
                            nums[i]=0;
                            red--;
                            
                    }
                    else if((white!=0) && red==0){
                            nums[i]=1;
                            white--;
                            
                    }
                    else if((blue!=0) && (red==0 && white==0)){
                            nums[i]=2;
                            blue--;
                    }
            }
                    
    }
        
}