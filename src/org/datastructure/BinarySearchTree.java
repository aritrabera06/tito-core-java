package org.datastructure;

/**
 * Create a BST and do in-order traversal
 * @author Kaushik
 *
 */
public class BinarySearchTree {

	/* Class containing left and right child of current node and key value*/
	class Node {
		int key;
		Node left, right;
		 
		public Node(int item) {
			this.key = item;
			this.left = this.right = null;
		}
	} // End of inner class Node
	
	// Root of BST
	Node root;
	
	public BinarySearchTree() {
		root = null;
	}
	// This method mainly calls insertRec() 
	void insert(int key) {
		root = insertRec(root,key);
	}
	
	/* A recursive function to insert a new key in BST */
	private Node insertRec(Node root, int key) {
		
		 /* If the tree is empty, return a new node */
		if(root == null) {
			root = new Node(key);
			return root;
		}
		
		/* Otherwise, recur down the tree */
		if(key < root.key) {
			root.left = insertRec(root.left, key);
		}else if(key > root.key) {
			root.right = insertRec(root.right, key);
		}
		
		return root;
	}
	
	// This method mainly calls InorderRec() 
    void inorder()  { 
       inorderRec(root); 
    } 
	
	private void inorderRec(Node root) {
		if(root != null) {
			inorderRec(root.left);
			System.out.println(root.key);
			inorderRec(root.right);
		}
	}
	
	public static void main(String[] args) {
		BinarySearchTree tree = new BinarySearchTree(); 
		
		tree.insert(50); 
        tree.insert(30); 
        tree.insert(20); 
        tree.insert(40); 
        tree.insert(70); 
        tree.insert(60); 
        tree.insert(80); 
  
        // print inorder traversal of the BST 
        tree.inorder();
	}
} // End of class BinarySearchTree
