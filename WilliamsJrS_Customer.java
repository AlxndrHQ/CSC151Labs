public class WilliamsJrS_Customer
{
    private String name;
    private String address;
    private String phone;

    public void Customer()
    {
        name = null;
        address = null;
        phone = null;
    }

    public void setName(String n)
    {
        name = n;
    }

    public void setAddress(String a)
    {
        address = a;
    }

    public void setPhone(String p)
    {
        phone = p;
    }

    public String getName()
    {
        return name;
    }
    
    public String getAddress()
    {
        return address;
    }

    public String getPhone()
    {
        return phone;
    }
}