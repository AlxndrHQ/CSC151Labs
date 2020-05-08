import java.text.DecimalFormat;// import decimal format


public class WilliamsJrS_Student
{
    DecimalFormat desiFormat = new DecimalFormat("##.##");// creates new decimal format object 

    private String name;
    private String major;
    private String classification;
    private double gpa;

    public WilliamsJrS_Student(String aName, String aMajor, String aClass)
    {
        name = aName;
        major = aMajor;
        classification = aClass;
    }
    
    public String getName ( )
    {
        return name;
    }

    public String getMajor ( )
    {
        return major;
    }

    public String checkClassification ( )
    {
        return classification;
    }

    public double getGPA ( )
    {
        return gpa;
    }
    
    public void setName (String newName)
    {
        name = newName;
    }

    public void switchMajor (String newMajor)
    {
        major = newMajor;
    }

    public void updateClassification ( String newClass)
    {
        classification = newClass;
    }

    public void changeGPA (double newGPA)
    {
        gpa = newGPA;
    }

    public void calculateGPA (double grade1, double grade2, double grade3, double grade4, double grade5, double grade6)
    {
        /* 
        Example:
                3 points Math course with grade of 80.
                5 points Biology course with grade of 90.
                2 points History course with grade of 72.
        
        Weighted grade = (w1×g1+ w2×g2+ w3×g3) / (w1+w2+w3)
                       = (3×80+ 5×90+ 2×72) / (3+5+2) = 83.4
        */
        gpa = ((3 * grade1) + (3 * grade2) + (3 * grade3) + (4 * grade4) + (2 * grade5) + (1 * grade6)) / (3 + 3 + 3 + 4 + 2 + 1);
        
        //desiFormat.format(gpa);
    }

    public String toString( )
    {
        return "\n\tName: " + name + "\n\t" + "Major: " + major + "\n\t" + "Classification: " + classification + "\n\t" + "GPA: " + desiFormat.format(gpa);
    }
}