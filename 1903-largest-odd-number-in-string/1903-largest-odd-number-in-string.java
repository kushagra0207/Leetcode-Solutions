class Solution {
    public String largestOddNumber(String num) {
      int a = num.length();
      int g=-1;
      for(int i=a-1;i>=0;i--){
        if(num.charAt(i)%2==1){
           g=i;
          break;
        }
      }
      if(g==-1){
        String l="";
        return l;
      }
      return num.substring(0,g+1);
        
    }
}