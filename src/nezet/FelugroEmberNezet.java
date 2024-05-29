package nezet;

import javax.swing.JOptionPane;
import modell.EmberModell;

public class FelugroEmberNezet implements EmberNezet {
    
    private EmberModell model;

    public FelugroEmberNezet(EmberModell model) {
        this.model = model;
    }

    @Override
    public String getNev() {
        return JOptionPane.showInputDialog("Név: ");
    }

    @Override
    public String getSzuletesiEv() {
        return JOptionPane.showInputDialog("Születési év: ");
    }

    @Override
    public String getNem() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getNem'");
    }

    @Override
    public String getKor() {
        return JOptionPane.showInputDialog("Kor: ");
    }

    @Override
    public String getLakhely() {
        return JOptionPane.showInputDialog("Lakhely: ");
    }

    @Override
    public void megjelenito(String info) {
        JOptionPane.showMessageDialog(null, info);
    }
}