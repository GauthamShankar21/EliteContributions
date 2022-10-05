import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
   public static void main(String[] argv) throws Exception {
      ArrayList<String> obj = new ArrayList<String>();
      obj.add("A");
      obj.add("E");
      obj.add("I");
      obj.add("O");
      obj.add("U");
      Collections.shuffle(obj);
      System.out.println(obj);
   }   
}
