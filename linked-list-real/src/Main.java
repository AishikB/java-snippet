public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.append(1);
        list.append(2);
        list.append(3);
        list.append(4);
      /*  list.append("Aishik");
        list.append("Asdasdsa");
        list.append("Aishik");
        list.prepend("Hello");*/
        list.prepend(0);


        list.getValues();
        System.out.println("..............");
        list.delete(4);
        list.append(5);
        list.getValues();
    }
}
