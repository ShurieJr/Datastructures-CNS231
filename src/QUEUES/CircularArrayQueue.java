package QUEUES;

public class CircularArrayQueue<T> {
    //data fields
    private int front , rear , counter;
    private final static int DEFAULT_CAPACITY=2;
    private T[] queue;
    //constructors
    CircularArrayQueue(int capacity){
        front = rear = counter = 0;
        queue =(T[]) new Object[capacity];
    }
    CircularArrayQueue(){
//        front = rear = counter = 0;
//        queue =(T[]) new Object[DEFAULT_CAPACITY];
        this(DEFAULT_CAPACITY);
    }
    //operations
    //isEmpty
    boolean isEmpty(){return  counter == 0;}
    //isFull
    boolean isFull(){return counter == queue.length;}
    //size
    int size () {return counter;}
    //expand capacity
    private void expendCapacity(){
        T[] temp =(T[]) new Object[queue.length * 2];
        for(int i=0; i<counter; i++){
            temp[i] = queue[front];
            front = (front+1) % queue.length;
        }
        front = 0;
        rear = counter;
        queue = temp;
    }
    //enqueue
    void enqueue(T element){
        if(isFull())
            expendCapacity();
        queue[rear] = element;
        rear = (rear +1) % queue.length;
        counter++;
    }
    //dequeue
    T dequeue(){
        if(isEmpty()){
            System.out.println("The queue is Empty");
            return null;
        }
        T result =queue[front];
        queue[front] = null;
        front = (front +1) % queue.length;
        counter--;
        return result;
    }
    //get length
    int getLength(){return queue.length;}
    //first
    T first(){
        if(isEmpty()){
            System.out.println("The queue is Empty");
            return null;
        }
        return queue[front];
    }

    //print elements
    void printElements(){
        if(isEmpty()){
            System.out.println("The queue is Empty");
            return;
        }
        int index = front;
        for(int i =0; i< counter; i++){
            System.out.println(queue[index]);
            index = (index + 1) % queue.length;
        }

    }

    //main method
    static void main() {
        CircularArrayQueue<Integer> numbers = new CircularArrayQueue<>(3);
        numbers.enqueue(23);
        numbers.enqueue(90);
        numbers.enqueue(27);
        numbers.enqueue(27);
        numbers.enqueue(100);
        //numbers.dequeue();
        numbers.enqueue(20);
        numbers.enqueue(20);
        numbers.enqueue(29);

        System.out.println("size: " + numbers.size());
        System.out.println("length: " + numbers.getLength());
        System.out.println("isEmpty: " + numbers.isEmpty());
        System.out.println("isFull: " + numbers.isFull());
        System.out.println("front: " + numbers.first());
        System.out.println("---queue elements----");
        numbers.printElements();
    }
}
