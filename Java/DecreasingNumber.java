package Java;

import java.util.Scanner;

public class DecreasingNumber {

    public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);

            System.out.println("Enter a ramdon number.");
            int num1 = scan.nextInt();
            System.out.println("Enter more random number.");
            int num2 = scan.nextInt();
            System.out.println("Enter the last random number.");
            int num3 = scan.nextInt();

            if ((num1 >= num2) && (num1 >= num3) && (num2 >= num3)) {
                System.out.println("the descending order is: " + num1 + " - " + num2 + " - " + num3);
            } else if ((num1 >= num2) && (num1 >= num3) && (num3 >= num2)) {
                System.out.println("the descending order is: " + num1 + " - " + num3 + " - " + num2);
            } else if ((num2 >= num1) && (num2 >= num3) && (num1 >= num3)) {
                System.out.println("the descending order is: " + num2 + " - " + num1 + " - " + num3);
            } else if ((num2 >= num1) && (num2 >= num3) && (num3 >= num1)) {
                System.out.println("the descending order is: " + num2 + " - " + num3 + " - " + num1);
            } else if ((num3 >= num1) && (num3 >= num2) && (num1 >= num2)) {
                System.out.println("the descending order is: " + num3 + " - " + num1 + " - " + num2);
            } else if ((num3 >= num1) && (num3 >= num2) && (num2 >= num1)) {
                System.out.println("the descending order is: " + num3 + " - " + num2 + " - " + num1);
            }
        }
    }



}
