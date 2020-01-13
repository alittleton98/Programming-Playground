public class BinaryTree<E>{
    Node<E> root;
    int numNodes;
    
    public binaryTree(){
        root = null;
        numNodes = 0;
    }

    public void setLeftBT(Node<E> p, Node<E> c){
        p.setLeft(c);
        c.setParent(p);
        numNodes++;
    }
    public void setRightBT(Node<E> p, Node<E> c){
        p.setRight(c);
        c.setParent(p);
        numNodes++;
    }
    
}