//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            String[] Dictionary=read.readLine().split(" ");
            String Pattern=read.readLine();
            Solution ob = new Solution();
            ArrayList <String> ans=ob.CamelCase(N,Dictionary,Pattern);
            for(String u:ans)
             System.out.print(u+" ");
            System.out.println(); 
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
  
         ArrayList<String> CamelCase(int N,String[] Dictionary,String Pattern){
        //code here
        ArrayList<String> ans = new ArrayList<>();
        for(int i=0;i<Dictionary.length;i++){
            int k=0;
            for(int j=0;j<Dictionary[i].length();j++){
                if(k<Pattern.length() && Dictionary[i].charAt(j)==Pattern.charAt(k))k++;
                else if(Dictionary[i].charAt(j)>='A' && Dictionary[i].charAt(j)<='Z')break;
            }
            if(k==Pattern.length())ans.add(Dictionary[i]);
        }
        if(ans.isEmpty())ans.add("-1");
        Collections.sort(ans);
        return ans;
    }
}