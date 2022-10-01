package Tree;

class BinaryTreeA{
    String[] arr;
    int lastUsedIndex;

    BinaryTreeA(int size){
        arr = new String[size+1];
        lastUsedIndex = 0;
        System.out.println("Blank Tree of size "+size+" Created! ");
    }
    boolean isFull(){
        if (arr.length-1 == lastUsedIndex)
            return true;
        else
            return false;
    }
    void insert(String value){
        if (!isFull()){
            arr[lastUsedIndex+1] = value;
            lastUsedIndex++;
            System.out.println(value+" is inserted Successfully!");
        } else {
            System.out.println("Tree is full, Can't insert "+value);
        }
    }
    void preOrdertraversal(int index){
        if (index > lastUsedIndex)
            return;
        System.out.print(arr[index]+" ");
        preOrdertraversal(index*2);
        preOrdertraversal(index*2 + 1);
    }
    void inOrdertraversal(int index){
        if (index> lastUsedIndex)
            return;
        inOrdertraversal(index*2);
        System.out.print(arr[index]+" ");
        inOrdertraversal(index*2 + 1);
    }
    void postOrderTraversal(int index){
        if (index>lastUsedIndex)
            return;
        postOrderTraversal(index*2);
        postOrderTraversal(index*2 + 1);
        System.out.print(arr[index]+" ");
    }
    void levelOrderTraversal(){
        for (int i=1;i<=lastUsedIndex;i++)
            System.out.print(arr[i]+" ");
    }
    int search(String value){
        for (int i=1;i<=lastUsedIndex;i++){
            if (arr[i] == value){
                System.out.println(value+" is present in Tree at index "+i);
                return i;
            }
        }
        System.out.println(value+" is not present in Tree !");
        return -1;
    }
    void deleteNode(String value){
        int location = search(value);
        if (location == -1)
            return;
        else {
            arr[location] = arr[lastUsedIndex];
            lastUsedIndex--;
            System.out.println(value+" node is deleted Successfully! ");
        }
    }
    void deleteBT(){
        try {
            arr= null;
            System.out.println("Tree is deleted Successfully! ");
        } catch (Exception e){
            System.out.println("There is an exception in deleting Tree!"+ e);
        }
    }
}
public class BinaryTreeArray {
    public static void main(String[] args) {
        BinaryTreeA a = new BinaryTreeA(9);
        a.insert("n1");
        a.insert("n2");
        a.insert("n3");
        a.insert("n4");
        a.insert("n5");
        a.insert("n6");
        a.insert("n7");
        a.insert("n8");
        a.insert("n9");
//        a.preOrdertraversal(1);
//        System.out.println();
//        a.inOrdertraversal(1);
//        System.out.println();
//        a.postOrderTraversal(1);
//        System.out.println();
        a.levelOrderTraversal();
        System.out.println();
//        a.search("n11");
        a.deleteNode("n4");
        a.levelOrderTraversal();
        a.deleteBT();
    }
}
