public class Rectangle {


    private double length;
    private double width;
    private String color;



    public Rectangle(double ln, double wd) {

        length = ln;
        width = wd;
        color = "Yellow";

    }

    public Rectangle(double ln, double wd, String c) {

        length = ln;
        width = wd;
    }


//Setter

    void set_Color(String new_color){color = new_color;}

//Getter

    String get_Color() {return color;}

    double get_Lenght() {return length;}

    double get_Width() {return width;}



}


