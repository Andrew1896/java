import java.util.ArrayList;
import java.util.List;

public class ArrayListM5 {
    public static void main(String[] args) {

        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Ion");
        arrayList1.add("Vadim");
        arrayList1.add("Andreea");
        arrayList1.add("Gicu");
        arrayList1.add("Elena");
        List<Integer> list1 = List.of(3,9,21);
        System.out.println(list1);

        //(13,14) nu poate fi modificat de ex: cu list.add(12);
       List<String> list2 = List.copyOf(arrayList1);
        System.out.println(list2);




        // System.out.println(arrayList1);
        // Object[] array = arrayList1.toArray();
        // String[] array2 = arrayList1.toArray(new String[0]);

         // for( String s: array2 ){
            // System.out.println(s);





      //  List<String> myList = arrayList1.subList(1, 4);
      //  System.out.println(myList);
      //  myList.add("Tudor");
      //  System.out.println(myList);
       // System.out.println(arrayList1);




        //de la sublist  ArrayList<String> arrayList2 = new ArrayList<>();
        //de la sublist arrayList2.add("Vadim");
        //de la sublist arrayList2.add("Andreea");
       // arrayList2.add("Igor");
        //arrayList1.removeAll(arrayList2);
     // arrayList1.retainAll(arrayList2);
       // System.out.println(arrayList1);
      //  boolean result = arrayList1.containsAll(arrayList2);
        // System.out.println(result);



    }
}