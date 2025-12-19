package collections.iterator;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");

        ListIterator<String> li = list.listIterator();
        while (li.hasNext()) {
            System.out.println(li.next());
        }
    }
}
