package modell;

public class TeglalapModell {
    private int a, b;

    public TeglalapModell(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "TeglalapModell{" + "a=" + a + ", b=" + b + '}';
    }
    
    public int terulet(){
        return a*b;
    }
}
