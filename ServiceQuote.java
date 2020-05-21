public class ServiceQuote {
    private double partsCharges;
    private double laborCharges;

    public void ServiceQuote() {
        partsCharges = 0.0;
        laborCharges = 0.0;
    }

    public void setPartsCharges(double c) {
        partsCharges = c;
    }

    public void setLaborCharges(double c) {
        laborCharges = c;
    }

    public double getPartsCharges() {
        return partsCharges;
    }

    public double getLaborCharges() {
        return laborCharges;
    }

    public double getSalesTax() {
        return (laborCharges + partsCharges) * 0.06;// for 6% Maryland Sales Tax
    }

    public double getTotalCharges() {
        return laborCharges + partsCharges + getSalesTax();
    }

}