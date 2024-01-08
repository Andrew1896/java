import java.util.ArrayList;
import java.util.Iterator;

public class iterator {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Ion");
        arrayList1.add("Vadim");
        arrayList1.add("Andreea");
        arrayList1.add("Gicu");
        arrayList1.add("Elena");

        Iterator<String> iterator = arrayList1.iterator();
        while (iterator.hasNext()) {
            iterator.next();
            iterator.remove();
            // System.out.println(iterator.next());
        }
        System.out.println(arrayList1);


    }
}
