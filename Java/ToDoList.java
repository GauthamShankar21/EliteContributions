package Java;

import java.util.Scanner;

public class ToDoList {

    public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);

            String[][][] toDo = new String[12][31][8];

            boolean exit = false;
            byte option;
            while (!exit) {
                System.out.println("Enter 1: add a new appointment!");
                System.out.println("Enter 2: verify appointment!");
                System.out.println("Enter 0: exit!");

                option = scan.nextByte();

                if (option == 1) { // add toDo
                    boolean monthValid = false;
                    int month = 0;
                    while (!monthValid) {
                        System.out.println("Enter to month: ");
                        month = scan.nextInt();
                        if (month > 0 && month <= 12) {
                            monthValid = true;
                        } else {
                            System.out.println("Month invalid, type it again!");
                        }
                    }

                    boolean dayValid = false;
                    int day = 0;
                    while (!dayValid) {
                        System.out.println("Enter to day: ");
                        day = scan.nextInt();
                        if (day > 0 && day <= 31) {
                            dayValid = true;
                        } else {
                            System.out.println("Day invalid, type it again!");
                        }
                    }

                    boolean hourValid = false;
                    int hour = 0;
                    while (!hourValid) {
                        System.out.println("Enter toDo hour: ");
                        hour = scan.nextInt();
                        if (hour >= 0 && hour <= 8) {
                            hourValid = true;
                        } else {
                            System.out.println("Hour invalid, type again!");
                        }
                    }
                    month--;
                    day--; // decrement 0 and start couting day 1 on the exact line
                    System.out.println("Enter toDo: ");
                    toDo[month][day][hour] = scan.next();

                } else if (option == 2) { // check toDo

                    boolean monthValid = false;
                    int month = 0;
                    while (!monthValid) {
                        System.out.println("Enter with month: ");
                        month = scan.nextInt();
                        if (month > 0 && month <= 12) {
                            monthValid = true;
                        } else {
                            System.out.println("Month invalid, type it again!");
                        }
                    }

                    boolean dayValid = false;
                    int day = 0;
                    while (!dayValid) {
                        System.out.println("Enter with day: ");
                        day = scan.nextInt();
                        if (day > 0 && day <= 31) {
                            dayValid = true;
                        } else {
                            System.out.println("Day invalid, type it again!");
                        }
                    }

                    boolean hourValid = false;
                    int hour = 0;
                    while (!hourValid) {
                        System.out.println("Enter hour toDo: ");
                        hour = scan.nextInt();
                        if (hour >= 0 && hour <= 24) {
                            hourValid = true;
                        } else {
                            System.out.println("Hour invalid, type it again!");
                        }
                    }

                    month--;
                    day--;
                    System.out.println("The toDo schedule is: ");
                    System.out.println(toDo[month][day][hour]);
                } else if (option == 0) {
                    exit = true;

                } else {
                    System.out.println("Option invalid, type it again.");
                }
            }
        }
    }
}
