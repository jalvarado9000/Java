import java.util.ArrayList;
import java.util.Scanner;

public class Test {

    private String first_name;
    private double new_deposit;
    private int SSN;
    private ArrayList<Information> userList = new ArrayList<Information>();


    void showMenu() {

        //int op1;
        Information obj1 = new Information("Melissa", 1000.2, 1.7,1234,'M',"*****",'a');
        Information obj2 = new Information("Ashley", 500.3, .7,1244, 'A',"****",'y');
        Information obj3 = new Information("Jaileen", 200.9, 2.1,1254,'J',"*****",'n');


        userList.add(obj1);
        userList.add(obj2);
        userList.add(obj3);

        System.out.println("tu vas a depositar dinero y te lo voy"
                + " a quitar y devolver con cierto rate menos");

        create();

    }


    public void create() {

        String name, option_string;
        char option_char;
        int option_int;
        double rate_choosen = 0,new_money;
        boolean bool = false;
        Scanner input = new Scanner(System.in);

        System.out.println("what is your name");
        name = input.nextLine();



        String str_start = name;
        String str_end = str_start;
        int length = str_start.length();

        String b = "*";
        String c = " ";

        for(int i = 0; i <(length-2); i++)
            c +=b;

        char a = str_start.charAt(0);
        char d = str_end.charAt((length-1));
        System.out.println(a+c+d);

        do {
            System.out.println("Please deposit amount to be exchanged");
            new_money = input.nextDouble();


            if(new_money <= 0) {
                System.out.println("Your have not deposited a correct amount of money");
                bool = false;
            }
            else {bool = true;}
        }while(bool !=true);

        do {
            System.out.println("what is the currency?");
            System.out.println("for Yen press (1)");
            System.out.println("for Yen press (2)");
            System.out.println("for Yen press (3)");

            option_int = input.nextInt();

            switch(option_int){


                case 1 :
                    rate_choosen = .7;
                    bool = false;
                    break;

                case 2:
                    rate_choosen = 1.4;
                    bool = false;
                    break;

                case 3:
                    rate_choosen = 2.1;
                    bool = false;
                    break;

                default:
                    System.out.println("that option does not exist");
                    bool = true;
                    break;
            }

        }while(bool);


        double i_d = Math.random();
		/*System.out.println("Your random id is: " + i_d);
		System.out.println("Copy this number for a receipt");

                   */

        Information obj1 = new Information(name,new_money,rate_choosen,i_d,a,c,d);
        userList.add(obj1);


        NewClass c1 = new NewClass();
        c1.setaccumulador(Information x);

        System.out.println("Balance accumulado es " + c1.getaccumulador());

        receipt();







        return;


    }

    void receipt() {

        Scanner input = new Scanner(System.in);
        int position = 0;

        for(int i = (userList.size()-1); i<= userList.size(); i++) {
            position = i;
            System.out.println("Account User name: " + userList.get(position).getName());
            System.out.println("Random id is: " + userList.get(position).get_IdentificationNumber());
            System.out.println("Your money in is: " + userList.get(position).get_moneyIn());
            System.out.println("Your money out is: " + userList.get(position).get_moneyOut());
            System.out.println("Your interest payed was: " + userList.get(position).getInterestRate());
            System.out.println("Your interest payed was: " + userList.get(position).getInterstAmnt());

            System.out.println("Your secrete name is: " + userList.get(position).getfirst_letter()
                    + userList.get(position).getmiddle_letters() + userList.get(position).getlast_letter());
        }
        return;


    }










}

