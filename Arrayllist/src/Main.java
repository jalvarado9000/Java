import java.util.Scanner;

public class Main {
    public static void main(String[] args)

    {

        int number;
        Scanner input = new Scanner(System.in);

        System.out.println("Entre un numero y le dire cuantos numeros pares tiene antes de el");

        number = input.nextInt();


        for(int i = 1; i <= number; i++)

        {

            double result2 = i%2;

            if(result2 == 0)
            {

                System.out.println(i);

            }

            else
            {

            }

        }
    }
}