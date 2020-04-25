public class Binary_Search_Tree<T extends Comparable> {
    Node<T> root;
    private int size;

    Binary_Search_Tree(){

    }
    public boolean insert(T element){
        Node<T> parrent = null;
        Node<T> current = root;

        if(root == null){
            root = new Node<>(element);
            size++;
            return true;
        } else {
            while (current!= null){
                if(current.data.compareTo(element) > 0){
                    parrent = current;
                    current = current.left;
                } else if(current.data.compareTo(element) < 0){
                    parrent = current;
                    current = current.right;
                } else {
                    return false;
                }
            }
            if(parrent.data.compareTo(element) > 0){
                parrent.left = new Node<>(element);
            } else {
                parrent.right = new Node<>(element);
            }
        }
        size++;
        return true;
    }
    public void postorder(){
        postorder(root);
        size--;
    }
    private void postorder(Node<T> root){
        if(root == null){
            return;
        }
            postorder(root.left);
            postorder(root.right);
            System.out.println(root.data + " ");
    }
}
