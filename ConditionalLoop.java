import java.util.Scanner;

public class ConditionalLoop {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        
        if(n < 0 ){
            System.out.println("Number not exist");
        }else if ( n > 100){
            System.out.println("number is out of bound");
        }else{
            System.out.println("you are on the next step");
        }
    }
    
}
