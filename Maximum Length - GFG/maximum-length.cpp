//{ Driver Code Starts
// Initial Template for C++

#include <bits/stdc++.h>
using namespace std;

// } Driver Code Ends
// User function Template for C++

class Solution {
public:
    int solve(int a, int b, int c) {
        // code here
        if (a >= b && a >= c)
    {
        int halfa = (a % 2 == 0 ? a / 2 : a / 2 + 1);
        int reqd = halfa - 1;
        if (b + c >= reqd)
            return a + b + c;
    }
    if (b >= a && b >= c)
    {
        int halfb = (b % 2 == 0 ? b / 2 : b / 2 + 1);
        int reqd = halfb - 1;
        if (a + c >= reqd)
            return a + b + c;
    }
    if (c >= a && c >= b)
    {
        int halfc = (c % 2 == 0 ? c / 2 : c / 2 + 1);
        int reqd = halfc - 1;
        if (b + a >= reqd)
            return a + b + c;
    }
    return -1;
    }
};

//{ Driver Code Starts.

int main() {
    int T;
    cin >> T;
    while (T--) {
        int a, b, c;
        cin >> a >> b >> c;

        Solution ob;
        int ans = ob.solve(a, b, c);
     

        cout <<  ans << "\n";
    }
    return 0;
}
// } Driver Code Ends