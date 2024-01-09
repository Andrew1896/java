package generics;

import java.util.ArrayList;

public class ParameterizedMethod {

    public static void main(String[] args) {
        ArrayList<Integer> al1 = new ArrayList<>();
        al1.add(12);
        al1.add(30);
        al1.add(220);
        int a = GenMethod.getSecondElement(al1);
        System.out.println(a);
        ArrayList<String> al2 = new ArrayList<>();
        al2.add("Salut");
        al2.add("Copii");
        al2.add("Suma");
//        String s = GenMethod.getSecondElement(al2);
//        System.out.println(s);

    }
}

class GenMethod{
    public  static <T extends Number> T getSecondElement(ArrayList<T> al){
        return al.get(1);
    }
}
