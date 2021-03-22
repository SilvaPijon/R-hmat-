import java.util.Scanner;

public class KüsimusedM extends Küsimused {
    public void küsiKüsimused(Isik isik) {
        super.küsiKüsimused(isik);
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("1)\tKui piim läheb maha, kuidas käitud:\n" +
                "a)\tPühin sokiga ära\n" +
                "b)\tÄkki kuivab ise ära\n" +
                "c)\tVõtan paberi ja pühin ära\n" +
                "d)\tKutsun naise koristama\n");
        String vastus = myObj.nextLine();
        võtaVastus(vastus, isik);
        System.out.println("2)\tKõik puhtad särgid on kapist otsa saanud\n" +
                "a)Võtan pesukorvist suvaliselt ühe, äkki ei haise\n" +
                "b) Olen ilma särgita siis\n" +
                "c) Panen pesu pesema\n" +
                "d) Pahandan naisega, et pesu on pesematta\n");
        vastus = myObj.nextLine();
        võtaVastus(vastus, isik);
    }

}
