public class StackNode<T> {
    private StackNode prevNode;
    private T value;

    public StackNode() {
    }

    public StackNode(StackNode prevNode, T value) {
        this.prevNode = prevNode;
        this.value = value;
    }

    public StackNode getPrevNode() {
        return prevNode;
    }

    public void setPrevNode(StackNode prevNode) {
        this.prevNode = prevNode;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
