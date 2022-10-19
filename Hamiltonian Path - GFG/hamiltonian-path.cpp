//{ Driver Code Starts
#include<bits/stdc++.h>
using namespace std;

// } Driver Code Ends
class Solution
{
    public:
    bool dfs(int i,map<int,vector<int>>&mp,vector<bool>&vis,int count){
        if(count==mp.size()) return true;
        vis[i]=true; //marking node as visited
        for(auto &it:mp[i]){
            if(vis[it]==false){
                if(dfs(it,mp,vis,count+1))
                return true;
            }
        }
        vis[i]=false;
        return false;
    }
    bool check(int N,int M,vector<vector<int>> Edges)
    {
        // code here
        map<int,vector<int>>mp;
        for(int i=0;i<Edges.size();i++){
            int u=Edges[i][0];
            int v=Edges[i][1];
            mp[u].push_back(v);
            mp[v].push_back(u);
        }
        vector<bool>vis(mp.size()+1,false);
        for(int i=1;i<=mp.size();i++){
            int count=1;
            if(dfs(i,mp,vis,count))
            return true;
        }
        return false;
    }

};
 

//{ Driver Code Starts.
int main()
{
	int t;
	cin>>t;
	while(t--){
    	int N,M,X,Y;
    	cin>>N>>M;
    	vector<vector<int>> Edges;
    	for(int i=0;i<M;i++)
    	{
    		cin>>X>>Y;
    		Edges.push_back({X,Y});
    	}
    	Solution obj;
    	if(obj.check(N,M,Edges)){
    		cout<<"1"<<endl;
    	}
    	else
    	cout<<"0"<<endl;
	}
}
// } Driver Code Ends