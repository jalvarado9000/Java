import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // TODO code application logic here
        Test object2 = new English();
        Test object3 = new Spanish();
        Scanner input = new Scanner(System.in);
        int op;
        boolean flag = true;

        do{
            System.out.println("enter 1 for English and 2 for Spanish");
            op = input.nextInt();

            if(op == 1){

                object2.showMenu();
                object2.setLanguage(op);
                flag = false;
            }

            else if(op == 2){
                object3.showMenu();
                object3.setLanguage(op);
                flag = false;

            }

            else{
                System.out.println("you invalid option");
                flag = true;
            }
        }while(flag);

    }

}