public class Information{

    private String user; //original name of the user
    private double money_in;// money entered
    private double Identification_number;// unique id for the user to file a complaint
    private double user_rupee;
    private double user_pound;
    private double user_euro;
    private double user_yen;
    private double user_dollar;


    //constructor
    Information(String n, double mi,double Id, double rupee, double pound, double yen, double euro){

        user = n;
        money_in = mi;
        Identification_number = Id;
        user_rupee = rupee;
        user_pound = pound;
        user_yen = yen;
        user_euro = euro;
    }


    //Getters
    double get_moneyIn() {return money_in;}
    String getName(){return user;}
    double get_IdentificationNumber() {return Identification_number;}
    double getUser_rupee(){return user_rupee;}
    double getUser_pound(){return user_pound;}
    double getUser_yen(){return user_yen;}
    double getUser_euro(){return user_euro;}






}
