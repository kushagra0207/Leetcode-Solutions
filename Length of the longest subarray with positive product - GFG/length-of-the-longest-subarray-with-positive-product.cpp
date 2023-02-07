//{ Driver Code Starts
//Initial Template for C++



#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends
//User function Template for C++

class Solution {
    public:
        // Function to return the length of the
        //longest subarray with ppositive product
        int maxLength(vector<int> &arr,int n){
           //code here
             int pos=0;
           int neg=0;
           int ans=0;
           
           for(int i=0;i<n; i++)
           {
               if(arr[i]==0)
               {
                   pos=0;
                   neg=0;
               }
               else if(arr[i]>0)
               {
                   if(neg==0)
                   {
                       pos++;
                   }
                   else
                   {
                       pos++;
                       neg++;
                   }
               }
               else
               {
                   if(neg==0)
                   {
                       neg=pos+1;
                       pos=0;
                   }
                   else
                   {
                       int temp=pos;
                       pos=neg+1;
                       neg=temp+1;
                   }
               }
               
               ans=max(ans,pos);
               
           }
           
           return ans;
        }
};

//{ Driver Code Starts.

int main() {
	int t;
	cin>>t;
	while(t--){
	    int n;
	    cin>>n;
	    vector<int> arr(n);
	    for(int i = 0;i<n;i++){
	        cin>>arr[i];
	    }
	    Solution ob;
	    int res = ob.maxLength(arr,n);
	    cout<<res<<"\n";
	}
	return 0;
}
// } Driver Code Ends