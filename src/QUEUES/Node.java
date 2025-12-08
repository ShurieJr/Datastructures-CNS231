package QUEUES;

public class Node <T> {
    private T element;
    private Node<T> next;
    Node(){
    element = null;
    next=null;
    }
    public Node(T element) {
        this.element = element;
        this.next = null;
    }
    //get , set
    public T getElement() {
        return element;
    }
    public void setElement(T element) {
        this.element = element;
    }
    public Node<T> getNext() {
        return next;
    }
    public void setNext(Node<T> next) {
        this.next = next;
    }
}
