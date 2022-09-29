class Solution {
    public List<Integer> lexicalOrder(int n) {
      List<Integer> list = new ArrayList<>();
      LexicoCounting(0,n,list);
      return list;
        
    }
  public static void LexicoCounting(int curr, int n,List<Integer> list){
    if(curr>n){
      return ;}
       if(curr!=0)
      list.add(curr);
      //System.out.println(curr);
      int i=0;
      if(curr==0){
        i=1;
      }
      for(;i<=9;i++){
        LexicoCounting(curr*10 + i,n,list);
      }
    }
  }
