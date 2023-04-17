//{ Driver Code Starts
// Program to find the maximum profit job sequence from a given array 
// of jobs with deadlines and profits 
#include<bits/stdc++.h>
using namespace std; 

// A structure to represent a job 
struct Job 
{ 
    int id;	 // Job Id 
    int dead; // Deadline of job 
    int profit; // Profit if job is over before or on deadline 
}; 


// } Driver Code Ends
/*
struct Job 
{ 
    int id;	 // Job Id 
    int dead; // Deadline of job 
    int profit; // Profit if job is over before or on deadline 
};
*/

class Solution 
{
    public:
   static bool cmp(Job& J1,Job& J2)
{
    return J1.profit>J2.profit;
}
//Function to find the maximum profit and the number of jobs done.
vector<int> JobScheduling(Job arr[], int n) 
{ 
    // Sorting the Jobs on the basis of Profit in descending order
    // Maximize the Profit
    sort(arr,arr+n,cmp);
    bool Deadline[100001]={0};
    int count=0,profit=0;
    for(int i=0;i<n;i++)
    {
        int currdead=arr[i].dead;
        int currprofit=arr[i].profit;
        // Latest Deadline available
        // Smaller Deadline work should be done firstly
        while(currdead>=1 && Deadline[currdead]==1)
        {
            currdead--;
        }
        if(currdead>=1)
        {
            Deadline[currdead]=true;
            profit+=currprofit;
            count++;
        }
    }
    return {count,profit};}
};

//{ Driver Code Starts.
// Driver program to test methods 
int main() 
{ 
    int t;
    //testcases
    cin >> t;
    
    while(t--){
        int n;
        
        //size of array
        cin >> n;
        Job arr[n];
        
        //adding id, deadline, profit
        for(int i = 0;i<n;i++){
                int x, y, z;
                cin >> x >> y >> z;
                arr[i].id = x;
                arr[i].dead = y;
                arr[i].profit = z;
        }
        Solution ob;
        //function call
        vector<int> ans = ob.JobScheduling(arr, n);
        cout<<ans[0]<<" "<<ans[1]<<endl;
    }
	return 0; 
}



// } Driver Code Ends