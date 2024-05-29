package vezerlo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import modell.TeglalapModell;
import nezet.GuiNezet;
import nezet.Nezet;

public class Vezerlo {
    private Nezet nezet;
    private TeglalapModell modell;
    
    public Vezerlo(Nezet nezet, TeglalapModell modell) {
        this.nezet = nezet;
        this.modell = modell;
        
        nezet.megjelenito(modell.toString());

        if(nezet instanceof GuiNezet){
            JButton btn = ((GuiNezet)nezet).getBtnMegjelenit();
            btn.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    int a = Integer.parseInt(nezet.getA());
                    int b = Integer.parseInt(nezet.getB());
                    modell.setA(a);
                    modell.setB(b);
                    String info = modell.toString();
                    info += " T: " + modell.terulet();
                    nezet.megjelenito(info);
                }
            });
        }else{
            int a = Integer.parseInt(nezet.getA());
            int b = Integer.parseInt(nezet.getB());
            modell.setA(a);
            modell.setB(b);
            String info = modell.toString();
            info += " T: " + modell.terulet();
            nezet.megjelenito(info);
        }
    }
    
    
}
