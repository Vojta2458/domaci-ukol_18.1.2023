package cz.uherskybrod.dolan;

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
}
