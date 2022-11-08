import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // TODO code application logic here





        Scanner input = new Scanner(System.in);
        String ra = input.nextLine();

        Phones obj = new Apple(ra);
        Apple occ = new Apple(ra);
        Android obb = new Android(ra);

        obj.features();
        System.out.println("im out of Phones Class");


        occ.features();
        System.out.println("im out of Apple Class");


        obb.features();
        System.out.println("im out of Android Class");

        obj.features();
        System.out.println("im out of Phones Class");


        occ.features();
        System.out.println("im out of Apple Class");


        obb.features();
        System.out.println("im out of Android Class");










    }

}
