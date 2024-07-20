class Node {
    int key;
    Node left, right;

    public Node(int item) {
        key = item;
        left = right = null;
    }
}

class BST {
    Node root;

    // Constructor
    BST() {
        root = null;
    }

    // Method to insert a new key in BST
    void insert(int key) {
        root = insertRec(root, key);
    }

    // Recursive insert function
    Node insertRec(Node root, int key) {
        // If the tree is empty, assign a new node address to root
        if (root == null) {
            root = new Node(key);
            return root;
        }

        // Else, recur down the tree
        if (key < root.key)
            root.left = insertRec(root.left, key);
        else if (key > root.key)
            root.right = insertRec(root.right, key);

        // Return the unchanged root pointer
        return root;
    }

    // Method for inorder traversal of BST
    void inorder()  {
        inorderRec(root);
    }

    // Recursive function for inorder traversal
    void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.key + " ");
            inorderRec(root.right);
        }
    }
}

public class eyu {
    public static void main(String[] args) {
        BST tree = new BST();

        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        tree.inorder();
    }
}

