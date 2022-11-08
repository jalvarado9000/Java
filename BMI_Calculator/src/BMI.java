public class BMI {

    private double weight,foot,inches;
    private double bmi;
    private String status;


    public BMI() {}
    public BMI(double w, double f, double i, double b, String s) {

        weight = w;
        foot = f;
        inches = i;
        bmi = b;
        status = s;

    }


    double get_weight() {return weight;}
    double  get_foot() {return foot;}
    double  get_inches() {return inches;}
    double  get_bmi() {return bmi;}
    String  get_status() {return status;}


}
