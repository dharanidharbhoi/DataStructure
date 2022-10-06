package com.dharani.tree;


class TrieNode {
	
	
	boolean endOfNode;
	
	TrieNode[] nodes = new TrieNode[26];
	
	
	public TrieNode() {
	   endOfNode = false;
	   
	   for(int i=0;i<26;i++) {
		   nodes[i] = null;
	   }
	}
	
	
	
}

public class Trie {
	
	TrieNode root; 
	
    public Trie() {
        root = new TrieNode();
    }
    
    public void insert(String word) {
    	
    	TrieNode currNode = root;
    	
    	int length = word.length();
    	
    	for(int i=0;i<length;i++) {
    		
    		int position = word.codePointAt(i) - 97;
    		
    		if(currNode.nodes[position] == null) {
    			currNode.nodes[position] = new TrieNode();
    		}
    	currNode =  currNode.nodes[position];	
    		
    	}
    	
    	currNode.endOfNode = true;
        
    }
    
    public boolean search(String word) {
       
    	  TrieNode currNode = root;
    	  
    	  for(int i=0;i<word.length();i++) {
    		  int position = word.codePointAt(i) - 97;
    		  
    		  if(currNode.nodes[position] == null) {
    			  return false;
    		  }
    		  
    		  currNode = currNode.nodes[position];
    	  }
    	
    	return currNode.endOfNode;
    }
    
    public boolean startsWith(String prefix) {
        
  	  TrieNode currNode = root;
  	  
  	  for(int i=0;i<prefix.length();i++) {
  		  int position = prefix.codePointAt(i) - 97;
  		  
  		  if(currNode.nodes[position] == null) {
  			  return false;
  		  }
  		  
  		  currNode = currNode.nodes[position];
  	  }
  	
  	return !currNode.endOfNode;
  }
    

	public static void main(String[] args) {
		
      Trie trie = new Trie();
      trie.insert("apple");
      trie.insert("ape");
      
      System.out.println("ape is present " + trie.search("ape"));
      System.out.println("apple is present " + trie.search("apple"));
      System.out.println("app is present " + trie.search("app"));
      System.out.println("app is present " + trie.startsWith("app"));




	}

}
