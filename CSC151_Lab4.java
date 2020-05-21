import java.util.Scanner;// imports scanner object 

public class CSC151_Lab4 {
    public static void main(String[] args) {
        // Part A -- Calculating GPA
        double chemistryGrade, physicsGrade, calculusGrade, historyGrade;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter your grade for chemistry: ");
        chemistryGrade = keyboard.nextDouble();

        System.out.println("Enter your grade for physics: ");
        physicsGrade = keyboard.nextDouble();

        System.out.println("Enter your grade for calculus: ");
        calculusGrade = keyboard.nextDouble();

        System.out.println("Enter your grade for history: ");
        historyGrade = keyboard.nextDouble();

        double GPA = (chemistryGrade + physicsGrade + calculusGrade + historyGrade) / 4;

        System.out.println("The grade for chemistry is " + chemistryGrade + ", the grade for physics is " + physicsGrade
                + ", the grade for calculus is " + calculusGrade + ", the grade for history is " + historyGrade
                + ", and the GPA for the semester is " + GPA);

        // Part B -- Methods on String
        String firstString = "Dematha", secondString = "Prince George's County";
        int firstStringLength = firstString.length();
        System.out.println("The first string is " + firstString + ". First String's length is " + firstStringLength);
        System.out.println(
                "The second string is " + secondString + ". Second String's length is " + secondString.length());
        System.out.println("The second string is " + secondString + ". Second String's first character is "
                + secondString.charAt(0));

        String myUniversity = "attends Hampton University";
        String myName = "Steven Alexander";
        String myVar1 = myUniversity.toLowerCase();
        System.out.println("\nmyVar1 in lowercase: " + myVar1);// prints myUniversity to lowercase

        String myVar2 = myVar1.replace('i', '&'), myVar3;
        System.out.println("\nmyVar1 with i's replaced: " + myVar2);

        myVar3 = myName + myUniversity;
        System.out.println(myVar3);
        System.out.println("\nmyVar3 @ location 3: " + myVar3.charAt(2));

        // find instances where myUniversity contains the letter 'm'
        // am looking for a specific index that contains 'm' return when finished
        char[] univeristyArray = myUniversity.toCharArray();// parses myUniveristy String to character array
        for (int i = 0; i <= univeristyArray.length - 1; i++) {

            if (univeristyArray[i] == 'm') {
                System.out.println("\nfor myUniversity, \'m\' occurs at index " + i);
            }

        }

        String myVar4 = myUniversity.substring(7, 15);
        System.out.println("The value of myVar4 is " + myVar4);

        // Part C -- Cube Volume and Surface Area
        int length = 10, width = 8, height = 5;
        int surface = (3 * width * height) + (2 * width * height) + (2 * height * length);
        int volume = (width * height * length);

        System.out.println("\nPart C: \"Cube Volume and Surface Area\"");
        System.out.println("Enter length, width, and height pf of the cubic box: ");
        length = keyboard.nextInt();
        width = keyboard.nextInt();
        height = keyboard.nextInt();

        System.out.println("The box is " + length + " inches long, " + width + " inches wide, and " + height
                + " inches high. " + "\nThe surface area of the box is " + surface + " square inches and its volume is "
                + volume + " cubic inches ");

        keyboard.close();// Closes keyboard
    }
}