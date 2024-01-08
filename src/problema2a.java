import java.util.Scanner;

public class problema2a {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Introduceti echipa preferata:");
        String echipa1 = s.nextLine();
        System.out.println("Introduceti echipa adversa:");
        String echipa2 = s.nextLine();
        System.out.println("Introduceti numarul de meciuri directe:");


        int numarMeciuri = s.nextInt();


        System.out.println("Care sunt scorurile pentru aceste meciuri:");
        for (int numarMinim = 1; numarMinim <= numarMeciuri; numarMinim++)
        {
            String scoruri = s.next();

        }
        System.out.println("Scorurile finale in meciurile directe sunt:");
        System.out.println(echipa1 + " " +  " " + echipa2);

    }
}




