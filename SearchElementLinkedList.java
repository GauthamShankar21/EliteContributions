import java.util.LinkedList;

public class Main {
   public static void main(String[] args) {
      LinkedList<String> lList = new LinkedList<String>();
      lList.add("1");
      lList.add("2");
      lList.add("3");
      lList.add("4");
      lList.add("5");
      lList.add("2");
      
      System.out.println("First index of 2 is:"+
      lList.indexOf("2"));
      
      System.out.println("Last index of 2 is:"+ 
      lList.lastIndexOf("2"));
   }
}
