import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        // Creating a priority queue
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        // Adding elements to the priority queue
        priorityQueue.add(5);
        priorityQueue.add(2);
        priorityQueue.add(8);
        priorityQueue.add(1);
        priorityQueue.add(3);

        // Printing the elements of the priority queue
        System.out.println("Priority Queue elements: " + priorityQueue);

        // Removing elements from the priority queue
        int removedElement = priorityQueue.poll();
        System.out.println("Removed element: " + removedElement);
        System.out.println("Priority Queue elements after removal: " + priorityQueue);

        // Peek the element with the highest priority without removing it
        int peekedElement = priorityQueue.peek();
        System.out.println("Peeked element: " + peekedElement);
        System.out.println("Priority Queue elements after peek: " + priorityQueue);
    }
}
