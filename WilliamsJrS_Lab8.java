import java.util.Scanner;

public class WilliamsJrS_Lab8
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        
        //Creates new objects for kitchen, bedroom, living room, and dining room
        WilliamsJrS_Rectangle kitchen = new WilliamsJrS_Rectangle();
        WilliamsJrS_Rectangle livingRoom = new WilliamsJrS_Rectangle();
        WilliamsJrS_Rectangle diningRoom = new WilliamsJrS_Rectangle();
        WilliamsJrS_Rectangle bedRoom = new WilliamsJrS_Rectangle();
        WilliamsJrS_Rectangle bathRoom = new WilliamsJrS_Rectangle();

        // sets length and width of bathroom
        bathRoom.setLength(12.5);
        bathRoom.setWidth(15.5);
        
        System.out.println("Enter the dimensions of the Kitchen (Length then width): ");
        double length = keyboard.nextDouble();
        double width = keyboard.nextDouble();
        kitchen.setLength(length);
        kitchen.setWidth(width);

        System.out.println("Enter the dimensions of the bedroom (Length then width): ");
        length = keyboard.nextDouble();
        width = keyboard.nextDouble();
        bedRoom.setLength(length);
        bedRoom.setWidth(width);

        System.out.println("Enter the dimensions of the living room (Length then width): ");
        length = keyboard.nextDouble();
        width = keyboard.nextDouble();
        livingRoom.setLength(length);
        livingRoom.setWidth(width);

        System.out.println("Enter the dimensions of the dining room (Length then width): ");
        length = keyboard.nextDouble();
        width = keyboard.nextDouble();
        diningRoom.setLength(length);
        diningRoom.setWidth(width);

        System.out.println("This house has 5 rooms: "
                            + "\n\tKitchen: " + kitchen.getLength() + " by " + kitchen.getWidth()
                            + "\n\tBedroom: " + bedRoom.getLength() + " by " + bedRoom.getWidth()
                            + "\n\tLiving room: " + livingRoom.getLength() + " by " + livingRoom.getWidth()
                            + "\n\tDining room: " + diningRoom.getLength() + " by " + diningRoom.getWidth()
                            + "\n\tBathroom: " + bathRoom.getLength() + " by " + bathRoom.getWidth()
                            );     
        
        // adds up all of the room's areas together 
        double totalArea = kitchen.getArea() + bedRoom.getArea() + livingRoom.getArea() + diningRoom.getArea() + bathRoom.getArea();
        System.out.println("The total area of the house is " + totalArea);
    }
}