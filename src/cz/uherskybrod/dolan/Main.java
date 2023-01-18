package cz.uherskybrod.dolan;

public class Main {
    public static void main(String[] args) {
        Zapis zapis = new Zapis();
        zapis.prectiSoubor("Zakaznici.txt", ":");
        for (Zakaznik zakaznik : zapis.getList()) {
            System.out.println(zakaznik.getJmeno()+zakaznik.getProdeje());
        }
        zapis.pridej(new Zakaznik( "Karel Dvořák", 45));
        zapis.odeber(0);
        zapis.zmenSoubor("Zakaznici.txt", ":");
    }
}
