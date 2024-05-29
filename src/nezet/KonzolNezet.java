package nezet;

import java.util.Scanner;

public class KonzolNezet implements Nezet{

   private static final Scanner sc = new Scanner(System.in);

   @Override
    public String getA(){
        System.out.print("\'A\': ");
        return sc.nextLine();
    }
    
   @Override
    public String getB(){
        System.out.print("\'B\': ");
        return sc.nextLine();
    }
    
   @Override
    public void megjelenito(String info){
        System.out.println(info);
    }
    
}
