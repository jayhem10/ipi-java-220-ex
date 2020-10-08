import com.ipiecoles.java.java220.Commercial;
import com.ipiecoles.java.java220.Employe;
import org.joda.time.LocalDate;

public class Main {
        public static void main(String[] args) {
            String nom;
            System.out.println("Hello World");

    Employe employe = new Employe();
    Employe employe1 = new Employe("John", "Doe", "M4528", LocalDate.now(), 1680d);
    Employe employe2 = new Employe("John", "Doe", "M4528", LocalDate.now(), 2000d);
        System.out.println(employe1.toString());
        System.out.println(employe1.equals(employe2));
        System.out.println(employe1.hashCode());
        System.out.println(employe2.hashCode());

        Commercial commercial = new Commercial("John", "Doe", "M4528", LocalDate.now(), 1680d, 550d);
        System.out.println(commercial.getPrimeAnnuelle());



        }
    }

