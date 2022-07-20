//Jamarian Cleveland
package Homework.Problem2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Problem2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number of subjects: ");
        int count = scan.nextInt();
        int totalMark = 0;
        int gradeValue = 0;


        System.out.println("Enter Mark of " + count + " subject(s): ");
        //The maximum value one can enter for grades is 100.



        for(int i = 1; i <= count;i++) {

            int mark = scan.nextInt();
            gradeValue = mark;
            totalMark += mark;
        }

        if (gradeValue <= 100) {
            double countValue = count * 100;



            System.out.println("Total Marks: "  + totalMark);
            double percentage = (totalMark/countValue) * 100;
            DecimalFormat df = new DecimalFormat("");
            System.out.println("Student Percentage: " + df.format(percentage));

            if(percentage >= 90) {
                char grade = 'A';
                switch(grade) {
                    case 'A':

                        System.out.println("Student Grade:" + grade );
                        break;
                }

            }
            else if (percentage >= 80 && percentage <= 89.99) {
                char grade = 'B';
                switch(grade) {
                    case 'B':
                        System.out.println("Student Grade:" + grade );
                        break;
                }
            }
            else if (percentage >= 70 && percentage <= 79.99) {
                char grade = 'C';
                switch(grade) {
                    case 'C':
                        System.out.println("Student Grade:" + grade);
                        break;
                }

            }
            else if (percentage >= 60 && percentage <= 69.99) {
                char grade = 'D';
                switch(grade) {
                    case 'D':
                        System.out.println("Student Grade:" + grade );
                        break;
                }
            }

            else {
                char grade = 'F';
                switch(grade){
                    case 'F':
                        System.out.println("Student Grade:" + grade);
                        break;

                }
            }

        }
        else if(gradeValue > 100) {
            System.out.println("Maximum marks for a subject is 100.");
        }

    }

}


