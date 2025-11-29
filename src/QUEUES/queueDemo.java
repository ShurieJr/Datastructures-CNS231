package QUEUES;

import java.util.LinkedList;
import java.util.Queue;

public class queueDemo {
    static void main() {
        Queue<String> students = new LinkedList<>();
        students.add("Abdullahi omar");
        students.offer("Osman Geedi");
        students.offer("hawa  muse");

        System.out.println("Students:" + students);
        System.out.println("Students size:" + students.size());
        System.out.println("Students isempty:" + students.isEmpty());
        //System.out.println("First student: " + students.peek());  //null
        //System.out.println("First student: " + students.element());  //exception

        System.out.println(" poll: " + students.poll());  //null
        System.out.println("remove: " + students.remove()); //exception



    }
}
