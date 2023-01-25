//{ Driver Code Starts
// Initial template for C++

#include <bits/stdc++.h>
using namespace std;

// } Driver Code Ends
// User function template for C++

class Solution {
  public:
    int minOperation(string s) {
        // code here
         int ans=0;

        int n=s.size();

        for(int i=0;i<=(s.size()/2);i++){
            int j=(i+1);
            string s1=s.substr(0,j);
            string s2=s.substr(j,j);
            if(s1==s2){
            ans=j-1;
            }
        }
        
        return n-ans;
    }
};

//{ Driver Code Starts.
int main() {
    int t;
    cin >> t;
    while (t--) {
        string s;
        cin >> s;
        Solution ob;
        cout << ob.minOperation(s) << "\n";
    }
    return 0;
}

// } Driver Code Ends