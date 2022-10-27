package Java;

import java.util.Scanner;


public class ValidAutenticationSimple {

        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);

            boolean passValid = false;
            String name;
            String pass;

            do {
                System.out.println("Inform your name: ");
                name = scan.next();

                System.out.println("Informe your pass: ");
                pass = scan.next();

                if (name.equalsIgnoreCase(pass)) {
                    System.out.println("Invalid pass, type it again!");
                } else {
                    passValid = true;
                    System.out.println("Valid Information!");
                }
            } while (!passValid);
        }
    }
