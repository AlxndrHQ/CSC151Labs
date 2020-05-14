public class IceCream {
    private String name;
    private int noScoops;
    private String flavor;// flavor is represented by a string
    private double scoopCost;
    private double totalCost;
    private double bill;
    private double userTender;
    private double change;

    // constructs object for name, string flavor, number of scoops, scoop cost,
    // bill, and change
    /*
     * public iceCream(String name, String stringScoopFlavor, int noScoops, double
     * scoopCost, double bill, double change) { this.name = name;
     * this.stringScoopFlavor = stringScoopFlavor; this.noScoops = noScoops;
     * this.scoopCost = scoopCost; this.bill = bill; this.change = change; }
     */

    // set/get name
    public void setName(String name) {
        this.name = name;// sets the name
    }

    public String getName() {
        return name;// returns the name
    }

    // set/get noScoops
    public void setScoops(int noScoops) {
        this.noScoops = noScoops;// sets number of scoops
    }

    public int getScoops() {
        return noScoops;// returns number of scoops
    }

    // set/get flavor
    public void setFlavor(String flavor)// passes through a string for flavor
    {
        this.flavor = flavor;// sets flavor using String
    }

    public String getFlavor() {
        return flavor;// returns String representing flavor
    }

    // set/get scoopCost
    public void setScoopCost(double cost) {
        scoopCost = cost;
    }

    public double getScoopCost() {
        return scoopCost;
    }

    // calculate/get totalCost based on noScoops and scoopCost
    public double calculateTotal(int noScoops, double scoopCost) {
        return this.noScoops * this.scoopCost;// multiplies number of scoops * scoopCost
    }

    // calculate/get change based on userTender
    public void calculateChange(double bill, double totalCost) {
        change = this.bill - this.totalCost;
    }

    public double getChange() {
        return change;
    }

    // creates returnOrder method to return all attributes of the order
    // (name, integer flavor, number of scoops, scoop cost, bill, and change)
    public String returnOrder() {
        return "Order Name: " + name + "\n\tFlavor: " + flavor + "\n\tNumber of Scoops: " + noScoops
                + "\n\tCost per scoop: " + scoopCost + "\n\tBill Entered: " + bill + "\n\tChange Given: " + change;
    }
}