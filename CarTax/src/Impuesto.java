public class Impuesto {

    public void print_Opciones(){

        System.out.println("Select type of car");
        System.out.println("1. Hatchback");
        System.out.println("2. Sedan");
        System.out.println("3. SUV");
        System.out.println("4. Convertible");
        System.out.println("5. Mini Van");
        System.out.println("6. Quit app");


    }

    public int Opciones(int op) {

        int quit = 0;
        do {


            switch (op) {

                case 1:
                    System.out.println("Eligio Hatchback");
                    break;

                case 2:
                    System.out.println("Eligio Sedan");
                    break;

                case 3:
                    System.out.println("Eligio SUV");
                    break;

                case 4:
                    System.out.println("Eligio convertible");
                    break;

                case 5:
                    System.out.println("Eligio Mini Van");
                    break;

                case 6:
                    quit = 6;
                    break;

                default:

                    System.out.println("Invalid choice.");

            }

        } while (quit == 6);
        //esta mal
        return quit;

    }

    public void print_Opciones1() {
        // TODO Auto-generated method stub

    }




}