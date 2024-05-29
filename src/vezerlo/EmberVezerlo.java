package vezerlo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import modell.EmberModell;
import nezet.GuiNezet;
import nezet.EmberNezet;

public class EmberVezerlo {
    private EmberNezet nezet;
    private EmberModell modell;
    
    public EmberVezerlo(EmberNezet nezet, EmberModell modell) {
        this.nezet = nezet;
        this.modell = modell;
        
        nezet.megjelenito(modell.toString());

        if(nezet instanceof GuiNezet){
            JButton btn = ((GuiNezet)nezet).getBtnMegjelenit();
            btn.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String nev = nezet.getNev();
                    int szuletesiEv = Integer.parseInt(nezet.getSzuletesiEv());
                    String nem = nezet.getNem();
                    String lakhely = nezet.getLakhely();
                    modell.setNev(nev);
                    modell.setSzuletesiEv(szuletesiEv);
                    modell.setNem(nem);
                    modell.setLakhely(lakhely);
                    String info = modell.toString();
                }
            });
        }
    }
}