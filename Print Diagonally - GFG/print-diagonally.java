//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            
            int matrix[][] = new int[n][n];
            
            for(int i = 0; i < n; i++)
            {
                for(int j = 0; j < n; j++)
                 matrix[i][j] = sc.nextInt();
            }
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.downwardDigonal(n, matrix);
            for (Integer val: ans) 
                System.out.print(val+" "); 
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static ArrayList<Integer> downwardDigonal(int n, int a[][])
    {
        // code here 
         ArrayList<Integer> arr = new ArrayList<>();
        int i , j , k ;
        
        for(i = 0 ; i < n ; i++){
            
            j = i ; k = 0;
            
            while(j >= 0){
                
                arr.add(a[k][j]);
                
                k += 1;
                j -= 1;
            }
            
        }
        
        
        for(i = 1 ; i < n ; i++){
            
            j = i; k = n-1;
            
            while(j <= n-1){
                
                arr.add(a[j][k]);
                
                j += 1;
                k -= 1;
            }
            
        }
        
        return arr;
    }
}
