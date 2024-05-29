package modell;

// import java.time.Year;

public class EmberModell {
    private String nev;
    private int szuletesiEv;
    private String nem;
    private String lakhely;
    
    public EmberModell(String nev, int szuletesiEv, String nem, String lakhely) {
        this.nev = nev;
        this.szuletesiEv = szuletesiEv;
        this.nem = nem;
        this.lakhely = lakhely;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public int getSzuletesiEv() {
        return szuletesiEv;
    }

    public void setSzuletesiEv(int szuletesiEv) {
        this.szuletesiEv = szuletesiEv;
    }

    public String getNem() {
        return nem;
    }

    public void setNem(String nem) {
        this.nem = nem;
    }

    public String getLakhely() {
        return lakhely;
    }

    public void setLakhely(String lakhely) {
        this.lakhely = lakhely;
    }

    @Override
    public String toString() {
        return "EmberModell{" +
                "nev='" + nev + '\'' +
                ", szuletesiEv=" + szuletesiEv +
                ", nem='" + nem + '\'' +
                ", lakhely='" + lakhely + '\'' +
                '}';
    }

    public int eletkor() {
        return java.time.Year.now().getValue() - szuletesiEv;
    }
}