import java.util.Scanner;

public class CSC151_Lab5v2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);// allows keyboard entry

        System.out.println("Enter your name ");
        String name = keyboard.nextLine();// stores name variable

        System.out.println("Enter your age ");
        int age = keyboard.nextInt();

        System.out.println("Enter your GPA");
        double GPA = keyboard.nextDouble();

        System.out.println("Enter your major:");
        keyboard.nextLine();// clears buffer
        String major = keyboard.nextLine();

        System.out.println("Enter the number of classes that you are taking ");
        int noClasses = keyboard.nextInt();

        System.out.println("Name: " + name + " \nage " + age + " \nGPA " + GPA + " \nmajor " + major
                + " \nNumber of classes " + noClasses);// prints previously entered variables

        /* Casts all variables up one level */
        byte vByte = 123;
        short vShort = vByte;
        int vInt = vShort;
        long vLong = vInt;
        float vFloat = vLong;
        double vDouble = vFloat;

        System.out.println("vByte: " + vByte + "vShort: " + vShort + "vInt: " + vInt + "vLong: " + vLong + "vFloat: "
                + vFloat + "vDouble: " + vDouble);

        /* Narrows all variables down one level */
        vDouble = 123.456;
        vFloat = (float) vDouble;
        vLong = (long) vFloat;
        vInt = (int) vLong;
        vShort = (short) vInt;
        vByte = (byte) vShort;

        System.out.println("vByte: " + vByte + "vShort: " + vShort + "vInt: " + vInt + "vLong: " + vLong + "vFloat: "
                + vFloat + "vDouble: " + vDouble);

    }
}