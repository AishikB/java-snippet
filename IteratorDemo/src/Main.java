import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.addAll(new ArrayList<>(Arrays.asList("B", "C")));

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String val = iterator.next();
            if(val == "B")
            iterator.remove();
        }

        ListIterator<String> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }

        list.forEach(Main::readVals);
    }

    public static void readVals(String val) {
        System.out.println(val);
    }
}
