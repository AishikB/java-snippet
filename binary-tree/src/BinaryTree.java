public class BinaryTree {
    Node head = null;
    Node presentHead = head;
    public void insert(int value) {
        Node currentNode = new Node(value);
        if(head == null) {
            this.head = currentNode;
            this.presentHead = currentNode;
            return;
        }
        if(value < presentHead.value) {
            // insert in left side of the head
            if(presentHead.left == null) {
                presentHead.left = currentNode;
                presentHead = head;
                return;
            } else {
                Node currentHead = presentHead;
                presentHead = presentHead.left;
                insert(currentHead.left.value);
            }
        } else {
            // insert to right side of the node
            if(presentHead.right == null) {
                presentHead.right = currentNode;
                presentHead = head;
                return;
            } else {
                Node currentHead = presentHead;
                presentHead = presentHead.right;
                insert(currentHead.right.value);
            }
        }
    }

    public boolean contains(int value) {
        if(presentHead == null) {
            return false;
        }
        if(value == presentHead.value) {
            return true;
        }
        else if(value < presentHead.value) {
            // present in the left side of the tree
            presentHead = presentHead.left;
            contains(value);

        } else {
            // present in the right side of the tree
            presentHead = presentHead.right;
            contains(value);
        }
        return false;
    }

    public void printInOrder() {
        if(presentHead == head) {
            System.out.println(presentHead.value);
        }
        if(presentHead.left != null) {
            System.out.println();
        }
    }
}
