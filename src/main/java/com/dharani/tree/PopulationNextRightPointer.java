package com.dharani.tree;

import java.util.Deque;
import java.util.LinkedList;

class Node1 {
    public int val;
    public Node1 left;
    public Node1 right;
    public Node1 next;

    public Node1() {}
    
    public Node1(int _val) {
        val = _val;
    }

    public Node1(int _val, Node1 _left, Node1 _right, Node1 _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
}

public class PopulationNextRightPointer {
	

	
   Node1 node;

	public static void main(String[] args) {
		
		PopulationNextRightPointer pt = new PopulationNextRightPointer();
		pt.node = new Node1(1);
		pt.node.left = new Node1(2);
		pt.node.left.left = new Node1(4);
		pt.node.left.right = new Node1(5);
		pt.node.right = new Node1(3);
		pt.node.right.right = new Node1(7);
		
		
		print(pt.node);
		
		//System.out.println();
		
		Node1 node = connect1(pt.node);
		

		int size  = 1;
		
		boolean result = size-- > 0;
		
		System.out.println();
		
		//print(node);

		
	}

	private static Node1 conect(Node1 root) {
		
		
		Deque<Node1> queue = new LinkedList<>();
		
		queue.add(root);
		
		Node1 head = new Node1(-1);
		Node1 start = head;
		
		
		while(!queue.isEmpty()) {
			
			Node1 temp = queue.poll();
			head.next = new Node1(temp.val);
			head = head.next;
			if(temp.left != null)
			queue.add(temp.left);
			if(temp.right != null)
			queue.add(temp.right);
		}
	
		return start.next;
		
	}
	
	private static Node1 flatten(Node1 root) {
		
		  if(root == null) {
			  return root;
		  }
		  
		  if(root.left == null && root.right == null) {
			  return root;
		  }
		  
		  if(root.left != null) {
			  conect(root.left);
			  
			  Node1 tempNode = root.right;
			  root.right = root.left;
			  root.left = null;
			  
			  Node1 currNode = root.right;
			  
			  while(currNode.right != null) {
				  currNode = currNode.right;
			  }
			  
			  currNode.right = tempNode;			  
			  
			  
		  }
		  conect(root.right);
		
		  
		  return root;
		
	}

	private static void print(Node1 root) {
		
         
          if(root == null) {
        	  return;
          }
         System.out.print(root.val + " ");
         if(root.left != null) {
        	 print(root.left);
         }
         
         if(root.right != null) {
        	 print(root.right);
         }
		
	}
	
    public static Node1 connect1(Node1 root) {
        if(root == null) return root; // If root is null return that root 
        
        Deque<Node1> dq = new LinkedList<>(); // Creation of Deque 
        dq.offer(root); //Adding root into the dq
        
        while(!dq.isEmpty()){ // 
            int size = dq.size(); // Taking levels size into consideration
            while(size-- > 0){
                Node1 temp = dq.poll(); // Current peek element in the dq is taken out into the temp node so we can easily access the operations
               
               // IMP Statement Everything else is You allready been knwing
                 if(size > 0 ) temp.next = dq.peek(); // while size is greater than 0 i keep on pointing temp node to the peek node of the dq
                
                if(temp.left != null) dq.offer(temp.left); // Will check if current peek elemet having left node if left node is present then add it into the dq
                
                if(temp.right != null) dq.offer(temp.right); // Same for the right node of the current peek 
               
            }
            
            
            
        }
        return root;  // at the end return the root
        
    }

}
