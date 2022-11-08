public class Process {

    //initialization of variable
    private double value;

    //setter
    public void set_Value(double v){

        value = v;

    }

    //getter
    public double get_Value() {

        return value;

    }

    //print option menu
    public void print_opciones(){

        System.out.println("Are you a distributor");
        System.out.println("or");
        System.out.println("Are your a private owner");
        System.out.println("Select 1 for distributor");
        System.out.println("Select 2 for private owner");

    }

    //inputs option
    public int opciones(int op){


        int select = 0;

        switch (op) {

            case 1:
                System.out.println("You are a distributor");
                select = 1;
                break;


            case 2:
                System.out.println("You ara a private owner");
                select = 2;
                break;


            case 3:
                System.out.println("Invalid option");
                break;


        }

        return select;


    }



    //decision to make if your a Distributor
    public void distributor()
    {
        if(value <= 20000 ) {
            double tax = value*0.08;
            System.out.println("Your tax is: $" + (tax));
        }

        else if (value > 20000) {
            double excess = value - 20000;
            double tax = excess*0.18;
            double total_tax = tax + 1599;
            System.out.println("Your tax is: $" + (total_tax));


        }

        else
            System.out.print("Invalid option");
    }



    //decision to makes if your a private owner
    public void private_owner() {
        if(value <= 20000 ) {
            double tax = value*0.10;
            System.out.println("Your tax is: $" + (tax));

        }

        else if (value > 20000) {
            double excess = value - 20000;
            double tax = excess*.20;
            double total_tax = tax + 2000;
            System.out.println("Your tax is: $" + (total_tax));


        }

        else
            System.out.print("Invalid option");
    }

}