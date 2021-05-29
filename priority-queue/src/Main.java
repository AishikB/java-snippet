import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>((obj1, obj2) -> {
            if(obj1 < obj2) {
                return 1;
            } else if(obj1>obj2) {
                return -1;
            } else {
                return 0;
            }
        });
        queue.add(10);
        queue.add(5);
        queue.add(8);
        queue.add(7);
        queue.add(21);
        queue.add(17);
        queue.add(10);

        queue.forEach(System.out::println);
        System.out.println("..................................");
        queue.remove();
        queue.forEach(System.out::println);
        System.out.println("..................................");
        queue.remove();
        queue.forEach(System.out::println);
        System.out.println("..................................");
        queue.remove();
        queue.forEach(System.out::println);
        System.out.println("..................................");
        queue.remove();
        queue.forEach(System.out::println);

    }
}
