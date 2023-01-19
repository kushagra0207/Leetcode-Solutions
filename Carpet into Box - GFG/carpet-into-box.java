//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class Geeks
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int A =sc.nextInt();
            int B =sc.nextInt();
            int C =sc.nextInt();
            int D =sc.nextInt();
             
           System.out.println(new Solution().carpetBox(A,B,C,D)); 
        }
    }
}

// } Driver Code Ends


//User function Template for Java


class Solution{
    int carpetBox(int A, int B, int C, int D) { 
        //code here
         int a =0;
        int b = 0;
        int c= 0;
        int d = 0;
        while(A>C || A>D){
            if(A>C){
                a++;
            }
            if(A>D){
                b++;
            }
            A=A/2;
        }
        while(B>C||B>D){
            if(B>C){
                c++;
            }
            if(B>D){
                d++;
            }
            B=B/2;
        }
        return Math.min(a+d,b+c);
    }
   
}
