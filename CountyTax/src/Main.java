import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        //Alachua County

        int property_value;
        int selection;
        int second_op;

        Scanner input = new Scanner(System.in);
        Taxable tax = new Taxable();

        System.out.println("what is the value of your home");

        property_value = input.nextInt();

        System.out.println("Do you live in the house");
        System.out.println("Select 1 for YES and 2 for NO");
        selection = input.nextInt();

        second_op = tax.deci(selection, property_value);






        double tax_general,tax_school,tax_total;

        if(second_op >= 25000 && second_op <= 75000) {
            tax_general = (second_op+25000)*.1435;
            System.out.println(tax_general);

            tax_school = (second_op)*.072;
            System.out.println(tax_school);

            tax_total =tax_general + tax_school;
            System.out.print("Your payment to the goverment is: $");
            System.out.print(tax_total);

        }

        else {
            tax_general = second_op*.1435;
            System.out.println(tax_general);
            tax_school = second_op*.072;
            System.out.println(tax_school);
            tax_total = tax_general + tax_school;
            System.out.print("Your payment to the goverment is: $");
            System.out.print(tax_total);

        }

    }

}
