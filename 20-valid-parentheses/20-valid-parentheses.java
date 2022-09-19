class Solution {
    public boolean isValid(String s) {
      Stack<Character> st = new Stack<>();
      int a = s.length();
      for(int i=0;i<a;i++){
        if(s.charAt(i)=='{' || s.charAt(i)=='(' || s.charAt(i)=='['){
          st.push(s.charAt(i));
          
        }
        else{
          
          if((st.size()==0)==true){
            return false;
          }
          char c = st.peek();
          if(c=='(' && s.charAt(i)!=')' || c=='{' && s.charAt(i)!='}' || c=='[' && s.charAt(i)!=']'){
            return false;
          }
          else{
            st.pop();
          }
        }
        
      }
      return ((st.size()==0)==true);
        
    }
}