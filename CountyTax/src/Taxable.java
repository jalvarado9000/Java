public class Taxable {





    int deci(int op,int x){

        int x1 = 0;

        switch(op) {

            case 1:
                x1 = x-25000;

                if(x1 >= 25000 && x1 <= 75000) {

                    int x2 = x1 - 25000;

                    return x2;

                }



                break;


            case 2:
                x1 =x;
                break;


            case 3:
                System.out.println("Invalild Input");
            default:



        }


        return x1;

    }


}