import java.util.TreeSet;

class Node
{
	int data;
	Node left, right;
}

public class BST
{
	static Node root;
	
	private Node add(Node temp, int x)
	{
		if(temp == null)
		{
			temp= new Node();
			temp.data= x;
			return temp;
		}
		
		else if(x < temp.data)
			temp.left= add(temp.left, x);
		
		else
			temp.right= add(temp.right, x);
		
		return temp;
	}
	
	/*
	private void delete(Node temp, int x)
	{
		Node parent= searchdel(null, temp, x);
		System.out.println(parent.data);
		Node child;
		
		if(parent == null)
			child= root;
		else if(parent.left.data == x)
			child= parent.left;
		else
			child= parent.right;
		
		TreeSet<Integer> T= new TreeSet<>();
		T= collect(child, T);
		child.right= null;
		child.left= null;
		parent.left= null;
		
		Integer[]A= new Integer[T.size()];
		A= T.toArray(A);
		
		int l= A.length;
		add(root, A[l/2]);
		T.remove(A[l/2]);
		
		for(int i: T)
		{
			add(root, i);
		}
	}
	
	private Node searchdel(Node temp1, Node temp2, int x)
	{	
		if(temp2.data == x)
			return temp1;
		
		else if(x < temp2.data)
			temp1= searchdel(temp2, temp2.left, x);
		
		else
			temp1= searchdel(temp2, temp2.right, x);
		
		return temp1;
	}
	
	private TreeSet<Integer> collect(Node child, TreeSet<Integer> T)
	{
		if(child.left != null)
			T= collect(child.left, T);
		if(child.right != null)
			T= collect(child.right, T);
		
		T.add(child.data);
		
		return T;
	}
	*/
	
	public static void main(String[]args)
	{
		BST obj= new BST();
		root= obj.add(root, 5);
		root= obj.add(root, 3);
		root= obj.add(root, 2);
		root= obj.add(root, 4);
		root= obj.add(root, 7);
		root= obj.add(root, 6);
		root= obj.add(root, 8);
		root= obj.add(root, 1);
		
		System.out.println(root.data+" "+root.left.data+" "+root.right.data);
	}
}