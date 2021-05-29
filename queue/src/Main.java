public class Main {

    public static void main(String[] args) {
        /*Queue<String> queue = new Queue<>();
        queue.add("Aishik");
        queue.add("Jack");
        queue.add("Jane");
        queue.add("Peter");
        queue.add("John");

        queue.display();

       queue.remove();
        System.out.println("............................");
        queue.display();*/

        Stack<Integer> stack = new Stack<>();
        stack.add(1);
        stack.add(2);
        stack.add(3);
        stack.add(4);
        stack.add(5);
        stack.add(6);
        stack.add(7);

        stack.display();
        System.out.println(".................................");
        stack.remove();
        stack.display();

    }
}
