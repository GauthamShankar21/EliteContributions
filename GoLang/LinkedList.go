type Node struct {
    val int
    next *Node
}

type MyLinkedList struct {
    head *Node
    length int
}

func Constructor() MyLinkedList {
    return MyLinkedList{head : nil, length: 0}
}

func (this *MyLinkedList) Get(index int) int {
    if index < 0 || index >= this.length {
        return -1;
    }
    
    return this.findNodeAtIndex(index).val;
}

func (this *MyLinkedList) findNodeAtIndex(index int) *Node {
    node := this.head;
    for i := 0; i < this.length; i++ {
        if (i == index) {
            return node;
        }
        
        node = node.next;
    }
    
    return node;
}

func (this *MyLinkedList) AddAtHead(val int)  {
    node := &Node{val: val}
    node.next = this.head
    this.head = node
    this.length++;
}

func (this *MyLinkedList) AddAtTail(val int)  {
    if (this.length == 0) {
        this.AddAtHead(val);
        return;
    }
    
    node := this.findNodeAtIndex(this.length - 1);
    node.next = &Node{val: val}
    this.length++;
}

func (this *MyLinkedList) AddAtIndex(index int, val int)  {
    if (index < 0 || index > this.length) {
        return;
    }  
    if (index == 0) {
        this.AddAtHead(val);
        return
    }
    if (index == this.length) {
        this.AddAtTail(val);
        return
    }
    node := this.findNodeAtIndex(index - 1);
    newNode := &Node{val: val}
    newNode.next = node.next
    node.next = newNode
    this.length++
}

func (this *MyLinkedList) DeleteAtIndex(index int)  {
    if (index < 0 || index >= this.length || this.length == 0) {
        return;
    }
    if (index == 0) {
        if (this.head.next != nil) {
            this.length--;
            this.head = this.head.next;            
        } else {
            this.head = nil
            this.length--;
        }
        return;
    }
    node := this.findNodeAtIndex(index - 1);
    node.next = node.next.next
    this.length--
}
