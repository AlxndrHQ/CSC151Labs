public class ServiceQuote {
    private double partsCharges = 0.0;
    private double laborCharges = 0.0;

    public void ServiceQuote() {
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