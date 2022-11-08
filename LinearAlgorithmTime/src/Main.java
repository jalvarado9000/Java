import java.util.Scanner;

public class Main {
    public static void main(String a[]){

        long start = System.nanoTime();

        Scanner input = new Scanner(System.in);

        int[] a1 = new int[10000000];

        for(int i = 0; i < 10000000; i++)
            a1[i]= i;

        System.out.println("enter a number");
        int key = input.nextInt();

        System.out.println(key+" is found at index: "+linearSearch(a1, key));





        long finish = System.nanoTime();

        long timeElapsed = finish - start;



        System.out.println("Linear search algorithm takes: " +timeElapsed +" nanoseconds"  );

    }

    public static int linearSearch(int[] arr, int key){


        for(int i=0;i<arr.length;i++){

            if(arr[i] == key){

                return i;



            }



        }

        return -1;



    }


}


