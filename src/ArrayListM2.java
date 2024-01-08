import java.util.ArrayList;
import java.util.Objects;

public class ArrayListM2 {

    public static void main(String[] args) {
        Student st1 = new Student("Tudor", 'M', 23, 4, 7.2);
        Student st2 = new Student("Maria", 'F', 19, 1, 8.4);
        Student st3 = new Student("Vadim", 'M', 22, 3, 7.8);
        Student st4 = new Student("Alexandra", 'F', 22, 3, 8.0);
        Student st5 = new Student("Ion", 'M', 23, 4, 7.5);
        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(st1);
        studentList.add(st2);
        studentList.add(st3);
        studentList.add(st4);
        studentList.add(st5);
        System.out.println(studentList);
        Student st6 = new Student("Ion", 'M', 23, 4, 7.5);
       // studentList.remove(st6);
        int index = studentList.indexOf(st6);
        System.out.println(index);
    }
    }

    class Student {
        private String nume;
        private char sex;
        private int virsta;
        private int curs;
        private double notamedie;

        public Student(String nume, char sex, int virsta, int curs, double notamedie) {
            this.nume = nume;
            this.sex = sex;
            this.virsta = virsta;
            this.curs = curs;
            this.notamedie = notamedie;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "nume='" + nume + '\'' +
                    ", sex=" + sex +
                    ", virsta=" + virsta +
                    ", curs=" + curs +
                    ", notamedie=" + notamedie +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Student student = (Student) o;
            return sex == student.sex && virsta == student.virsta && curs == student.curs && Double.compare(notamedie, student.notamedie) == 0 && Objects.equals(nume, student.nume);


        }
    }