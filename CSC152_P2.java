import java.util.Random;
import java.util.Scanner;

public class CSC152_P2 {
    public static void main(String[] args) {
        /*
         * Create 5 objects: one for each constructor (1 Person object, 2 Student
         * objects, and 2 Faculty objects) [Person will have a default money, and then
         * you need to use random number to generate any number between 300 and 800 for
         * other objects – make sure to re-generate the value for each object] SHOULD
         * NOT have repeated name. Hard-Code the information in your driver, DO NOT ask
         * anything from Keyboard!!!
         * 
         */

        final int min = 30;
        final int max = 50;

        /* Creates 5 new objects */
        Person aPerson = new Person("Bob", "Builder", 1970);// creates new person object
        Student2 aStudent = new Student2("Steven", "Alexander", 1998, 50000, "Communications", 3.45) ;// creates new student object
        Student2 bStudent = new Student2("Brook", "Addisu", 1998, 30000, "Entrepreneurship", 3.50);// creates new student object
        Faculty aFaculty = new Faculty("Chituma", "Boontum", 1960, 45000, "Computer Science", "Professor");// creates new Faculty object
        Faculty bFaculty = new Faculty("James", "Ford", 1955, 50000, "Scripps", "Professor");// creates new faculty object

        /* Prints objects */
        System.out.println(aPerson.toString());
        System.out.println(aStudent.toString());
        System.out.println(bStudent.toString());
        System.out.println(aFaculty.toString());
        System.out.println(bFaculty.toString());

        /* switch Major */
        System.out.println("Enter the new major for the second student: ");
        Scanner keyboard = new Scanner(System.in);// allows keyboard input
        String newMajor = keyboard.nextLine();
        bStudent.switchMajor(newMajor);
        System.out.println(bStudent.getMajor());// print status of current object 

        /* shop */
        bStudent.shop("25");
        System.out.println(bStudent.toString());// print status of current object 
        
        /* work */
        int hours = (int) (Math.random() * (max - min + 1) + min);// range between 30 and 50
        bStudent.work(hours, 12.50);
        System.out.println(bStudent.toString());// print status of current object 
    }
}