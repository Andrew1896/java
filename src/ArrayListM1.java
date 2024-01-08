import java.util.ArrayList;
import java.util.List;

public class ArrayListM1 {
    public static void main(String[] args) {

        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Ion");
        arrayList1.add("Vadim");
        arrayList1.add("Andreea");
        arrayList1.add(1, "Gicu");

        for (String s:arrayList1) {
            System.out.print(s + " ");
        }
        System.out.println();

        //System.out.println(arrayList1.get(2));
//for(int i=0; i<arrayList1.size(); i++) {
  //  System.out.println(arrayList1.get(i));
arrayList1.set(1,"Victor");
arrayList1.remove(0);

        System.out.println(arrayList1);

}
        }


