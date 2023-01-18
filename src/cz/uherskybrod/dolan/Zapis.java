package cz.uherskybrod.dolan;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zapis {

    private List<Zakaznik> zakaznikList = new ArrayList<>();

    public void prectiSoubor(String soubor, String oddelovac){
        try (Scanner scanner = new Scanner(new BufferedReader(new FileReader(soubor)))) {
            while (scanner.hasNextLine()) {
                String dalsiRadek = scanner.nextLine();
                String [] polozka = dalsiRadek.split(oddelovac);
                String jmeno = polozka[0].trim();
                int prodeje = Integer.parseInt(polozka[1].trim());

                zakaznikList.add(new Zakaznik(jmeno, prodeje));
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    public void zmenSoubor(String soubor, String oddelovac){
        try (PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(soubor)))) {
            String radek;
            for (Zakaznik zakaznik: zakaznikList) {
                radek = zakaznik.getJmeno()+oddelovac+zakaznik.getProdeje();
                writer.println(radek);
            }
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void pridej(Zakaznik novyZakaznik) {
        zakaznikList.add(novyZakaznik);
    }
    public void odeber(int index) {
        zakaznikList.remove(index);
    }

    public List<Zakaznik> getList() {
        return new ArrayList<>(zakaznikList);
    }
}
