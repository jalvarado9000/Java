import java.util.Scanner;

public class Main {
    public static int pairs(int value) {


        int x=0;
        x=+value;

        //System.out.print(x);
        return x;





    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int value;

        Scanner num1 = new Scanner(System.in);

        System.out.println("Enter a value");

        value = num1.nextInt();

        for(int i = 1; i <= value; i++)

        {

            double result2 = i%2;

            if(result2 == 0)
            {

                pairs(i);
                int z,trash;
                z = pairs(i);

                trash=+z;
                System.out.println(trash + '\n');

            }

        }



    }



}


