import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int x;

        Scanner Nota = new Scanner(System.in);

        System.out.println("Cual es la nota que saco");

        x = Nota.nextInt();

        if(x >= 90) {

            char grade = 'A';
            System.out.println(grade);

        }


        else if(x >= 80) {

            char grade = 'B';
            System.out.println(grade);

        }



        else if(x >= 70) {

            char grade = 'C';
            System.out.println(grade);
        }


        else if(x >= 60) {

            char grade = 'D';
            System.out.println(grade);

        }

        else {

            char grade = 'F';
            System.out.println(grade);

        }










    }

}
