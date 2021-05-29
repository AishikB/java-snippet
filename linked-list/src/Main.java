public class Main {

    public static void main(String[] args) {
        LinkedListImpl<String> list = new LinkedListImpl<>();
        list.add("Aishik");
        list.add("Bhattacharya");
        list.add("asdsad");

        for(int i=0; i<3; i++) {
            System.out.println(list.get(i));
        }
    }
}
