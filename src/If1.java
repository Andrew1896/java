import java.util.Scanner;
public class If1 {
        public static void main(String[]args) {
                Scanner s = new Scanner(System.in);
                System.out.println();
                int z = s.nextInt();
                int myInt = z;
                    if(myInt>20){
                    System.out.println("Da este adevarat");
            } else if(myInt<10){
                System.out.println("Nu este adevarat");
            } else{
                System.out.println("Nu corespunde conditiilor");
            }

        }
    }
