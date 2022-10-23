//{ Driver Code Starts
//Initial Template for Java


//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String input_line[] = read.readLine().trim().split("\\s+");
            int  N = Integer.parseInt(input_line[0]);
            int  M = Integer.parseInt(input_line[1]);
            
            Solution ob = new Solution();
            int ans = ob.steppingNumbers(N, M);
            System.out.println(ans);
        }
    }
}



// } Driver Code Ends


//User function Template for Java

class Solution{
    int steppingNumbers(int n, int m){
        // code here
        int count = 0 ;
    
        for(int i = 0 ; i <= 9 ; i++){
            
           count += helper(i , n , m );
        }
        
        return count;
    }
    
    
    private int helper(int num , int n , int m){
        
       int c = 0;
       Queue<Integer> qu = new LinkedList<>();
       qu.offer(num);
       
       while(!qu.isEmpty()){
           
           int curr = qu.poll();
           
           if(curr >= n && curr <= m ){
               c++;           
               
           }
           
          if(curr == 0 || curr > m){
              continue;
          }
           
           int rem = curr%10 ,n1;
           
           if(rem != 9){
               
               n1 = curr*10+rem+1;
               qu.offer(n1);
           }
           
           if(rem != 0){
               
                n1= curr*10+rem-1;
                qu.offer(n1);
           }
          
       }
       
       return c; 
    }
}
