package generics;

import java.util.ArrayList;
import java.util.List;

public class Test1 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Salut");
        list.add("Ce faci?");
        list.add("Barcelona");
        list.add("Andrei");

        for (Object A : list) {
            System.out.println(A + " lungimea cuvintului: " + ((String) A).length());
        }

    }
}
