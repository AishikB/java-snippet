public class Stack<T> {
    private StackNode<T> top;
    //add to tail and remove from tail

    public void add(T value) {
        StackNode<T> currentNode = new StackNode<>(null, value);
        if(this.top == null) {
            this.top = currentNode;
            return;
        }
        currentNode.setPrevNode(this.top);
        this.top = currentNode;
    }

    public T remove() {
        T value = this.top.getValue();
        this.top = this.top.getPrevNode();
        return value;
    }

    public void display() {
        StackNode<T> currentNode = this.top;
        while (currentNode.getPrevNode() != null) {
            System.out.println(currentNode.getValue());
            currentNode = currentNode.getPrevNode();
        }
        System.out.println(currentNode.getValue());
    }

}
