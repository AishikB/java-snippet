import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Main {
    public static void main(String[] args) {
        CopyOnWriteArrayList<Number> list = new CopyOnWriteArrayList<>(Arrays.asList(1,21,2,42,64));
        /*Iterator<Number> i = list.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
            list.remove(1);
        }
*/
        for(Number a:list) {
            System.out.println(a);
            list.remove((Object)2);
        }
        System.out.println(list);

        Thread t = new Thread(() -> {
            for(int i=0; i<10; i++) {
                System.out.println(i);
            }
        });
        t.start();
        t.getId();
    }
}
