public class WilliamsJrS_Rectangle
{
    private String name;
    private double length;
    private double width;

    public void Rectangle(String aName, double aLength, double aWidth)
    {
        name = aName;
        length = aLength;
        width = aWidth;
    }

    public void setName(String newName)
    {
        name = newName;
    }

    public void setLength(double newL)
    {
        length = newL;
    }

    public void setWidth(double newW)
    {
        width = newW;
    }

    public String getName()
    {
        return name;
    }

    public double getLength()
    {
        return length;
    }

    public double getWidth()
    {
        return width;
    }

    public double getArea()
    {
        return length * width;
    }
}