package main;

import modell.TeglalapModell;
import nezet.FelugroNezet;
import nezet.GuiNezet;
import nezet.KonzolNezet;
import nezet.Nezet;
import vezerlo.Vezerlo;

public class MvcTeglalap {

    private TeglalapModell modell;
    
    public static void main(String[] args) {
        new MvcTeglalap().bemutatok();
    }

    public MvcTeglalap() {
        modell = new TeglalapModell(2, 3);
    }

    private void bemutatok() {
        
         /* A Nezet interface miatt már nem jó */
        //konzolBemutato();
        //felugroBemutato();
        //guiBemutato();
        
        /* ez használja az interface Nezet típust */
        kozosBemutato();
    }
    
    private void kozosBemutato() {
        /* ki kell választani a megfelelő nézetet: */
        //Nezet nezet = new KonzolNezet();
        //Nezet nezet = new FelugroNezet();
        GuiNezet nezet = new GuiNezet();
        nezet.setVisible(true);
        
        Vezerlo vezerlo = new Vezerlo(nezet, modell);
    }

    
    
}
