import java.util.ArrayList;
import java.util.Scanner;

public class Arreglo {


    private double peso, pies, pulgadas;
    private double bodyMass;
    private String stats;
    private ArrayList<List> store = new ArrayList<List>();


    void ShowMenu() {
        Scanner input = new Scanner(System.in);
        int option;


        char option1 = ' ';
        String op = " ";

        do{
            assign1();
            System.out.println("Calculate another BMI?");
            op = input.nextLine();
            option1 = op.charAt(0);


        }while(option1 == 'Y' || option1 == 'y');



        viewBmi();


    }

    void viewBmi() {

        int element;
        Scanner input = new Scanner(System.in);

        for(int i = 0; i < store.size(); i++) {


            System.out.print(store.get(i).peso() + ", ");
            System.out.print(store.get(i).pie() + ", ");
            System.out.print(store.get(i).pulgada()+ ", ");
            System.out.print(store.get(i).bmi() + ", ");
            System.out.print(store.get(i).status());


            System.out.println("");
        }







    }


    public void assign1() {

        Scanner input = new Scanner(System.in);
        double weight,foot,inches;
        System.out.print("how much do you weight? (lbs) ");

        peso = input.nextDouble();


        System.out.print("how many feet? (ft)");

        pies = input.nextDouble();


        System.out.print("how many inches? ");

        pulgadas = input.nextDouble();


        double kilos;
        kilos= peso * 0.453592;

        double metros = ((pies * 12) + pulgadas)*.0254;
        double bodyMass = kilos / Math.pow(metros,2.0);

        System.out.println("Your bmi is: " + bodyMass);

        String stats;

        if (bodyMass < 18.5 ) {

            stats = "under weight" ;
            //System.out.print("bajo peso");
        }

        else if (bodyMass >= 18.5 && bodyMass < 25) {
            stats = "normal";
            // System.out.print("normal");
        }

        else if (bodyMass >= 25 && bodyMass < 30) {
            stats = "over weight";
            //System.out.print("sobre peso");
        }

        else { System.out.println("obeso");
            stats = "obese";
        }

        List obj1 = new List(peso, pies, pulgadas, bodyMass, stats );
        store.add(obj1);

    }








}