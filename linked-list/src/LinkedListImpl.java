import java.util.HashMap;
import java.util.Map;

public class LinkedListImpl<T> {

    private Node node;
    private Node previousNode;
    private Map<Integer, Node> lists;

    public LinkedListImpl() {
        this.previousNode = null;
        this.lists = new HashMap<>();
    }

    public void add(T value) {
        this.node = new Node(null,-1,null);
        this.node.setValue(value);
        int index = 0;
        if(this.previousNode != null) {
            index = this.previousNode.getIndex() + 1;
            this.previousNode.setNextNode(node);
        }
        this.node.setIndex(index);
        this.previousNode = node;
        this.lists.put(index, node);
    }

    public T get(int index) {
        return (T)this.lists.get(index).getValue();
    }
}
