public class BankAccountTest {



    private String ownerName;
    private double balance;
    private double InterestRate;//interestRate
    private double interestAmnt; //holds total amount of interest earn for the account

    //constructor for the name and balance

    BankAccountTest(String n, double b, double ir){

        ownerName = n;
        balance = b;
        InterestRate = ir;

    }

    BankAccountTest(String n, double b ){

        ownerName = n;
        balance = b;
        InterestRate = 0.012;

    }


    BankAccountTest(String n){

        ownerName = n;
        balance = 0.00;
        InterestRate = 0.012;

    }




    void deposit(double amount){

        balance += amount;

    }


    void withdraw(double amount){

        balance -= amount;
    }

    void addMonthlyInterest() {

        double t= 0;
        t = InterestRate*balance;
        balance +=t;
        interestAmnt +=t;
    }

    double getInterstAmnt() {

        return interestAmnt;
    }


    double getInterestRate() {

        return InterestRate;
    }

    double getMonthlyInterestRate(){

        return InterestRate/12;
    }


    double getBalance() {

        return balance;
    }

    void setInterestRate(double ir ) {

        InterestRate = ir;
    }


    String getName(){

        return ownerName;
    }



}
