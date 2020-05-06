import java.util.*;// imports all java util classes
import java.text.SimpleDateFormat; 

public class WilliamsJrS_Lab7
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);// Creates new scanner object to accept user input 

        System.out.println("Steven's Automotive Shop");
        
        // Creates new objects for customer, car, and serviceQuote
        WilliamsJrS_Customer customer = new WilliamsJrS_Customer();
        WilliamsJrS_Car car = new WilliamsJrS_Car();
        WilliamsJrS_ServiceQuote service = new WilliamsJrS_ServiceQuote();

        System.out.println("Enter the customer's name: ");
        String name = keyboard.nextLine();// will store user's name
        customer.setName(name);// passes user's name to the WilliamsJrS_Customer object

        System.out.println("Enter the customer's Address: ");
        String address = keyboard.nextLine();// will store user's address
        customer.setAddress(address);// passes user's address to the WilliamsJrS_Customer object

        System.out.println("Enter Car Make: ");
        String make = keyboard.nextLine();
        car.setMake(make);
        
        System.out.println("Enter Car Model: ");
        String model = keyboard.nextLine();
        car.setModel(model);
        
        System.out.println("Enter Car Year: ");
        int year = keyboard.nextInt();
        car.setYear(year);

        System.out.println("Enter the Parts Charges: ");
        double partsCharges = keyboard.nextDouble();
        service.setPartsCharges(partsCharges);

        System.out.println("Enter the Labor Charges: ");
        double laborCharges = keyboard.nextDouble();
        service.setLaborCharges(laborCharges);


        System.out.println("\nService Estimate ");
        System.out.println("Customer Name: " + customer.getName());
        System.out.println("Customer Address: " + customer.getAddress());
        System.out.println("Customer Phone: " + customer.getPhone());
        
        System.out.println("\nCar Make: " + car.getMake());
        System.out.println("Car Model: " + car.getModel());
        System.out.println("Car Year: " + car.getYear());

        System.out.println("\nParts Charges: " + service.getPartsCharges());
        System.out.println("Labor Charges: " + service.getLaborCharges());
        System.out.println("Sales Tax: " + service.getSalesTax());
        System.out.println("Total Charges: " + service.getTotalCharges());

        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy HH:mm");  
        Date date = new Date();  

        System.out.println("Lab 6 Program was created by Steven Alexander, [ID], " + formatter.format(date) + ".");
    }
}