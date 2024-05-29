package main;

public class Ember {
    private String nev;
    private int szuletesiEv;
    private String nem;
    private String lakhely;

    public Ember(String nev, int szuletesiEv, String nem, String lakhely) {
        this.nev = nev;
        this.szuletesiEv = szuletesiEv;
        this.nem = nem;
        this.lakhely = lakhely;
    }

    public void bemutatkozas() {
        int kor = java.time.Year.now().getValue() - this.szuletesiEv;
        System.out.println("Szia, a nevem " + this.nev + ", " + this.nem + " vagyok, és " + kor + " éves vagyok. Lakóhelyem: " + this.lakhely + ".");
    }
}