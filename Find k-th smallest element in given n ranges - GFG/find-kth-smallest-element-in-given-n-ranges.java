//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(in.readLine());
        
        while(t-- > 0){
            int n=Integer.parseInt(in.readLine().trim());
            int range[][]=new int[n][2];
            for(int i=0;i<n;i++){
                String s[]=in.readLine().trim().split(" ");
                range[i][0]=Integer.parseInt(s[0]);
                range[i][1]=Integer.parseInt(s[1]);
            }
            int q=Integer.parseInt(in.readLine().trim());
            int Q[]=new int[q];
            String s[]=in.readLine().trim().split(" ");
            for(int i=0;i<q;i++){
                Q[i]=Integer.parseInt(s[i]);
            }

            Solution ob=new Solution();
            ArrayList<Integer> ans=ob.kthSmallestNum(n, range, q, Q);

            for(int i:ans){
                out.print(i+" ");
            }out.println();
        }
        out.close();
    } 
}
// } Driver Code Ends


class Solution {
     public static ArrayList<Integer> kthSmallestNum(int n, int[][] range, int q, int[] queries) {
        // code here
        Arrays.sort(range, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return Integer.compare(a[0], b[0]);
            }
        });
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0;i<q;i++){
            int temp = queries[i];
            int j=0,last=-1,t;
            for(j=0;j<n;j++){
                if(range[j][1]>last && last>=range[j][0]){
                    t = range[j][1]-last;
                    if(t>=temp){
                        ans.add(last+temp);
                        break;
                    }
                    last=range[j][1];
                    temp-=t;
                }
                else if(range[j][1]>last){
                    t =range[j][1]-range[j][0]+1;
                    if(t>=temp){
                        ans.add(range[j][0]+temp-1);
                        break;
                    }
                    last=range[j][1];
                    temp-=t;
                }
            }
            if(j==n)ans.add(-1);
        }
        return ans;
    }
}
        
