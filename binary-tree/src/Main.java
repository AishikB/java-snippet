public class Main {
    public static void main(String[] args) {
        BinaryTree b = new BinaryTree();
        b.insert(10);
        b.insert(5);
        b.insert(11);
        b.insert(4);
        b.insert(7);

        System.out.print(b.contains(7));
    }
}
