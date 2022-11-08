public class Rectangle
{
    private double length;
    private double width;
    /**
     10.2 Calling the Superclass Constructor 629
     Constructor
     @param len The length of the rectangle.
     @param w The width of the rectangle.
     */
    public Rectangle(double len, double w)
    {
        length = len;
        width = w;
    }

    void setWidth(double w){
        width = w;
    }

    void setLength(double l){
        length = l;
    }

    double getLength(){return length;}
    double getWidth(){return width;}
    double getArea(){return length*width;}


}