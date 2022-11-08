public class Information {

    private String user; //original name of the user
    private double money_in;// money entered
    private double money_out;// money converted
    private double InterestRate;//rate of interest
    private double interestAmnt; //holds the curruncy exhange machine money earned
    private double Identification_number;// unique id for the user to file a complaint
    private double Accumulate;//the total exchange machine money earned
    private char first_letter;//first letter of the user name to hide their name and identity
    private String middle_letter;//middle letters of the user name to hide their name and identity
    private char last_letter;//last letter of the user name to hide their name and identity

    //constructor
    Information(String n, double mi, double RATE, double Id,char a,String c, char d){

        user = n;
        money_in = mi;
        Identification_number = Id;
        InterestRate = RATE;
        money_out = money_in-(RATE*money_in);
        interestAmnt = RATE*money_in;
        first_letter = a;
        middle_letter = c;
        last_letter = d;
    }

    //         void setInformation(double m){
    //  money_in = m;

    void set_Interest_Accumulator() {

        Accumulate += interestAmnt;

    }




    //Getters
    double getInterstAmnt() {return interestAmnt;}
    double getInterestRate() {return InterestRate;}
    double get_moneyIn() {return money_in;}
    String getName(){return user;}
    double get_IdentificationNumber() {return Identification_number;}
    double get_moneyOut(){return money_out;}
    double Interest_Accumulator() { return Accumulate;}
    char getfirst_letter(){return first_letter;}
    String getmiddle_letters(){return middle_letter;}
    char getlast_letter(){return last_letter;}








}
