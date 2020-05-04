public class WilliamsJrS_Car
{
    private String make;
    private String model;
    private int year;

    public Car()
    {
        make = null;
        model = null;
        year = 0;
    }

    public void setMake(String m)
    {
        make = m;
    }

    public void setModel(String m)
    {
        model = m;
    }

    public void setYear(int y)
    {
        year = y;
    }

    public String getMake()
    {
        return make;
    }

    public String getModel()
    {
        return model;
    }

    public int getYear()
    {
        return year;
    }
}