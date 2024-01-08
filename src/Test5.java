import java.util.ArrayList;
import java.util.List;

public class Test5 {
    public static void main(String[]args) {
        List animals = new ArrayList();
        animals.add("cat");
        animals.add("dog"); // 1
        animals.add("frog");

        String animal = (String) animals.get(1);
        System.out.println(animal);

        // parametrizarea

        List<String> animals2 = new ArrayList<String>();
        animals2.add("cat");
        animals2.add("dog");
        animals2.add("frog");
        String animal2 = animals2.get(1);

        // parametrizarea cu Java 7

        List<String> animals3 = new ArrayList<>();
    }
}
