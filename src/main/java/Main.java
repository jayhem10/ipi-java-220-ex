import com.ipiecoles.java.java220.Commercial;
import com.ipiecoles.java.java220.Employe;
import com.ipiecoles.java.java220.Technicien;
import org.joda.time.LocalDate;

import java.util.ArrayList;

public class Main {
        public static void main(String[] args) {
            String nom;
            System.out.println("Hello World");


    Employe employe1 = new Employe("John", "Doe", "M4528", LocalDate.now(), 1680d);
    Employe employe2 = new Employe("John", "Doe", "M4528", LocalDate.now(), 2000d);
    Commercial commercial = new Commercial("John", "Doe", "M4528", LocalDate.now(), 2000d, 100000d);
    Technicien technicien = new Technicien("John", "Doe", "M4528", LocalDate.now(), 2000d, 3);

        System.out.println(employe1.toString());
        System.out.println(employe1.equals(employe2));
        System.out.println(employe1.hashCode());
        System.out.println(employe2.hashCode());

        ArrayList<Employe> employes = new ArrayList<>();
        employes.add(employe1);
            employes.add(employe2);
            employes.add(technicien);
            employes.add(commercial);

            for (Employe e : employes)
            {
                System.out.println("Prime : " + e.getPrimeAnnuelle());
            }


        }
    }

