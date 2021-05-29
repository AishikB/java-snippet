public class Queue<T> {
    private Node head;
    private Node tail;

    // add to the tail and remove from head

    public void add(T value) {
        Node<T> currentNode = new Node<>(value, null);
        if(head == null) {
            this.head = currentNode;
            return;
        }
        if(tail == null) {
            this.tail = currentNode;
            this.head.setNextNode(currentNode);
            return;
        }
        tail.setNextNode(currentNode);
        this.tail = currentNode;
    }

    public T remove() {
        if(head == null) {
            return null;
        }
        T headVal = (T)this.head.getValue();
        this.head = this.head.getNextNode();
        return  headVal;
    }

    public void display() {
        Node currentNode = this.head;
        while (currentNode.getNextNode() != null) {
            System.out.println(currentNode.getValue());
            currentNode = currentNode.getNextNode();
        }
        System.out.println(currentNode.getValue());
    }
}
