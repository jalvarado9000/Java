public class Cube extends Rectangle
{

    private double height; // The cube's height

    public Cube(double len, double w, double h)
    {
        // Call the superclass constructor.
        super(len, w);

        // Set the height.
        height = h;
    }

    public double getHeight()
    {
        return height;
    }

    public double getSurfaceArea()
    {
        return getArea()*6;
    }

    public double getVolume()
    {

        return getArea()*height;
    }
}
