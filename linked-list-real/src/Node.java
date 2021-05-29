public class Node<T> {
    private Node nextNode;
    private T value;

    public Node() {
    }

    public Node(Node currentNode, T value) {
        this.nextNode = currentNode;
        this.value = value;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node currentNode) {
        this.nextNode = currentNode;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
