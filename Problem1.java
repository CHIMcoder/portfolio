//Jamarian Cleveland
package Homework.Problem1;

import java.util.Scanner;

public class Problem1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int year = 0;


        while(year != -99) {
            System.out.println("Enter leap year (enter -99 to quit): ");
            year = scan.nextInt();
            if (year % 4 == 0 && year % 400 == 0) {
                System.out.println("Leap year");
            }
            else if (year % 4 == 0 && year % 100 != 0) {
                System.out.println("Leap year");
            }
            else if (year == -99) {
                System.out.println("");


            }
            else {
                System.out.println("Not a leap year");
            }


        }

    }

}
