import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //declaracion de variable

        //String tamano;
        //int millaje, tanque, rendimiento;
        int type_car;

        Scanner input1 = new Scanner(System.in);

        Impuesto obj1;
        obj1 = new Impuesto();
        obj1.print_Opciones();

        type_car = input1.nextInt();
        obj1.Opciones(type_car);


    }
}