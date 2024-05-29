package main;

import nezet.KonzolEmberNezet;
import modell.EmberModell;

public class Ember {
    public static void main(String[] args) {
        new KonzolEmberNezet();
        // System.out.println("Hello, Ember!");
    }
    public void bemutatkozas() {
        System.out.println("Hello, nevem " + this.nev + ", eletkorom " + this.eletkor + " ev.");
    }
    public void bemutatok() {
        konzol();
    }

    private void konzol() {
        // System.out.println("Hello, konzol!");
        KonzolEmberNezet nezet = new KonzolEmberNezet();
        EmberModell modell = new EmberModell("Dan", 1988, "Ferfi", "Budapest");
        
    }

}

