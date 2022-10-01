package Tree;
import java.util.*;

class TreeNode{
    String data;
    ArrayList<TreeNode> children;

    TreeNode(String data){
        this.data = data;
        this.children = new ArrayList<TreeNode>();
    }
    void addChild(TreeNode node){
        this.children.add(node);
    }
    String print(int level){
        String result;
        result = "  ".repeat(level)+data+"\n";
        for (TreeNode node: this.children){
            result += node.print(level+1);
        }
        return result;
    }
}
public class Tree {
    public static void main(String[] args) {
        TreeNode drinks = new TreeNode("Drinks");
        TreeNode hot = new TreeNode("Hot");
        TreeNode cold = new TreeNode("Cold");
        TreeNode tea = new TreeNode("Tea");
        TreeNode coffee = new TreeNode("Coffee");
        TreeNode wine = new TreeNode("Wine");
        TreeNode beer = new TreeNode("Beer");
        drinks.addChild(hot);
        drinks.addChild(cold);
        hot.addChild(tea);
        hot.addChild(coffee);
        cold.addChild(wine);
        cold.addChild(beer);
        System.out.println(drinks.print(0));
    }
}
