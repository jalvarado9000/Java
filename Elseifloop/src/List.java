public class List {




    private double peso,pie,pulgada;
    private double bmi;
    private String status;



    public List(double w, double f, double i, double b, String s) {

        peso = w;
        pie = f;
        pulgada = i;
        bmi = b;
        status = s;

    }


    double peso() {return peso;}
    double  pie() {return pie;}
    double  pulgada() {return pulgada;}
    double  bmi() {return bmi;}
    String  status() {return status;}


}


