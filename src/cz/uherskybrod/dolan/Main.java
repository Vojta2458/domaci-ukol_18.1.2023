package cz.uherskybrod.dolan;

public class Main {
    public static void main(String[] args) {
        Zapis zapis = new Zapis();
        try {
            zapis.vypisZeSouboru("Zakaznik.txt", ":");
        } catch (MyException e) {
            System.err.println("Musíte zvolit správný soubor. " + e.getLocalizedMessage());
        }
        for (Zakaznik zakaznik: zapis.getList()){
            System.out.println(zakaznik.getJmeno() + " " + zakaznik.getProdeje() );

        }
        zapis.pridej(new Zakaznik("Karel Novák", 68));
        zapis.pridej(new Zakaznik("Alfons Karel", 80));
        zapis.odeber(1);
        try {
            zapis.zmenSoubor("Zakaznik.txt", ":");
        } catch (MyException e) {
            System.err.println("Musíte zvolit správný soubor. " + e.getLocalizedMessage());
        }
    }
}

