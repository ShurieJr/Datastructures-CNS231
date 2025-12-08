package QUEUES;

public class LinkedQueue <T> {
    //data fields
    private Node<T> head , tail;
    private int counter;
    LinkedQueue(){
        head = null;
        tail =  null;
        counter = 0;
    }
    //operations
    //size
    int size(){
        return counter;
    }
    //isempty
    boolean isEmpty(){
        return counter == 0;
    }

    //first
    T first(){
        if(isEmpty()){
            System.out.println("The queue is Empty");
            return null;
        }
        return head.getElement();
    }

    //enqueue
    void enqueue(T element){
        Node<T> node = new Node<>(element);
        if(isEmpty())
            head = node;
        else
            tail.setNext(node);
        tail = node;
        counter++;
    }

    //dequeue
    T dequeue(){
        if(isEmpty()){
            System.out.println("The queue is Empty");
            return null;
        }
        T removedElement = head.getElement();
        head = head.getNext();
        counter--;
        if(isEmpty())
            tail = null;
        return removedElement;
    }

    //print queue elements
    void displayElements(){
        if(isEmpty()){
            System.out.println("The queue is Empty");
            return;
        }
        Node<T> currentAddress= head;
        System.out.println("----------------");
        while(currentAddress != null){
            System.out.println(currentAddress.getElement());
            currentAddress = currentAddress.getNext();
        }
        System.out.println("----------------");    }



    //main method
    static void main() {
        LinkedQueue<String> names = new LinkedQueue<>();
        names.enqueue("Ali");
        names.enqueue("Omar");
        names.enqueue("Gedi");
        names.enqueue("Hawa");
        names.enqueue("Wardhere");
        names.dequeue();
        System.out.println("first: " + names.first());
        System.out.println("size: " + names.size());
        System.out.println("Empty: " + names.isEmpty());
        names.displayElements();
    }
}
