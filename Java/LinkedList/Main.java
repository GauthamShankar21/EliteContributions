package LinkedList;

public class Main {
    public static void main(String[] args) {

        System.out.println("Inserting First element ");
        LL list = new LL();
        list.insertFirst(34);
        list.insertFirst(65);
        list.insertFirst(54);
        list.insertFirst(12);
        list.insertFirst(9); list.display();

//        System.out.println("Inserting Last element ");
//        list.insertLast(76); list.display();
//
//        System.out.println("Inserting element at index");
//        list.insertIndex(5, 6); list.display();

//        System.out.println("Deleting First element "+list.deleteFirst()); list.display();
//
//        System.out.println("Deleting Last element "+list.deleteLast()); list.display();
//
//        System.out.println("Deleting Index element "+list.deleteIndex(3)); list.display();

//        System.out.println("Find element "+list.find(54));

//        System.out.println("Reverse of list: ");
//        list.reverse(); list.display();

//        System.out.println("\nInserting Element Using Recursion: ");
//        list.insertUsingRecursion(104, 2); list.display();

        System.out.println("\n Bubble Sort");
        list.bubbleSortFunc();
        list.display();
    }
}
