//{ Driver Code Starts
//Initial Template for Java

//Initial Template for Java


/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;


class Array {
    
    // Driver code
	public static void main (String[] args) throws IOException{
		// Taking input using buffered reader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testcases = Integer.parseInt(br.readLine());
		
		// looping through all testcases
		while(testcases-- > 0){
		    String line = br.readLine();
		    String[] element = line.trim().split("\\s+");
		    int sizeOfArray = Integer.parseInt(element[0]);
		     
		    int arr [] = new int[sizeOfArray];
		    
		    line = br.readLine();
		    String[] elements = line.trim().split("\\s+");
		    for(int i = 0;i<sizeOfArray;i++){
		        arr[i] = Integer.parseInt(elements[i]);
		    }
		    Arrays.sort(arr);
		    Complete obj = new Complete();
		    int ans = obj.maximizeSum(arr, sizeOfArray);
		    System.out.println(ans);
		}
	}
}




// } Driver Code Ends


//User function Template for Java



class Complete{
    
   
    // Function for finding maximum and value pair
    public static int maximizeSum (int arr[], int n) {
        //Complete the function
        // Number of elements in the array 
    int sum=0 , max = arr[0]; 
        
        for(int i = 0 ; i < n ; i++){
            
            if(arr[i] > max){
                
                max = arr[i];
            }
            
        }
        
        int [] map = new int[max+1];
        
        for (int i = 0; i < n; i++){
            
            map[arr[i]]++;
        }
        
        for(int i=n-1;i>=0;i--)
        {
            
            int key = arr[i];
                
            if(map[key] > 0){
                
                sum += key;
                
                map[key]--;
                
                map[key-1]--;
            }
            
        }
            
    return sum;

    }
    
    
}


