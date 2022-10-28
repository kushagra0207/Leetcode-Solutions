//{ Driver Code Starts
//Initial Template for C++

#include<bits/stdc++.h>
using namespace std;

// } Driver Code Ends
//User function Template for C++

class Solution {
	public:
		int NthTerm(int n){
		    // Code  here
		      long long int a=2;
        long long int b=1000000007;
        if(n==1) return 2;
        for(int i=2;i<=n;i++){
               a=(a*i+1)%b;
        }
       return a%b;
		
		}

};

//{ Driver Code Starts.
int main(){
	int tc;
	cin >> tc;
	while(tc--){
		int n;
		cin >> n;
		Solution obj;
		int ans = obj.NthTerm(n);
		cout << ans << "\n";
	}
	return 0;
}
// } Driver Code Ends