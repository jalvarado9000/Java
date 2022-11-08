import java.util.Scanner;


public class Main {


    static double min(double x, double y) {

        if (x < y) {

            return x;

        } else {
            return y;
        }

    }

    static double min(double x, double y, double z) {


        return min(min(x, y), z);

    }

    public static void main(String[] args) {

        double num1, num2, num3, result, result2;

        Scanner number = new Scanner(System.in);

        System.out.println("input the first number");
        num1 = number.nextDouble();

        System.out.println("input the second number");
        num2 = number.nextInt();

        System.out.println("input the third number");
        num3 = number.nextDouble();

        result = min(num1, num2);
        result2 = min(num1, num2, num3);

        System.out.println(result);
        System.out.println(result2);


    }
}
