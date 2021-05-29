public class Node<T> {
    private Node nextNode;
    private int index;
    private T value;

    public Node() {
    }

    public Node(Node nextNode, int index, T value) {
        this.nextNode = nextNode;
        this.index = index;
        this.value = value;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
