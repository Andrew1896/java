public class ClassesAndObjects1 {
        public static void main (String[]args) {
            Person person1 = new Person();
            person1.setName("Andrei");
            person1.age = 27;
            Person person2 = new Person();
            person2.name = "Victor";
            person2.age = 28;
            int years1 = person1.calculateYearsToRetirement();
            int years2 = person2.calculateYearsToRetirement();
            System.out.println("Primei persoane pina la pensie: "+years1+"ani");
            System.out.println("Persoanei nr. 2 pina la pensie: "+years2+"ani");
        }
    }


    class Person {
        String name;
        int age;

        void setName(String username){
            name = username;

        }

        int calculateYearsToRetirement() {

            int years = 65 - age;
            return years;
        }
    }

