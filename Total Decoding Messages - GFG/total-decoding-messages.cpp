//{ Driver Code Starts
#include<bits/stdc++.h>
using namespace std;

// } Driver Code Ends
class Solution {
	public:
	//	int CountWays(string str){
		    // Code here
		    
		     int mod=1e9+7;
 int CountWays(string str){
    if(str[0]=='0')return 0;
    int n=str.size();
    vector<int>v(n+1,0);
    v[0]=1;
    v[1]=1;
    for(int i=2; i<=n;i++){
        if(str[i-1]>'0')v[i]=v[i-1];
        if(str[i-2]=='1' || (str[i-2]=='2' && str[i-1]<'7'))
        v[i]=(v[i]+v[i-2])%mod;
    }
    return v[n];
		}

};

//{ Driver Code Starts.
int main(){
	int tc;
	cin >> tc;
	while(tc--){
		string str;
		cin >> str;
		Solution obj;
		int ans = obj.CountWays(str);
		cout << ans << "\n";
	}
	return 0;
}
// } Driver Code Ends