import java.util.LinkedList;
import java.util.Scanner;

class Node  
{ 
    int data; 
    Node left, right; 
   
    Node(int item)  
    { 
        data = item; 
        left = right = null; 
    } 
} 
public class BTtoDLL 
{
	static Node root = null;
	static LinkedList <Integer> l = new LinkedList <Integer>();
	public static void inorder(Node root)
	{
		if(root==null)
			return;
		inorder(root.left);
		l.add(root.data);
		inorder(root.right);
	}
	
	public static void main(String[] args) 
	{
		BTtoDLL tree = new BTtoDLL(); 
        tree.root = new Node(5); 
        tree.root.left = new Node(3); 
        tree.root.right = new Node(6); 
        tree.root.left.right = new Node(4); 
        tree.root.left.left = new Node(1); 
        tree.root.right.right = new Node(8); 
        tree.root.left.left.right = new Node(2); 
        tree.root.left.left.left = new Node(0); 
        tree.root.right.right.left = new Node(7); 
        tree.root.right.right.right = new Node(9); 
        inorder(root);
		System.out.println(l);
	}
}
