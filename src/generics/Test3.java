package generics;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Test3 {
    public static void main(String[] args) {
        List<?> list = new ArrayList<>();
//        list.add("heloo");
        List<? extends Number> list3 = new ArrayList<Integer>();
        List<? super Number> list4 = new ArrayList<Number>();

        List<Double> list1 = new ArrayList<>();
        list1.add(3.5);
        list1.add(3.8);
        list1.add(3.6);
        showListInfo(list1);
        List<String> list2 = new ArrayList<>();
        list2.add("Tudor");
        list2.add("Maria");
        list2.add("Ion");
        showListInfo(list2);

        ArrayList<Double> ald = new ArrayList<>();
        ald.add(3.5);
        ald.add(5.9);
        ald.add(14.2);
        System.out.println(summ(ald));

        ArrayList<Integer> ali = new ArrayList<>();
        ali.add(30);
        ali.add(5);
        ali.add(10);
        System.out.println(summ(ali));
    }

    static void showListInfo(List<?> list) {
        System.out.println("Lista mea contine urmatoarele elemente: " + list);
    }

    public static double summ(ArrayList<? extends Number> al) {
        double summ = 0;
        for (Number n : al){
            summ+= n.doubleValue();
        }
        return summ;
    }
}
