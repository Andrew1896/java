package comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class test2 {

    public static void main(String[] args) {
        List<Angajat> list = new ArrayList<>();
        Angajat x1 = new Angajat(130, "Andreea", "Popescu", 13800);
        Angajat x2 = new Angajat(116, "Vadim", "Cocier", 10300);
        Angajat x3 = new Angajat(145, "Ion", "Pusca", 18000);
        // Arrays.sort(new Angajat[] (x1, x2, x3));
        list.add(x1);
        list.add(x2);
        list.add(x3);
        System.out.println("Inainte de comparatie \n " + list);
        Collections.sort(list);
        System.out.println("Dupa comparatie \n " + list);


    }
}
    class Angajat implements  Comparable<Angajat>{


        int iq;
        String nume;
        String prenume;
        int salariu;

        public Angajat(int iq, String nume, String prenume, int salariu) {
            this.iq = iq;
            this.nume = nume;
            this.prenume = prenume;
            this.salariu = salariu;

        }

        @Override
        public String toString() {
            return "Angajat{" +
                    "iq=" + iq +
                    ", nume='" + nume + '\'' +
                    ", prenume='" + prenume + '\'' +
                    ", salariu=" + salariu +
                    '}';
        }

        @Override
        public int compareTo(Angajat anotherx) {
            //    if (this.iq == anotherx.iq){
            //    return 0;
            // }
            // else if (this.iq<anotherx.iq) {
            //    return -1;
            // }
            // else {
            //  return 1;
            // }
// return this.iq-anotherx.iq;
            int rezultatul = this.nume.compareTo(anotherx.nume);
            if (rezultatul == 0){
        }
                return rezultatul;
        }
    }

