//{ Driver Code Starts
// Initial Template for C++
#include <bits/stdc++.h>
using namespace std;

// } Driver Code Ends
// User function Template for C++
class Solution {
  public:
    vector<int> reverseSpiral(int R, int C, vector<vector<int>>&a)  {
        // code here
        
       
        // code here
        vector<int>ans;
        
        int SRow=0,SCol=0,ECol=C-1,ERow=R-1;
        
        while(SRow<=ERow &&SCol<=ECol)
        {
            // part 1 starting row
            for(int i=SCol;i<=ECol;i++)
            {
                ans.push_back(a[SRow][i]);
            }
            SRow++;
            
            // part 2 ending col
            for(int i=SRow;i<=ERow;i++)
            {
                ans.push_back(a[i][ECol]);
            }
            ECol--;
            
            // part 3 ending row
            if(SRow<=ERow)
            {
                for(int i=ECol;i>=SCol;i--)
               {
                ans.push_back(a[ERow][i]);
               }
            }
            ERow--;
            
            // part 4 starting col
            if(SCol<=ECol)
            {
                for(int i=ERow;i>=SRow;i--)
              {
                ans.push_back(a[i][SCol]);
              }
            }
            
            SCol++;
        }
        reverse(ans.begin(),ans.end());
        return ans;
    }
};

//{ Driver Code Starts.
int main() {
    int t;
    cin >> t;
    while (t--) {
        int R, C;
        cin>>R>>C;
        vector<vector<int>> a(R, vector<int>(C, 0));
        for(int i = 0;i < R*C;i++)
            cin>>a[i/C][i%C];
        Solution ob;
        vector<int>ans=ob.reverseSpiral(R,C,a);
        for(int i=0;i<ans.size();i++)cout<<ans[i]<<" ";
            cout<<endl;
    }
    return 0;
}

// } Driver Code Ends