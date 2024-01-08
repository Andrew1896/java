import java.util.Scanner;

public class problema2 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Introduceti echipa preferata:");
        String x = s.nextLine();
        System.out.println("Introduceti echipa adversa:");
        String y = s.nextLine();
        System.out.println("Introduceti numarul de meciuri directe:");
        int z = s.nextInt();
            System.out.println("Care sunt scorurile pentru aceste meciuri:");
            String scor1 = s.next();
            String scor2 = s.next();
            String scor3 = s.next();
            String scor4 = s.next();
            System.out.println("Scorurile finale in meciurile directe sunt:");
            System.out.println(x + " " + scor1 + " " + y);
            System.out.println(x + " " + scor2 + " " + y);
            System.out.println(x + " " + scor3 + " " + y);
            System.out.println(x + " " + scor4 + " " + y);

        }
    }
