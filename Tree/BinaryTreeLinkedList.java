package Tree;
import java.util.*;

class BinaryNode{
    String value;
    BinaryNode left;
    BinaryNode right;
    int height;
}

class BinaryTreeLL{
    BinaryNode root;

    BinaryTreeLL(){
        this.root = null;
    }

    void insert(String value){
        BinaryNode node = new BinaryNode();
        node.value = value;
        if (root == null){
            root = node;
            System.out.println(value+" inserted successfully! ");
            return;
        }
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        while (!queue.isEmpty()){
            BinaryNode presentNode = queue.remove();
            if (presentNode.left == null){
                presentNode.left = node;
                System.out.println(value+" inserted Successfully! ");
                break;
            } else if (presentNode.right == null) {
                presentNode.right = node;
                System.out.println(value+" inserted successfully!");
                break;
            } else {
                queue.add(presentNode.left);
                queue.add(presentNode.right);
            }
        }
    }
    void preOrderTraversal(BinaryNode node){
        if (node == null){
            return;
        } else {
            System.out.print(node.value+" "); //root node in copy
            preOrderTraversal(node.left);
            preOrderTraversal(node.right);
        }
    }
    void inOrderTraversal(BinaryNode node){
        if (node == null) {
            return;
        }
        else {
            inOrderTraversal(node.left);
            System.out.print(node.value+" "); //root node in copy
            inOrderTraversal(node.right);
        }
    }
    void postOrderTraversal(BinaryNode node){
        if (node == null){
            return;
        } else {
            postOrderTraversal(node.left);
            postOrderTraversal(node.right);
            System.out.print(node.value + " "); //root node in copy
        }
    }
    void levelOrderTraversal(){
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        while (!queue.isEmpty()){
            BinaryNode presentNode = queue.remove();
            System.out.print(presentNode.value+" ");
            if (presentNode.left != null){
                queue.add(presentNode.left);
            }
            if (presentNode.right != null){
                queue.add(presentNode.right);
            }
        }
    }

    void search(String value){
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        while (!queue.isEmpty()){
            BinaryNode presentNode = queue.remove();
            if (presentNode.value == value){
                System.out.println(value+" is present in Tree! ");
                return;
            } else {
                if (presentNode.left != null)
                    queue.add(presentNode.left);
                if (presentNode.right != null)
                    queue.add(presentNode.right);
            }
        }
        System.out.println(value+" is not present in Tree");
    }

    //below methods are used to delete node from Tree
    BinaryNode getDeepestNode(){
        //optional to use
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        BinaryNode presentNode = null;
        while (!queue.isEmpty()){
            presentNode = queue.remove();
            if (presentNode.left != null)
                queue.add(presentNode.left);
            if (presentNode.right != null)
                queue.add(presentNode.right);
        }
        return presentNode;
    }
    void deleteDeepestNode(){
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        BinaryNode previousNode, presentNode = null;
        while (!queue.isEmpty()){
            previousNode = presentNode;
            presentNode = queue.remove();
            if (presentNode.left == null){
                previousNode.right = null;
                return;
            } else if (presentNode.right == null) {
                presentNode.left = null;
                return;
            }
            queue.add(presentNode.left);
            queue.add(presentNode.right);
        }
    }
    void deleteNode(String value){
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        while (!queue.isEmpty()){
            BinaryNode presentNode = queue.remove();
            if (presentNode.value == value){
                presentNode.value = getDeepestNode().value;
                deleteDeepestNode();
                System.out.println("Node is delete successfully! ");
                return;
            } else {
                if (presentNode.left != null)
                    queue.add(presentNode.left);
                if (presentNode.right != null)
                queue.add(presentNode.right);
            }
        }
        System.out.println("Node is not present in Tree, Can't delete ");
    }
    void deleteBT(){
        root = null;
        System.out.println("Tree is deleted Successfully");
    }
}
public class BinaryTreeLinkedList {
    public static void main(String[] args) {
        BinaryTreeLL binaryTree = new BinaryTreeLL();
        /*
        BinaryNode n1 = new BinaryNode();
        n1.value = "n1";
        BinaryNode n2 = new BinaryNode();
        n2.value = "n2";
        BinaryNode n3 = new BinaryNode();
        n3.value = "n3";
        BinaryNode n4 = new BinaryNode();
        n4.value = "n4";
        BinaryNode n5 = new BinaryNode();
        n5.value = "n5";
        BinaryNode n6 = new BinaryNode();
        n6.value = "n6";
        BinaryNode n7 = new BinaryNode();
        n7.value = "n7";
        BinaryNode n8 = new BinaryNode();
        n8.value = "n8";
        BinaryNode n9 = new BinaryNode();
        n9.value = "n9";

        n1.left = n2;
        n1.right = n3;
        n2.left = n4;
        n2.right = n5;
        n4.left = n8;
        n4.right = n9;
        n3.left = n6;
        n3.right = n7;

        binaryTree.root = n1;
        binaryTree.preOrderTraversal(binaryTree.root);
        System.out.println();
        binaryTree.inOrderTraversal(binaryTree.root);
        System.out.println();
        binaryTree.postOrderTraversal(binaryTree.root);
        System.out.println();
        */
        binaryTree.insert("n1");
        binaryTree.insert("n2");
        binaryTree.insert("n3");
        binaryTree.insert("n4");
        binaryTree.insert("n5");
        binaryTree.insert("n6");
        binaryTree.levelOrderTraversal();
        System.out.println();
//        binaryTree.deleteDeepestNode();
        binaryTree.deleteNode("n3");
        binaryTree.levelOrderTraversal();
//        binaryTree.search("n10");
        binaryTree.deleteBT();
    }
}
