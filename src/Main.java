public class Main {

    public static void main(String[] args) {
        Isik isik = new Isik();
        Küsimused küsimused;
        Arvutaja arvutaja = new Arvutaja();

        if (isik.getSugu().equalsIgnoreCase("M")) {
            küsimused = new KüsimusedM();
        } else {
            küsimused = new KüsimusedN();
        }
        küsimused.küsiKüsimused(isik);
        System.out.println(isik);
        int[] protsendid = arvutaja.protsent(isik);
        Isiksus stabiilne = new Stabiilne();
        stabiilne.teavitaKasutajat(protsendid[0]);
        Isiksus analüüsiv = new Analüüsiv();
        analüüsiv.teavitaKasutajat(protsendid[1]);
        Isiksus domineeriv = new Domineeriv();
        domineeriv.teavitaKasutajat(protsendid[2]);
        Isiksus sotsiaalne = new Sotsiaalne();
        sotsiaalne.teavitaKasutajat(protsendid[3]);
        PäevaMõttetera.mõtteteraLeidija();



    }

}
