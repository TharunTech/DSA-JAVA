package dataStructures.binarySearchTree;

class Node{
	int data;
	Node left;
	Node right;
	
	public Node(int data) {
		this.data = data;
	}
}

public class BinaryTree {
	
	Node root;

	public void insert(int data) {
		
		root = insertRec(root,data);
		
	}
	
	public Node insertRec(Node root, int data) {
		if(root == null)
			root = new Node(data);
		else if(data<root.data)
			root.left = insertRec(root.left,data);
		else if(data> root.data)
			root.right = insertRec(root.right,data);
		
		
		return root;

	}
	
	public void inorder() {
		System.out.println("Binary Search Tree inOrder Transversal : ");
		inorderRec(root);
		System.out.println("");
		
	}
	
	public void preorder() {
		System.out.println("Binary Search Tree preOrder Transversal : ");
		preorderRec(root);
		System.out.println("");
		
		
	}
	
	public void postorder() {
		System.out.println("Binary Search Tree postOrder Transversal : ");
		postorderRec(root);
		System.out.println("");
		
		
	}

	public void inorderRec(Node root) {
		if(root!=null) {
			inorderRec(root.left);
			System.out.print(root.data +" ");
			inorderRec(root.right);
		}
	}
	
	public void preorderRec(Node root) {
		if(root!=null) {
			System.out.print(root.data +" ");
			inorderRec(root.left);
			inorderRec(root.right);
		}
	}
	
	public void postorderRec(Node root) {
		if(root!=null) {
			inorderRec(root.left);
			inorderRec(root.right);
			System.out.print(root.data +" ");
		}
	}
}
