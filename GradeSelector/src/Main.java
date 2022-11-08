import java.util.Scanner;

public class Main {
    public static void main(String[] args) {




        Scanner puntos = new Scanner(System.in);
        System.out.println("cual fue tu Nota?");

        String nota = puntos.nextLine();
        char notaChar = nota.charAt(0);





        switch(notaChar) {

            case 'A':
                System.out.println("4");
                break;
            case 'B':
                System.out.println("3");
                break;
            case 'C':
                System.out.println("2");
                break;
            case 'D':
                System.out.println("1");
                break;
            case 'F':
                System.out.println("0");
                break;

            default:
                System.out.println("end");

        }





    }

}