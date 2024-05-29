package nezet;

import java.util.Scanner;
import modell.EmberModell;
import main.Ember;

public class KonzolEmberNezet implements EmberNezet {

    private static final Scanner sc = new Scanner(System.in);
    private EmberModell model;

    public KonzolEmberNezet(EmberModell model) {
        this.model = model;
    }

    @Override
    public String getNev() {
        System.out.print("Név: ");
        return sc.nextLine();
    }

    @Override
    public String getKor() {
        System.out.print("Kor: ");
        return sc.nextLine();
    }

    @Override
    public void megjelenito(String info) {
        System.out.println(info);
    }
    
    @Override
    public String getSzuletesiEv() {
        System.out.print("Szuletesi ev: ");
        return sc.nextLine();
    }

    @Override
    public String getNem() {
        System.out.print("Nem: ");
        return sc.nextLine();
    }

    @Override
    public String getLakhely() {
        System.out.print("Lakhely: ");
        return sc.nextLine();
    }
}