import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String name;
        int hours;
        double payrate, pay;

        Scanner user = new Scanner(System.in);

        System.out.println("What is your name?");
        name = user.nextLine();

        System.out.println("how many hours do your work?");
        hours = user.nextInt();

        System.out.println("what is your payrate?");
        payrate = user.nextDouble();

        pay = hours*payrate;

        System.out.println("Your pay is: " + pay);


    }

}
