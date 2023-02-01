class Solution {
    public int minimumPartition(String s, int k){
        
        
        int kush =1;
        long total =0;
        for(final char c : s.toCharArray()){
            total = total*10 + c - '0';
            
            if(total>k){
                total = c - '0';
                kush++;
                
            }
            if(total>k){
                return -1;
            }
        }
        return kush;
        
        
        
        
        
        
        
        
    }
}