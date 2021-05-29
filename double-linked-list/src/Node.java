public class Node<T> {
    private Node nextNode;
    private Node previousNode;
    private T value;

    public Node(Node nextNode, Node previousNode, T value) {
        this.nextNode = nextNode;
        this.previousNode = previousNode;
        this.value = value;
    }

}
