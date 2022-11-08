import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        double rupee,dollar,pound,code,euro,yen;
        rupee = dollar = pound = code = euro = yen = 0;

        DecimalFormat f = new DecimalFormat("##.##");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the currency you want:\n1: Rupees\n2:Dollar\n3:Pound\n4:Euro\n5:Yen");
        code=sc.nextInt();

        if(code == 1)
        {
            System.out.println("Enter amount in rupees");
            rupee = sc.nextFloat();

            dollar = rupee / 66;
            System.out.println("Dollar : "+f.format(dollar)+ "$");

            pound = rupee / 98;
            System.out.println("Pound : "+f.format(pound)+ "£");

            euro = rupee / 72;
            System.out.println("Euro : "+f.format(euro)+ "€");

            yen = rupee / 0.55;
            System.out.println("Yen : "+f.format(yen)+ "¥");

        }

        //For Dollar Conversion
        else if (code == 2)
        {
            System.out.println("Enter amount in dollars");
            dollar = sc.nextFloat();

            rupee = dollar * 66;
            System.out.println("Rupees :  "+f.format(rupee)+ "₹" );

            pound = dollar * 0.67;
            System.out.println("Pound : "+f.format(pound)+ "£");

            euro = dollar * 0.92;
            System.out.println("Euro : "+f.format(euro)+ "€");

            yen = dollar * 120.90;
            System.out.println("Yen : "+f.format(yen)+ "¥");
        }

        //For Pound Conversion
        else if(code == 3)
        {
            System.out.println("Enter amount in Pounds");
            pound = sc.nextFloat();

            rupee = pound * 98;
            System.out.println("Rupees : "+f.format(rupee)+ "₹");

            dollar = pound * 1.49;
            System.out.println("Dollar :  " + f.format(dollar)+ "$");

            euro = pound * 1.36;
            System.out.println("Euro : "+f.format(euro)+ "€");

            yen = pound * 179.89;
            System.out.println("Yen : "+f.format(yen)+ "¥");
        }

        //For Euro Conversion
        else if(code == 4)
        {
            System.out.println("Enter amount in Euros");
            euro = sc.nextFloat();

            rupee = euro * 72;
            System.out.println("Rupees :  "+f.format(rupee)+ "₹");

            dollar = euro * 1.09;
            System.out.println("Dollar :  "+f.format(dollar)+ "$");

            pound = euro * 0.73;
            System.out.println("Pound : "+f.format(pound)+ "£");

            yen = euro * 131.84;
            System.out.println("Yen : "+f.format(yen)+ "¥");
        }

        //For Yen Conversion
        else if(code == 5)
        {

            System.out.println("Enter amounts in rupee: " );
            rupee =sc.nextFloat();
            System.out.println("Enter amounts in dollars: ");
            dollar =sc.nextFloat();;
            System.out.println("Enter amounts in pounds:" );
            pound =sc.nextFloat();
            System.out.println("Enter amounts in euros:" );
            euro =sc.nextFloat();

            rupee *=1.53;
            dollar *=108.77;
            pound *=143.12;
            euro *=120.74;

            yen = rupee + dollar + pound + euro;
            System.out.println("Total amount in yens is:" +yen);



        }

        else
            System.out.println("Invalid Code");


        System.out.println("Total amount in yens is:" +yen);

    }
}