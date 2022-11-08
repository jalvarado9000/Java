import java.util.ArrayList;
import java.util.Scanner;

public class Hidden {
    private ArrayList<Information> userList = new ArrayList<Information>();
    private int language;
    //private String first_name;
    //private double new_deposit;

    private Accumulate obj = new Accumulate();
    private Converter con = new Converter();


    void setLanguage(int num){language = num;}
    int getLenguage(){return language;}


    public void Commands(){

        System.out.println("Enter 1 to print receipt");
        System.out.println("Enter 2 to find user");
        System.out.println("Enter 3 to display user all user information");
        System.out.println("Enter 4 to withdraw all the money from the machine");


    }


    public void secretMenu(){

        Scanner input = new Scanner(System.in);
        boolean flag = true;
        do{
            Commands();
            int option = input.nextInt();


            switch(option){

                case 0:
                    lastReceipt();
                    flag = false;
                    break;

                case 1:
                    findUser();
                    flag = false;
                    break;

                case 2:
                    allUser();
                    flag = false;
                    break;
                case 3:
                    Withdraw();
                    flag = false;
                    break;
                default:
                    System.out.println("wrong option try again");
                    flag = true;
                    break;

            }

        }while(flag);


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


    public void allUser(){


        Scanner input = new Scanner(System.in);

        System.out.println("enter the id");
        int secret = input.nextInt();
        int position = 0;


        for(int i = 0; i< userList.size(); i++) {


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

            System.out.println("/////////////////////////////////////////////////////////////////////*");

        }
    }


    public void Withdraw(){

        System.out.println(obj.ACCgetEuro());
        obj.ACCsetEuro(0);
        System.out.println(obj.ACCgetPound());
        obj.ACCsetPound(0);
        System.out.println(obj.ACCgetYen());
        obj.ACCsetYen(0);
        System.out.println(obj.ACCgetRupee());
        obj.ACCsetRupee(0);
    }


    public void lastReceipt() {

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
