
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BinarySearch {

    public static void main(String[] args) {

      //  ArrayList<Integer> arrayList = new ArrayList<>();
     //   arrayList.add(-2);
     //   arrayList.add(3);
      //  arrayList.add(0);
     //   arrayList.add(22);
     //   arrayList.add(29);
     //   arrayList.add(-18);
      //  arrayList.add(-8);
    //    arrayList.add(176);
     //   arrayList.add(78);
      //  arrayList.add(19);
    // arrayList.add(-30);
    //    Collections.sort(arrayList);
     //   System.out.println(arrayList);

// !!!Mai este si metoda clasei Collections reverse-care este
// opusul la sort adica inverseaza lista
// si metoda shuffle care amesteca lista.


      //  int index1 = Collections.binarySearch(arrayList, 8);
 //  System.out.println(index1);





        //    Angajat x1 = new Angajat(130, "Andreea",  13800);
          //  Angajat x2 = new Angajat(116, "Vadim", 10300);
         //   Angajat x3 = new Angajat(98, "Ion", 18000);
          //  Angajat x4 = new Angajat(65, "Tolea", 8800);
           // Angajat x5 = new Angajat(47, "Ana", 7000);
        //    Angajat x6 = new Angajat(123, "Irina", 13200);
          //  Angajat x7 = new Angajat(101, "Marin", 14600);

      //  List<Angajat> angajatList = new ArrayList<>();

       // angajatList.add(x1);
       // angajatList.add(x2);
       // angajatList.add(x3);
       // angajatList.add(x4);
       // angajatList.add(x5);
       // angajatList.add(x6);
       // angajatList.add(x7);
       //  System.out.println(angajatList);
    // Collections.sort(angajatList);
      //  System.out.println(angajatList);
   //  int index2 = Collections.binarySearch(angajatList
   // , new Angajat(47, "Ana", 7000));
      //  System.out.println(index2);

int [] array = {-2, 3, 0, 22, 29, -18, -8, 176, 78, 19, -30};
System.out.println(Arrays.toString(array));
Arrays.sort(array);
System.out.println(Arrays.toString(array));
int index = Arrays.binarySearch(array, 78);
System.out.println(index);





    }
}

class Angajat implements Comparable<Angajat>{


    int iq;
    String nume;
    int salariu;

    public Angajat(int iq, String nume, int salariu) {
        this.iq = iq;
        this.nume = nume;
        this.salariu = salariu;

    }

    @Override
    public String toString() {
        return "Angajat{" +
                "iq=" + iq +
                ", nume='" + nume + '\'' +
                ", salariu=" + salariu +
                '}';
    }

    @Override
    public int compareTo(Angajat anotherx) {
        int rezultatul = this.iq - anotherx.iq;
        if (rezultatul == 0){
            rezultatul = this.nume.compareTo(anotherx.nume);

        }
        return rezultatul;    }
}