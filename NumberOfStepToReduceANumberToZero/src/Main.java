public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        /*
        SHORTER SOLUTION
        num = 14;
        counter = 0;

        while(num < 0){
        num = num%2 == 0 ? num/2 : num--;
        counter++
        }
        return counter;

         */

        int num = 14;
        boolean flag = true;
        int counter = 0;

        while(flag){

            if(num == 0){
                flag = false;
            }
            else if(num%2 == 0){
                counter++;
                System.out.println("Step " + counter +") " + num + " is even; divide by 2 and obtain " + (num/2) + ". ");
                num = num/2;

            }
            else{
                counter++;
                System.out.println("Step " + counter +") " + num + " is odd; substract 1 and obtain " + (num-1) + ". ");
                num--;

            }
        }
        System.out.println(counter);


    }
}