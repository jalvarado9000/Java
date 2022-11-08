import java.util.ArrayList;
import java.util.Scanner;

public class Test  {

    private int language;

    private ArrayList<Information> userList = new ArrayList<Information>();
    private Accumulate obj = new Accumulate();
    private Converter con = new Converter();
    private Hidden hide = new Hidden();

    void setLanguage(int num){language = num;}
    int getLenguage(){return language;}


    public void DefaultUsers(){

        Information obj1 = new Information("Melissa", 1000.2,1234,10,20,30,40);
        Information obj2 = new Information("Ashley", 500.3,1244,50,60,70,80);
        Information obj3 = new Information("Jaileen", 200.9,1254,100,90,80,70);



        userList.add(obj1);
        userList.add(obj2);
        userList.add(obj3);

    }

    public void showMenu() {

        Scanner input = new Scanner(System.in);

        String entered = " ";
        char option = ' ';


        do{
            DefaultUsers();

            String str_start = Name();
            int num =1;
            //Si cambias el valor de num = 0 t tira pal menu del tecnico, no nos salio ponerlo :'(
            if(num == 0)
                hide.secretMenu();

            else
                create(str_start);
            entered = Continue();

            entered = input.nextLine();
            option = entered.charAt(0);

        }while(option == 'Y' || option == 'y');


    }




    public void create(String str_start) {

        String option_string;
        char option_char;
        int option_int;
        double rate,new_money;
        boolean bool = false;
        Scanner input = new Scanner(System.in);


        double i_d = 0;



        con.exchange_Currency(language);



        double Dmoney_exchange = con.getDollar();
        double Rmoney_exchange = con.getRupee();
        double Pmoney_exchange = con.getPound();
        double Emoney_exchange = con.getEuro();
        double Ymoney_exchange = con.getYen();

        aver(str_start, Dmoney_exchange, i_d, Rmoney_exchange, Pmoney_exchange, Ymoney_exchange, Emoney_exchange);



        obj.ACCsetEuro(Emoney_exchange);
        obj.ACCsetDollar(Dmoney_exchange);
        obj.ACCsetRupee(Rmoney_exchange);
        obj.ACCsetPound(Pmoney_exchange);
        obj.ACCsetYen(Ymoney_exchange);

        receipt();


    }


    public void aver(String str_start, double Dmoney_exchange, double i_d, double Rmoney_exchange, double Pmoney_exchange, double Emoney_exchange, double Ymoney_exchange){


        Information obj1 = new Information(str_start, Dmoney_exchange, i_d, Rmoney_exchange, Pmoney_exchange, Emoney_exchange, Ymoney_exchange);
        userList.add(obj1);

    }


    public double randomGenerator(){

        int i = 0;
        double i_d = i++;
        return i_d;
    }



    public String Name(){
        Scanner input = new Scanner(System.in);
        String name;
        System.out.println("what is your name");
        name = input.nextLine();
        return name;
    }


    public String Continue(){
        Scanner input = new Scanner(System.in);
        String op;
        System.out.println("Do you wish to do another transaction (Y/N) or (y/n)" );
        op = input.nextLine();
        return op;
    }



    public void receipt() {

        Scanner input = new Scanner(System.in);
        int position = 0;
        //Converter con = new Converter();

        System.out.println("*//////////////////////////////////////////////////////////////////////////////////////////////");

        for(int i = (userList.size()-1); i < userList.size(); i++) {
            position = i;
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





























