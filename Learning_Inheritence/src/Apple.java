import java.util.Scanner;


public class Apple extends Phones {

    //public String n = "helooooo";

    public Apple(String ra) {
        super(ra);
    }

    @Override
    public void features(){
        Scanner input = new Scanner(System.in);
        String ra;
        ra = input.nextLine();

        System.out.println("what is your name");
        ra = input.nextLine();

        System.out.println("the phone does not " + head);
        System.out.println("the phone " + screen);
    }



}
