package cz.uherskybrod.dolan;

import java.io.IOException;
public class Zakaznik {

    private String jmeno;
    private int prodeje;

    public Zakaznik(String jmeno, int prodeje) {
        this.jmeno = jmeno;
        this.prodeje = prodeje;
    }

    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public int getProdeje() {
        return prodeje;
    }

    public void setProdeje(int prodeje) {
        this.prodeje = prodeje;
    }

    public void zvysPocetProdeju(int pocet){
        try{
            if (pocet <= 0){
                throw new IOException();
            }else {
                prodeje =+ pocet;
            }
        }catch (IOException e){
            System.err.println("Nelze zvětšit počet prodejů o zápornou hodnotu!");
        }
    }
}
