//{ Driver Code Starts
import java.util.LinkedList; 
import java.util.Queue; 
import java.io.*;
import java.util.*;

class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}

class GfG {
    
    static Node buildTree(String str){
        
        if(str.length()==0 || str.charAt(0)=='N'){
            return null;
        }
        
        String ip[] = str.split(" ");
        // Create the root of the tree
        Node root = new Node(Integer.parseInt(ip[0]));
        // Push the root to the queue
        
        Queue<Node> queue = new LinkedList<>(); 
        
        queue.add(root);
        // Starting from the second element
        
        int i = 1;
        while(queue.size()>0 && i < ip.length) {
            
            // Get and remove the front of the queue
            Node currNode = queue.peek();
            queue.remove();
                
            // Get the current node's value from the string
            String currVal = ip[i];
                
            // If the left child is not null
            if(!currVal.equals("N")) {
                    
                // Create the left child for the current node
                currNode.left = new Node(Integer.parseInt(currVal));
                // Push it to the queue
                queue.add(currNode.left);
            }
                
            // For the right child
            i++;
            if(i >= ip.length)
                break;
                
            currVal = ip[i];
                
            // If the right child is not null
            if(!currVal.equals("N")) {
                    
                // Create the right child for the current node
                currNode.right = new Node(Integer.parseInt(currVal));
                    
                // Push it to the queue
                queue.add(currNode.right);
            }
            i++;
        }
        
        return root;
    }
    
	public static void main (String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int t=Integer.parseInt(br.readLine());
        
        while(t > 0){
            String line = br.readLine().trim();
            Node root = buildTree(line);
            
            line = br.readLine().trim();
            String target_k[] = line.split(" ");
            int home = Integer.parseInt(target_k[0]);
            int k = Integer.parseInt(target_k[1]);
            
            Solution x = new Solution();
            System.out.println( x.ladoos(root, home, k) );
            t--;
        }
    }
}


// } Driver Code Ends


/*
// node structure:

class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}

*/

class Solution{
      static int ladoos(Node root, int home, int k){
        // Your code goes here
        int ans = 0;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        Node need = new Node(0);
        Map<Node, Node> m = new HashMap<>();
        while(q.size()!=0){
            int s = q.size();
            for(int i=0;i<s;i++){
                Node temp = q.remove();
                if(temp.data==home)need=temp;
                if(temp.left!=null){
                    q.add(temp.left);
                    m.put(temp.left,temp);
                }
                if(temp.right!=null){
                    q.add(temp.right);
                    m.put(temp.right,temp);
                }
            }
        }
        Map<Node, Boolean> mm = new HashMap<>();
        q.add(need);
        int dis = 0;
        while(q.size()!=0){
            int s = q.size();
            for(int i=0;i<s;i++){
                Node temp = q.remove();
                mm.put(temp,true);
                ans+=temp.data;
                if(temp.left!=null && mm.get(temp.left)==null){
                    q.add(temp.left);
                }
                if(temp.right!=null && mm.get(temp.right)==null){
                    q.add(temp.right);
                }
                if(m.get(temp)!=null && mm.get(m.get(temp))==null){
                    q.add(m.get(temp));
                }
            }
            dis++;
            if(dis>k)break;
        }
        return ans;
    }
}

