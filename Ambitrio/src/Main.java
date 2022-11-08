import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int option, val;
        int selection;

        Scanner in = new Scanner(System.in);
        Process obj = new Process();

        obj.print_opciones();
        option = in.nextInt();

        selection = obj.opciones(option);

        if(selection == 1) {


            System.out.println("Cuanto cuesta su carro");
            val = in.nextInt();
            obj.set_Value(val);
            obj.distributor();


        }

        else if(selection == 2) {


            System.out.println("Cuanto cuesta su carro");
            val = in.nextInt();
            obj.set_Value(val);
            obj.private_owner();
        }







    }
}
