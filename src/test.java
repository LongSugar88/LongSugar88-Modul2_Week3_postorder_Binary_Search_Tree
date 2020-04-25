public class test {
    public static void main(String[] args) {
        Binary_Search_Tree<Integer> myTree = new Binary_Search_Tree<>();
        myTree.insert(5);
        myTree.insert(17);
        myTree.insert(16);
        myTree.insert(18);
        myTree.insert(4);
        myTree.insert(8);
        myTree.insert(2);
        myTree.insert(1);
        myTree.insert(3);
        myTree.postorder();
    }
}
