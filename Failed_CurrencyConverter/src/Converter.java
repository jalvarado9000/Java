import java.text.DecimalFormat;
import java.util.Scanner;

public class Converter{

    //ACC means total money accumulated
    public double RupeeRate = .007;
    public double YenRate = .010;
    public double PoundRate = .008;
    public double EuroRate = .009;
    private double after_rate;
    private double Rupee;
    private double Pound;
    private double Dollar;
    private double Euro;
    private double Yen;
    private double Money_earned;


    public void exchange_Currency(int num){

        DecimalFormat f = new DecimalFormat("##.##");
        Scanner input = new Scanner(System.in);
        String option= " ";
        char op = ' ';
        Scanner sc = new Scanner(System.in);

        double rupee = 0,pound=0,euro =0,yen=0,dollar=0,rate =0;
        double total_rupee = 0,total_pound=0,total_euro =0,total_yen=0,total_dollar=0,total_rate =0;
        double earned_rupee = 0,earned_pound=0,earned_euro =0,earned_yen=0,earned_dollar=0,earned_rate =0;

        double rupe = 0,poun=0,eur =0,ye=0;

        boolean bool = false;

        String parse;
        do{

            do{
                if(num == 1)
                    System.out.println("Enter amounts in rupee: " );
                else
                    System.out.println("Entra la cantidad en rupees: " );

                total_rupee =sc.nextDouble();//10
                rate = .007; //%7
                earned_rupee = total_rupee*rate;//7
                rupee = total_rupee -earned_rupee;//3
                rupe += rupee;

                if(num == 1)
                    System.out.println("Do you wish to do another transaction (Y/N) or (y/n)" );
                else
                    System.out.println("Desea hacer otra transaccion?(si o no)/(y/n)");

                option = input.nextLine();
                op = option.charAt(0);


            }while(op == 'y'|| op == 'Y' );


            do{
                if(num ==1)
                    System.out.println("Enter amounts in pounds: ");
                else
                    System.out.println("Entra la cantidad en pounds: " );
                total_pound =sc.nextDouble();
                rate =.008;
                earned_pound = total_pound*rate;
                pound = total_pound -earned_pound;
                poun += pound;

                if(num == 1)
                    System.out.println("Do you wish to do another transaction (Y/N) or (y/n)" );
                else
                    System.out.println("Desea hacer otra transaccion?(si o no)/(y/n)");

                option = input.nextLine();
                op = option.charAt(0);


            }while(op == 'y'|| op == 'Y' );

            do{
                if(num ==1)
                    System.out.println("Enter amounts in euros:" );
                else
                    System.out.println("Entra la cantidad en euros: " );
                total_euro =sc.nextDouble();
                rate =.009;
                earned_euro = total_euro*rate;
                euro = total_euro -earned_euro;
                eur += euro;

                if(num == 1)
                    System.out.println("Do you wish to do another transaction (Y/N) or (y/n)" );
                else
                    System.out.println("Desea hacer otra transaccion?(si o no)/(y/n)");

                option = input.nextLine();
                op = option.charAt(0);


            }while(op == 'y'|| op == 'Y' );

            do{
                if(num == 1)
                    System.out.println("Enter amounts in yens:" );
                else
                    System.out.println("Entra la cantidad en yens: " );

                total_yen =sc.nextDouble();
                rate = .010;
                earned_yen = total_yen*rate;
                yen = total_yen -earned_yen;
                ye += yen;

                if(num == 1)
                    System.out.println("Do you wish to do another transaction (Y/N) or (y/n)" );
                else
                    System.out.println("Desea hacer otra transaccion?(si o no)/(y/n)");

                option = input.nextLine();
                op = option.charAt(0);


            }while(op == 'y'|| op == 'Y' );




            if(num == 1)
                System.out.println("Desea hacer otra transaccion?(si o no)/(y/n)");
            else
                System.out.println("Do you want to continue?(Y/N) or (y/n)");

            parse = input.nextLine();
            op = parse.charAt(0);

        }while(op == 'Y' || op == 'y');

        rupe = rupe *0.014 ;
        setRupee(rupe);


        pound = pound * 1.31;
        setPound(pound);


        euro = euro * 1.11;
        setEuro(euro);


        yen = yen * 0.0092;
        setYen(yen);


        dollar = rupee + pound +euro + yen;
        setDollar(dollar);


        if(num == 1)
            System.out.println("Total amount in dollars is:" +dollar + "$");

        else
            System.out.println("El total en dolares es: " + dollar + "$");



    }
    //Setter for single user
    public void setPound(double p){Pound = p;}// counter de la cantidad de rupees insertado
    public void setRupee(double r){Rupee = r;}
    public void setEuro(double e){Euro = e;}
    public void setYen(double y){Yen = y;}
    public void setDollar(double d){Dollar = d;}


    //Getters for single user
    public double getDollar(){return Dollar;}
    public double getPound(){return Pound;}
    public double getEuro(){return Euro;}
    public double getRupee(){return Rupee;}
    public double getYen(){return Yen;}




}