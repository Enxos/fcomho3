package nezet;

import javax.swing.JOptionPane;

public class FelugroNezet implements Nezet{
    
    @Override
    public String getA(){
        return JOptionPane.showInputDialog("\'A\': ");
    }
    
    @Override
    public String getB(){
        return JOptionPane.showInputDialog("\'B\': ");
    }
    
    @Override
    public void megjelenito(String info){
        JOptionPane.showMessageDialog(null, info);
    }
}
