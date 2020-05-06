public class IceCream
{
    private String name;
    private int noScoops;
    private String stringScoopFlavor;// flavor is represented by a string 
    private int integerScoopFlavor;// flavor is represented by an integer 
    private double scoopCost;
    private double bill;
    private double change;
    
    
    // constructs object for name, string flavor, number of scoops, scoop cost, bill, and change
    public iceCream(String name, String stringScoopFlavor, int noScoops, double scoopCost, double bill, double change)
    {
        this.name = name;
        this.stringScoopFlavor = stringScoopFlavor;
        this.noScoops = noScoops;
        this.scoopCost = scoopCost;
        this.bill = bill;
        this.change = change;
    }

    // needs set/get name
    public void setName(String name)
    {
        this.name = name;// sets the name
    }
    public String getName()
    {
        return name;// returns the name 
    }

    // needs set/get noScoops
    public void setScoops(int noScoops)
    {
        this.noScoops = noScoops;// sets number of scoops
    }
    public int getScoops()
    {
        return noScoops;// returns number of scoops
    }

    // needs set/get flavor
    public void setFlavor(String flavor)// passes through a string for flavor
    {
        stringScoopFlavor = flavor;// sets flavor using String
    }
    public void setFlavor(int flavor)// passes through an int for flavor
    {
        integerScoopFlavor = flavor;// sets flavor using integer
    }
    public String getFlavor()
    {
        return stringScoopFlavor;// returns String representing flavor
    }
    public int getFlavor()
    {
        return integerScoopFlavor;// returns integer representing flavor 
    }

    // needs set/get cost
    public void setCost(double cost)
    {
        scoopCost = cost;
    }
    public double getCost()
    {
        return scoopCost;
    }

    // needs calculate/get total
    public double calculateTotal(String sFlavor, double getCost)
    {
        // return double.parseDouble(sFlavor) * getCost();
        
    }
    public double calculateTotal(int iFlavor, double getCost)
    {
        return integerScoopFlavor * getCost();// multiplies integer representing cost * cost for the item
        
    }
    
    // needs calculate/get change 
    public void calculateChange(double bill, double calculateTotal())
    {
        change = bill - calculateTotal();
    }
    public double returnChange(double bill, double calculateTotal())
    {
        return change;
    }

    // creates to string method to return all attributes of the order 
    // (name, integer flavor, number of scoops, scoop cost, bill, and change)
    public String returnOrder()
    {
        return "Order Name: " + name 
                + "\n\tFlavor: " + .getFlavor() 
                + "\n\tNumber of Scoops: " + noScoops 
                + "\n\tCost per scoop: " + scoopCost 
                + "\n\tBill Entered: " + bill 
                + "\n\tChange Given: " + change;
    }
}