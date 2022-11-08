import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        DecimalFormat df2 = new DecimalFormat("##,##0.00");
        DecimalFormat df3 = new DecimalFormat("0.0000");

        BankAccountTest object = new BankAccountTest("Juan M. Alvarado Caraballo", 54321, 0.007);

        System.out.println("New account with name:  " + object.getName() + ", Balance $" + object.getBalance() + " created");
        //probando el cambio de interest rate;
        //object.setInterestRate(.008);
        //System.out.println(" Withdrawing $2500 from the account");
        //object.withdraw(2500);
        System.out.println(" Depositing $3000 to the account");
        object.deposit(3000);
        System.out.println(" Balance: $" + object.getBalance());
        object.addMonthlyInterest();

        System.out.println("Your monthly interest amount would be: $ " + df2.format(object.getBalance() * object.getMonthlyInterestRate()));
        System.out.println("Your anual interest amount would be: $ " + df2.format(object.getInterstAmnt()));
        System.out.println("your balance plus the monthly interest rate is: " + (object.getBalance() + object.getBalance() * object.getMonthlyInterestRate()));
        System.out.println("your balance plus the anual interest rate is: " + object.getBalance());
        System.out.println(" Monthly Interest: %" + df3.format(object.getMonthlyInterestRate()));
        System.out.println(" Annual Inerest: %" + object.getInterestRate());


    }
}