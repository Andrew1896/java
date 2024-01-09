package generics.joc;

public class Test {
    public static void main(String[] args) {

        Schoolar schoolar1 = new Schoolar("Ion", 13);
        Schoolar schoolar2 = new Schoolar("Victor", 14);

        Student student1 = new Student("Maria", 19);
        Student student2 = new Student("Sergiu", 21);

        Employee employee1 = new Employee("Mihai", 43);
        Employee employee2 = new Employee("Victoria", 37);

        Team<Schoolar> schoolarTeam = new Team<>("Fulger");
        Team<Student> studentTeam = new Team<>("Magic");
        Team<Employee> employeeTeam = new Team<>("Panda");

        schoolarTeam.addNewParticipant(schoolar1);
        schoolarTeam.addNewParticipant(schoolar1);
        studentTeam.addNewParticipant(student1);
        studentTeam.addNewParticipant(student2);
        employeeTeam.addNewParticipant(employee1);
        employeeTeam.addNewParticipant(employee1);

        Team<Schoolar> schoolarTeam2 = new Team<>("Orange");
        Schoolar schoolar3 = new Schoolar("Maxim", 13);
        Schoolar schoolar4 = new Schoolar("Alexa", 15);
        schoolarTeam2.addNewParticipant(schoolar3);
        schoolarTeam2.addNewParticipant(schoolar4);
        schoolarTeam.playWith(schoolarTeam2);
    }
}
