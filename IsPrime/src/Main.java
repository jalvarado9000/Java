import java.util.Scanner;

public class Main {

    int current;

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the range: ");

        int maxInt = in.nextInt();

        // "maxInt" contains the number entered by the user.

        // Make a PrimeGenerator object, and write a loop

        // that uses the PrimeGenerator's nextPrime() method to

        // get primes. If the prime is less than or equal to "maxInt",

        // print it; otherwise, terminate the loop.

        PrimeGenerator generator = new PrimeGenerator();

        int i=2;

        int prime;

        System.out.println("Prime numbers are:");

        while(i<=maxInt){

            if(i==2)

                System.out.println(i+" ");

            else{

                prime=generator.nextPrime();

                if(prime<=maxInt)

                    System.out.println(prime+" ");

            }

            i++;

        }

    }



}

/** This class returns all the prime numbers,

 one at a time starting with 2.

 This class follows the "generator" pattern: each

 call to nextPrime() generates the next number in

 the series.



 */

class PrimeGenerator

{

    int current;

    /**

     Initialize the PrimeGenerator object with the first number.*/

    public PrimeGenerator()

    {

        current = 1;

    }

    /**

     Calculate the next prime number after current.

     @return the next prime number */

    public int nextPrime()

    {

        current++; // Increment past previous prime number.



        // Write a loop that uses the value of the variable current,

        // and while isPrime(current) is false, increment current.

        // (When the loop exits, current contains the next prime number,

        // which we can return.)

        while(!isPrime(current))

        {

            current++;

        }

        return current;

    }

    /**

     Determine whether the given number is prime.

     @param n Number to check

     @return true if prime, or false if not

     */

    public static boolean isPrime(int n)

    {

        // Write "if" comparisons and a loop to determine whether

        // "n" is prime. We'll work this method out in class.

        boolean flag=false;

        int count=1;

        for(int j=3;j<=n;j++)

        {

            if(n%j==0)

                count++;

        }

        if(count==2)

            flag=true;

        return flag;

    }

}

