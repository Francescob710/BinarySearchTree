
public class Runner {

	public static void main(String[] args) {
		BinarySearchTree a = new BinarySearchTree();
        a.insert(50); 
        a.insert(50); 
        a.insert(20); 
        a.insert(40); 
        a.insert(70); 
        a.insert(60); 
        a.insert(80); 
  
        // printing inorder traversal of the BST 
        a.inorder(); 
        a.searchNode(70);  
        a.deleteNode(60);  //deleting node
        a.inorder();       //displaying updated tree
    } 
}
