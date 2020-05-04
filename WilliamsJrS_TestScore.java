public class WilliamsJrS_TestScore
{
    private String courseName;
    private double courseScore;

    public WilliamsJrS_TestScore()
    {

    }
    
    public void setCourseName (String newName)
    {
        courseName = newName;// passes in newName and sets it to the courseName
    }

    public void setCourseScore (double newS)
    {
        courseScore = newS;// passes in the newScore and set it to the courseScore
    }

    public String getCourseName()
    {
        return courseName;// returns the courseName
    }

    public double getCourseScore()
    {
        return courseScore;// returns the courseScore
    }
}