//{ Driver Code Starts
#include<bits/stdc++.h>
using namespace std;


// } Driver Code Ends
class Solution {
  public:
    vector<int> solveQueries(int N, int num, vector<int> &A, vector<vector<int>> &Q) {
        // code here
          // code here
        unordered_map<int,int>mp;
        vector<int>freq(N,0);
        
        for(int i=N-1; i>=0; i--)
        {
            mp[A[i]]++;
            freq[i]=mp[A[i]];
        }
        
        vector<int>ans;
        
        for(auto ele: Q)
        {
            int l=ele[0];
            int r=ele[1];
            int k=ele[2];
            int count=0;
            for(int i=l; i<=r; i++)
            {
                if(freq[i]==k)
                {
                    count++;
                }
            }
            
            ans.push_back(count);
        }
        
        
        return ans;
    }
};


//{ Driver Code Starts.

int main(){
    int t;
    cin>>t;
    while(t--){
        int N;
        cin>>N;
        int num;
        cin>>num;
        vector<int> A(N);
        for(int i=0;i<N;i++){
            cin>>A[i];
        }
        vector<vector<int>> Q(num, vector<int>(3));
        for(int i=0;i<num;i++){
            for(int j=0;j<3;j++){
                cin>>Q[i][j];
            }
        }
        Solution obj;
        vector<int> res = obj.solveQueries(N, num, A, Q);
        
        for(auto ele:res){
            cout<<ele<<" ";
        }
        cout<<endl;
    }
}

// } Driver Code Ends