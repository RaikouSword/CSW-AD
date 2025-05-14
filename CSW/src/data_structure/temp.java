package data_structure;

class BinarySearchTree{
    Node root;
    public void traversePreOrder(Node root){
        if (root!=null){
            System.out.print(root.data+" ");
            traversePreOrder(root.left);
            traversePreOrder(root.right);
            }
        }
    }
    public void inorderTraversal(Node data){
        if (data != null) {
            inorderTraversal(data.left);
            System.out.print(data.data + " ");
            inorderTraversal(data.right);
            }
        }
    }
}
public class temp {

}
