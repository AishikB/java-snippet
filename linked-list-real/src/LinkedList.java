public class LinkedList<T> {
    Node head = null;

    public void append(T value) {
        Node<T> currentNode = new Node<>(null, value);
        if(head == null) {
            head = currentNode;
            return;
        }
        Node tempNode = head;
        while (tempNode.getNextNode() != null) {
            tempNode = tempNode.getNextNode();
        }
        tempNode.setNextNode(currentNode);
    }

    public void prepend(T value) {
        Node<T> node = new Node(head, value);
        head = node;
    }

    public void delete(T value) {
        Node currentNode = head;
        if(currentNode.getValue() == value) {
            deleteHead();
            return;
        }
        while (!currentNode.getNextNode().getValue().equals(value)) {
            currentNode = currentNode.getNextNode();
        }
        currentNode.setNextNode(currentNode.getNextNode().getNextNode());
    }

    public void deleteHead() {
        Node newHead = head.getNextNode();
        head = newHead;
    }

    public void getValues() {
        Node tempNode = head;
        while (tempNode.getNextNode() != null) {
            System.out.println(tempNode.getValue());
            tempNode = tempNode.getNextNode();
        }
        System.out.println(tempNode.getValue());
    }
}
