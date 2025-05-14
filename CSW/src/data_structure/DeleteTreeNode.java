package data_structure;

class Node {
    int key;
    Node left, right;

    public Node(int item) {
        key = item;
        left = right = null;
    }
}

public class DeleteTreeNode {
    Node root;

    public DeleteTreeNode() {
        root = null;
    }

    void insert(int key) {
        root = insertRec(root, key);
    }

    Node insertRec(Node root, int key) {
        if (root == null) {
            System.out.println("Inserted key: " + key);
            return new Node(key);
        }

        if (key < root.key) {
            System.out.println("Inserting key " + key + " to the left of " + root.key);
            root.left = insertRec(root.left, key);
        } else if (key > root.key) {
            System.out.println("Inserting key " + key + " to the right of " + root.key);
            root.right = insertRec(root.right, key);
        } else {
            System.out.println("Key " + key + " already exists in the tree.");
        }

        return root;
    }

    void inorder() {
        inorderRec(root);
        System.out.println();
    }

    void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.key + " ");
            inorderRec(root.right);
        }
    }

    void deleteKey(int key) {
        root = deleteRec(root, key);
    }

    Node deleteRec(Node root, int key) {
        if (root == null) return root;

        if (key < root.key) {
            root.left = deleteRec(root.left, key);
        } else if (key > root.key) {
            root.right = deleteRec(root.right, key);
        } else {
            if (root.left == null) return root.right;
            else if (root.right == null) return root.left;

            root.key = minValue(root.right);
            root.right = deleteRec(root.right, root.key);
        }

        return root;
    }

    int minValue(Node root) {
        int minv = root.key;
        while (root.left != null) {
            minv = root.left.key;
            root = root.left;
        }
        return minv;
    }

    public static void main(String[] args) {
        DeleteTreeNode tree = new DeleteTreeNode();

        tree.insert(50);
        tree.insert(30);
        tree.insert(70);
        tree.insert(20);
        tree.insert(40);
        tree.insert(60);
        tree.insert(80);

        System.out.println("Inorder traversal of the BST before deletion:");
        tree.inorder();

        tree.deleteKey(50);

        System.out.println("Inorder traversal of the BST after deleting 50:");
        tree.inorder();
    }
}
