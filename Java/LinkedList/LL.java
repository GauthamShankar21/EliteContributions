package LinkedList;

public class LL {

    private Node head;
    private Node tail;
    private int size;

    public LL(){
        this.size = 0;
    }

    public class Node{
        public int val;
        public Node next;

        public Node (int val){
            this.val  = val;
        }

        public Node (int val, Node node){
            this.val = val;
            this.next = node;
        }
    }

    public void insertFirst(int val){
        Node n = new Node(val);
        n.next = head;
        head = n;

        if (tail == null){
            tail = head;
        }

        size++;
    }

    public int deleteFirst(){
        int x= head.val;
        head = head.next;
        size--;
        if (head==null){
            tail=null;
        }
        return x;
    }

    public void insertLast(int val){
        Node n = new Node(val);
        if (tail==null){
            insertFirst(val);
        }
        else {
            tail.next = n;
            tail = n;
            size++;
        }
    }

    public void insertIndex(int val, int index){
        if (index == 0){
            insertFirst(val);
            return;
        }

        if (index == size){
            insertLast(val);
            return;
        }

        Node temp=head;
        for (int i=1; i<index; i++){
            temp = temp.next;
        }
        Node n = new Node(val, temp.next);
        temp.next = n;
        size++;
    }

    public Node find (int value){
        Node node = head;
        while (node!=null){
            if (node.val == value){
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public Node get(int index){
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public int deleteLast(){
        if (size<=1){
            return deleteFirst();
        }
        Node secondLast = get(size-2);
        int val = tail.val;
        tail = secondLast;
        tail.next = null;
        return val;
    }

    public int deleteIndex(int index){
        if (index <= 1){
            return deleteFirst();
        }

        if (index == size-1){
            return deleteLast();
        }

        Node prev = get(index-1);
        int val = prev.next.val;
        prev.next = prev.next.next;
        return val;
    }

    public void display(){
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.val+" -> ");
            temp = temp.next;
        }
        System.out.print("END \nSIZE: "+size + "\n");
    }

    public Node reverse(){
        Node curr = head;
        Node prev = null;

        while (curr!=null){
            Node t = curr.next;
            curr.next = prev;
            prev = curr;
            curr = t;
        }
        return prev;
    }

    public void insertUsingRecursion(int val, int index){
        head =  insertRec(val, index, head);
    }

    public Node insertRec(int val, int index, Node n){
        if(index == 0){
            Node temp = new Node(val, n);
            size++;
            return temp;
        }

        n.next = insertRec(val, index-1, n.next);
        return n;
    }

    public void bubbleSortFunc(){
        bubbleSort(size-1, 0);
    }

    private void bubbleSort(int row, int col) {
        if(row == 0){
            return;
        }

        if(col < row){
            Node first = get(col);
            Node second = get(col+1);

            if(first.val > second.val){
                if(first == head){
                    head = second;
                    first.next = second.next;
                    second.next = first;
                } else if(second == tail){
                    Node prev = get(col-1);
                    prev.next = second;
                    tail = first;
                    first.next = null;
                    second.next = tail;
                } else {
                    Node prev = get(col-1);
                    prev.next = second;
                    first.next =second.next;
                    second.next = first;
                }
            }
            bubbleSort(row, col+1);
        } else {
            bubbleSort(row-1, 0);
        }
    }

}
