import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        double cDegree, fDegree;

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter Celcius Degree");
        cDegree = input.nextDouble();
        fDegree = 9/5*cDegree + cDegree;

        System.out.print("hello world");
        System.out.print("hello world");


        System.out.println((9.0/5)*cDegree+32);
        System.out.println(cDegree + " degree in celcius is " + fDegree + " degree Farenheit");



    }

}