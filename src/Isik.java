import java.util.Scanner;

public class Isik {
    public String nimi;
    public String sugu;


    public int a;
    public int b;
    public int c;
    public int d;

    public Isik() {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Palun sisesta enda nimi");
        this.nimi = myObj.nextLine();
        while (true) {

            System.out.println("Palun sisesta enda sugu(M/N)");
            this.sugu = myObj.nextLine();
            if ("m".equalsIgnoreCase(this.sugu) || "n".equalsIgnoreCase(this.sugu)){
                break;
            }
            System.out.println("Midagi läks valesti");
        }

        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.d = 0;
    }

    public String getNimi() {
        return nimi;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public String getSugu() {
        return sugu;
    }

    public void setSugu(String sugu) {
        this.sugu = sugu;
    }


    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }

    public void suurendaA(){
        a++;
    }
    public void suurendaB(){
        b++;
    }
    public void suurendaC(){
        c++;
    }

    @Override
    public String toString() {
        return "Isik{" +
                "nimi='" + nimi + '\'' +
                ", sugu='" + sugu + '\'' +
                ", a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", d=" + d +
                '}';
    }

    public void suurendaD(){
        d++;
    }


}
