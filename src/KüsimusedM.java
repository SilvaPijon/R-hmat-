import java.util.Scanner;

public class KüsimusedM extends Küsimused {
    public void küsiKüsimused(Isik isik) {
        super.küsiKüsimused(isik);
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("1)\tKui piim läheb maha, kuidas käitud:\n" +
                "a)\tPühin sokiga ära\n" +
                "b)\tÄkki kuivab ise ära\n" +
                "c)\tKutsun naise koristama\n" +
                "d)\tVõtan paberi ja pühin ära\n");
        String vastus = myObj.nextLine();
        võtaVastus(vastus, isik);
        System.out.println("2)\tKõik puhtad särgid on kapist otsa saanud\n" +
                "a) Panen pesu pesema \n" +
                "b) Olen ilma särgita siis\n" +
                "c) Pahandan naisega, et pesu on pesematta\n" +
                "d) Võtan pesukorvist suvaliselt ühe, äkki ei haise\n");
        vastus = myObj.nextLine();
        võtaVastus(vastus, isik);
    }

}
