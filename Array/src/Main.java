import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // TODO Auto-generated method stub


        Scanner input = new Scanner(System.in);

        int num = 3;
        int[] arr = new int[num];
        int pay;
        int payrate;

        for(int i = 0; i < arr.length; i++) {

            System.out.println("enter the hours worked by employee " + (i+1));
            arr[i] = input.nextInt();


        }

        System.out.println("Enter the hourly pay rate of employee");
        pay = input.nextInt();

        for(int i = 0; i < arr.length; i++) {

            payrate = arr[i] * pay;
            System.out.println("the the pay in this week for employee " + (i+1) + "is: " + payrate);



        }









    }

}
