package comparator;
import java.util.ArrayList;
import java.util.Collections;
import  java.util.List;
public class test1 {
    public static void main(String[] args) {
    List <String> List = new ArrayList<>();
    List.add("Ion");
    List.add("Vadim");
    List.add("Andreea");
        System.out.println("Inainte de comparatie");
        System.out.println(List);
        Collections.sort(List);
        System.out.println("Dupa comparatie");
        System.out.println(List);
    }
}
