//Jamarian Cleveland
package Homework.Problem3;

public class Problem3 {

    public static void main(String[] args) {
        int sumValue = sum(5,1);
        int sumValueTwo = sum(5,1,1);
        int sumValueThree = sum(5,1,1,1);
        System.out.println('"' +"sum of two arguments is " + sumValue + '"');
        System.out.println('"' +"sum of three arguments is " + sumValueTwo + '"');
        System.out.println('"' +"sum of four arguments is " + sumValueThree + '"');


    }
    public static int sum(int a,int b){
        return a + b;
    }
    public static int sum (int a, int b, int c){
        return a + b + c;
    }
    public static int sum(int a , int b, int c, int d){
        return a + b + c + d;
    }
}
