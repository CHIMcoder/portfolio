/*Jamarian Cleveland*/
package language.Classes;

import java.util.Scanner;

public class HW3 {


    public static void main(String[] args) {
        Rectangle a = new Rectangle();
        Scanner scan = new Scanner(System.in);
        int value = 7;

        while (value != 0) {
            System.out.println("Please choose an option");
            System.out.println("1 -to set the length \n" +
                    "2 -to set the width\n" +
                    "3 -to get the length\n" +
                    "4 -to get the width\n" +
                    "5 -to get the perimeter\n" +
                    "6 -to get the area\n" +
                    "0 -to quit\n");
            value = scan.nextInt();


            if (value == 1) {
                System.out.println("What is the length?");
                int length = scan.nextInt();
                a.setLength(length);

            }
            if (value == 2) {
                System.out.println("What is the width?");
                int width = scan.nextInt();
                a.setWidth(width);
            }
            if (value == 3) {
                System.out.println("Rectangle length is: " + a.getLength());
            }
            if (value == 4) {
                System.out.println("Rectangle width is: " + a.getWidth());
            }
            if (value == 5) {
                System.out.println("Rectangle perimeter is: ");
                System.out.println(a.getPerimeter(1));

            }
            if (value == 6) {
                System.out.println("Rectangle area is: ");
                System.out.println(a.getArea(1));
            }


        }
    }
}

