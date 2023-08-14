package Java;

import java.util.Scanner;

public class CheckPrice {

        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);

            System.out.println("Enter the value of a product you want to buy: ");
            double price01 = scan.nextDouble();
            System.out.println("Enter the value of another product you want to buy: ");
            double price02 = scan.nextDouble();
            System.out.println("Enter the value of the last product you want to buy: ");
            double price03 = scan.nextDouble();

            if ((price01 < price02) && (price01 < price03)) {
                System.out.println("The first product is cheaper:  " + price01);
            } else if ((price02 < price01) && (price02 < price03)) {
                System.out.println("The second product is cheaper:  " + price02);
            } else if ((price03 < price01) && (price03 < price02)) {
                System.out.println("The third product is cheaper:  " + price03);
            }
        }
}
