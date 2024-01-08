import java.util.LinkedList;
public class LinkedList1 {
    public static void main(String[] args) {

        Student2 st1 = new Student2("Tudor", 4);
        Student2 st2 = new Student2("Maria", 1);
        Student2 st3 = new Student2("Vadim", 3);
        Student2 st4 = new Student2("Alexandra", 3);
        Student2 st5 = new Student2("Ion", 4);

        LinkedList<Student2> student2LinkedList = new LinkedList<>();
        student2LinkedList.add(st1);
        student2LinkedList.add(st2);
        student2LinkedList.add(st3);
        student2LinkedList.add(st4);
        student2LinkedList.add(st5);
        System.out.println("LinkedList = " + student2LinkedList);
        System.out.println(student2LinkedList.get(2));
        Student2 st6 = new Student2("Mihai", 2);
        Student2 st7 = new Student2("Ana", 3);
        student2LinkedList.add(st6);
        System.out.println("LinkedList = " + student2LinkedList);
        student2LinkedList.add(1, st7);
        System.out.println("LinkedList = " + student2LinkedList);
        student2LinkedList.remove(2);
        System.out.println("LinkedList = " + student2LinkedList);

    }
}

class Student2 {
    String nume;
    int curs;

    public Student2(String nume, int curs) {
        this.nume = nume;
        this.curs = curs;
    }

    @Override
    public String toString() {
        return "Student2{" +
                "nume='" + nume + '\'' +
                ", curs=" + curs +
                '}';
    }
}