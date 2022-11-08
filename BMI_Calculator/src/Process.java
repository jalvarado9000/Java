import java.util.ArrayList;
import java.util.Scanner;

public class Process {


    private double peso, pies, pulgadas;
    private double bodyMass;
    private String stats;
    private ArrayList <BMI> store = new ArrayList<BMI>();


    void ShowMenu() {
        Scanner input = new Scanner(System.in);
        int option;

        BMI obj2 = new BMI(220, 5, 8, 15.5, "bajo peso");
        store.add(obj2);

        do {
            System.out.println("Welcome to the bmi calculator");
            System.out.println("Press 1 to calculate");
            System.out.println("Press 2 to view results");
            System.out.println("Press 3 to exit");


            option = input.nextInt();


            switch(option){

                case 1:
                    assign1();


                    break;

                case 2:
                    viewBmi();

                    break;

                case 3:
                    option = 0;

                    break;
            }

        }while(option != 0);

    }


    void viewBmi() {

        int element;
        Scanner input = new Scanner(System.in);
        System.out.println("hey");
        for(int i = 0; i < store.size(); i++) {

            System.out.print("[");
            System.out.print(store.get(i).get_weight() + ", ");
            System.out.print(store.get(i).get_foot() + ", ");
            System.out.print(store.get(i).get_inches()+ ", ");
            System.out.print(store.get(i).get_bmi() + ", ");
            System.out.print(store.get(i).get_status());
            System.out.print("]");

            System.out.println("");
        }







    }





    //int getWeight() {return this.weight;}
    //int getFoot(int foot) {return this.foot;}
    //int getInches(int inches) {return this.inches;}


    public void assign1() {

        Scanner input = new Scanner(System.in);
        double weight,foot,inches;
        System.out.print("Cuanto usted pesa? (lbs) ");

        peso = input.nextDouble();


        System.out.print("cuanto usted mide? (ft)");

        pies = input.nextDouble();


        System.out.print("cuantas pulgadas? ");

        pulgadas = input.nextDouble();


        double kilos;
        kilos= peso * 0.453592;

        double metros = ((pies * 12) + pulgadas)*.0254;
        double bodyMass = kilos / Math.pow(metros,2.0);

        System.out.println("El bmi de usted es: " + bodyMass);

        String stats;

        if (bodyMass < 18.5 ) {

            stats = "bajos peso" ;
            //System.out.print("bajo peso");
        }

        else if (bodyMass >= 18.5 && bodyMass < 25) {
            stats = "normal";
            // System.out.print("normal");
        }

        else if (bodyMass >= 25 && bodyMass < 30) {
            stats = "sobre peso";
            //System.out.print("sobre peso");
        }

        else { System.out.println("obeso");
            stats = "obeso";
        }

        BMI obj1 = new BMI(peso, pies, pulgadas, bodyMass, stats );
        store.add(obj1);

    }








}
