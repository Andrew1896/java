package generics;

public class ParameterizedClass {
    public static void main(String[] args) {
//        Info<String> info1 = new Info<>("Salut");
//        System.out.println(info1);
//        String s = info1.getValue();

        Info<Integer> info2 = new Info<>(25);
        System.out.println(info2);
        Integer i = info2.getValue();

        Info<Double> info21 = new Info<>(25.3);
        System.out.println(info21);
        Double d1 = info21.getValue();

    }
}

class Info<T extends  Number> {
    private T value;

    public Info(T value) {
        this.value = value;
    }

    public String toString() {
        return "{[" + value + "]}";
    }
    public T getValue(){
        return value;
    }
}
