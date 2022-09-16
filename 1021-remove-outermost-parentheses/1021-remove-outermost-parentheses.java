class Solution {
    public String removeOuterParentheses(String s) {
      StringBuilder sa = new StringBuilder();
      int opened=0;
      for(char c:s.toCharArray()){
        if(c=='(' && opened++ > 0) sa.append(c);
        if(c==')' && opened-- > 1) sa.append(c);
          
        
      }
       return sa.toString(); 
        
    }
}