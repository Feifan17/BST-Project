public class BST {

    class Node {
        long key;
        long size;
        Node parent;
        Node left;
        Node right;

        public Node(long key) {
            this.key = key;
            this.size = 1;
            this.parent = null;
            this.left = null;
            this.right = null;
        }

    }

    private Node root;

    //no-argument constructor
    public BST() {
        this.root = null;
    }

    //return the root of tree
    public Node root() {
        return this.root;
    }

    public void InsertAndUpdateSize(long key) {

        //create the new node with input key value
        Node newNode = new Node(key);
        //locate the parent of the new node
        Node parent = null;
        Node reference1 = this.root;
        while (reference1 != null) {
            parent = reference1;
            if (newNode.key < reference1.key) {
                reference1 = reference1.left;
            } else {
                reference1 = reference1.right;
            }
        }

        newNode.parent = parent;

        //insert the new node into tree
        if (parent == null) {
            this.root = newNode;
        } else {

            if (newNode.key < parent.key) {
                parent.left = newNode;
            } else {
                parent.right = newNode;
            }
        }

        //update the size field of the nodes who have the wrong size after insertion
        Node reference2 = newNode.parent;
        while (reference2 != null) {
            reference2.size += 1;
            reference2 = reference2.parent;
        }

    }

    //Iterative version: return the kth order statistic of the tree
    public long KthSmallest(Node root, long k) {

        //initialize the variable;
        long result = 0;
        //start at the root
        Node reference = root;
        //flag represents if or not the kth smallest value has been found
        boolean flag = false;

        while (!flag) {
            long leftTreeSize = 0;
            if (reference.left != null) {
                leftTreeSize = reference.left.size;
            }

            //when the kth smallest value is in the current reference node
            if (k == leftTreeSize + 1) {

                result = reference.key;
                flag = true;

            }
            //when the kth smallest value is in the left subtree of current reference node
            else if (k < leftTreeSize + 1) {

                reference = reference.left;

            }
            //when the kth smallest value is in the right subtree of current reference node
            else {
                k = k - (leftTreeSize + 1);
                reference = reference.right;
            }

        }

        return result;
    }

}
