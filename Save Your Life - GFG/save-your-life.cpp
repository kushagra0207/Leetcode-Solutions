//{ Driver Code Starts
//Initial Template for C++

#include<bits/stdc++.h>
using namespace std;

// } Driver Code Ends
//User function Template for C++

class Solution{
public:
      string maxSum(string w,char x[], int b[],int n){
          // Kushagra Gupta 
          unordered_map<char,int>Kushagra;
          
          for(int i=0;i<n;i++)
          {
              Kushagra[x[i]]=b[i];
          }
          
          int sum=0;
          int MaxS=INT_MIN;
          string result="";
          string temp="";
          
          for(int i=0;i<w.size();i++)
          {
                
                char ch=w[i];
                // step1 process
                if(Kushagra.find(ch)!=Kushagra.end())
                  sum+=Kushagra[ch];
                else
                  sum+=ch;
                
                // include in ans;  
                temp+=ch;  
                
                //step 2
                // max update
                if(sum>MaxS)
                {
                    MaxS=sum;
                    result=temp;
                }
                
                // step 3
                if(sum<0)
                {
                    temp="";
                    sum=0;
                }
          }
          return result;
      }
};

//{ Driver Code Starts.
int main() 
{ 
    int t;
    cin>>t;
    while(t--)
    {
        string w;
        cin>>w;
        int n;
        cin>>n;
        char x[n];
        int b[n];
        for(int i = 0;i<n;i++)
            cin>>x[i];
        for(int i = 0;i<n;i++)
            cin>>b[i];
        Solution ob;
        cout << ob.maxSum(w,x,b,n) << endl;
    }
    return 0; 
}
// } Driver Code Ends