package generics;

import java.util.ArrayList;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
//        X x = new Y();
//        List<X> list1 = new ArrayList<X>();
        List<Number> list = new ArrayList<>();
        list.add(18);
        list.add(4.5);


    }
}

class X {

}
class Y extends X {

}