import java.util.ArrayList;
import java.util.Scanner;

public class Spanish extends Test{


    private String first_name;
    private double new_deposit;
    private int SSN;
    private ArrayList<Information> userList = new ArrayList<Information>();
    private Accumulate obj = new Accumulate();
    private Converter con = new Converter();
    //private Hidden hide = new Hidden();

    Spanish(){

    }

    @Override
    public double randomGenerator(){
        double i_d = Math.random();
        return i_d;
    }


    @Override
    public String Name(){
        Scanner input = new Scanner(System.in);
        String name;
        System.out.println("Cual es su nombre");
        name = input.nextLine();
        return name;
    }


    public String Continue(){
        Scanner input = new Scanner(System.in);
        String op;
        System.out.println("Desea hacer otra transaccion?(si o no)/(y/n)");
        op = input.nextLine();
        return op;
    }


    public void aver(String str_start, double Dmoney_exchange, double i_d, double Rmoney_exchange, double Pmoney_exchange, double Emoney_exchange, double Ymoney_exchange){
        Information obj2 = new Information(str_start, Dmoney_exchange, i_d, Rmoney_exchange, Pmoney_exchange, Ymoney_exchange, Emoney_exchange);
        userList.add(obj2);


    }


    @Override
    public void receipt() {

        Scanner input = new Scanner(System.in);
        int position = 0;
        //Converter con = new Converter();

        System.out.println("*//////////////////////////////////////////////////////////////////////////////////////////////");

        for(int i = 0; i < userList.size(); i++) {
            position = i;



            System.out.println("RECIBO");
            System.out.println("Nombre del usuario: " + userList.get(position).getName());
            System.out.println("El dinero depositado fue: " + userList.get(position).get_moneyIn());

            System.out.println("La cantidad de rupees depositada fue: "
                    + userList.get(position).getUser_rupee());
            System.out.println("al " + con.RupeeRate + " de interes");

            System.out.println("La cantidad de pounds depositada fue: "
                    + userList.get(position).getUser_pound());
            System.out.println("al " + con.PoundRate + " de interes");


            System.out.println("La cantidad de yen depositada fue: "
                    + userList.get(position).getUser_yen());
            System.out.println("al " + con.YenRate + " de interes");

            System.out.println("La cantidad de euro depositada fue:"
                    + userList.get(position).getUser_euro());
            System.out.println("al " + con.EuroRate + " de interes");

            System.out.println("Cualquier duda sientase libre a llamar al"
                    + " (787)852-8786");
            System.out.println("Para alguna queja use su id "
                    + userList.get(position).get_IdentificationNumber()+ " to veiw your case");


            //System.out.println("/////////////////////////////////////////////////////////////////////");
            System.out.println("/////////////////////////////////////////////////////////////////////*");

        }



    }




    public void findUser(){


        Scanner input = new Scanner(System.in);

        System.out.println("enter the id");
        int secret = input.nextInt();
        int position = 0;


        for(int i = 0; i< userList.size(); i++) {

            position =i;
            if(userList.get(i).get_IdentificationNumber() == secret){
                System.out.println("RECEIPT");
                System.out.println("Account User name: " + userList.get(position).getName());
                System.out.println("Your money in is: " + userList.get(position).get_moneyIn());

                System.out.println("the amout of ruppes you invested where"
                        + userList.get(position).getUser_rupee());
                System.out.println("at a " + con.RupeeRate + " rate");

                System.out.println("the amout of pounds you invested where"
                        + userList.get(position).getUser_pound());
                System.out.println("at a " + con.PoundRate + " rate");


                System.out.println("the amout of yen you invested where"
                        + userList.get(position).getUser_yen());
                System.out.println("at a " + con.YenRate + " rate");

                System.out.println("the amout of euro you invested where"
                        + userList.get(position).getUser_euro());
                System.out.println("at a " + con.EuroRate + " rate");

                System.out.println("For any question feel free to dial"
                        + "(787)852-8786");
                System.out.println("For a complaint please use your id "
                        + userList.get(position).get_IdentificationNumber()+ " to veiw your case");


                //System.out.println("/////////////////////////////////////////////////////////////////////");
                System.out.println("/////////////////////////////////////////////////////////////////////*");

            }
        }
    }





}
