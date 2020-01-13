public class Node<E>{
    private E info;
    private Node<E> parent;
    private Node<E> left;
    private Node<E> right;

    public Node(E val){
        info = val;
        parent = null;
        left = null;
        right = null;
    }
    public E getInfo(){
        return this.info;
    }
    public void setInfo (E val){
        this.info = val;
    }
    public void setLeft(Node<E> v){
        this.left = v;
    }
    public void setRight(Node<E> v){
        this.right = v;
    }
    public void setParent(Node<E> v){
        this.parent = v;
    }
    public E getInfo(){
        return this.info;
    }
    public Node<E> getParent(){
        return this.parent;
    }
    public Node<E> getLeft(){
        return this.left;
    }
    public Node<E> getRight(){
        return this.right;
    }
}