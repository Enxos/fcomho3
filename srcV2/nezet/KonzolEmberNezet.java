package nezet;

import modell.EmberModell;

public class KonzolEmberNezet {
    // private EmberModell ember;

    public KonzolEmberNezet() {
        // ember = new EmberModell("Dan", 1988, "Ferfi", "Budapest");

        ember.setNev("Dan");
        ember.setSzuletesiEv(1988);
        ember.setNem("Ferfi");
        ember.setLakhely("Budapest");
        System.out.println(ember.getNev());
    }
}
