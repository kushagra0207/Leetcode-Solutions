class Solution {
    public boolean halvesAreAlike(String s) {
        int n = s.length();
        int count=0;
        int sub=0;
        
        for(int i=0;i<n;i++){
            if((i<n/2) && (s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u' || s.charAt(i)=='A' || s.charAt(i)=='E' || s.charAt(i)=='I' || s.charAt(i)=='O' || s.charAt(i)=='U')  ){
                
                count++;
            }
            
            else if((i>=n/2) && (s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u' || s.charAt(i)=='A' || s.charAt(i)=='E' || s.charAt(i)=='I' || s.charAt(i)=='O' || s.charAt(i)=='U') ){
                
                sub++;
                
            }
        }
        
        return count==sub;
        
    }
}