/**
 * This is a parent class which is inherited by two other classes (AcademicCourse and NonAcademicCourse)
 * @author (Bikal Dhimal)
 * @Date (23 July, 2021)
 */
public class Course
{
    // Instance Variables / Attributes
    private String courseID;
    private String courseName;
    private String courseLeader;
    private int courseDuration;

    // Creating Constructor
    public Course(String courseID, String courseName, int courseDuration) {
        this.courseID = courseID; // this. --> invokes current class instance variables
        this.courseName = courseName;
        this.courseLeader = "";
        this.courseDuration = courseDuration;
    }

    // Creating accessor(get) methods of all the attributes
    public String getCourseID(){
        return courseID;
    }
    public String getCourseName(){
        return courseName;
    }
    public String getCourseLeader(){
        return courseLeader;
    }
    public int getCourseDuration(){
        return courseDuration;
    }

    // Creating mutator(set) method of courseLeader
    public void setCourseLeader(String courseLeader){
        this.courseLeader = courseLeader;
    }

    // Creating display method
    public void display(){
        System.out.println("Course ID: "+getCourseID());      // get method is used for calling the value stored in instance variable
        System.out.println("Course Name: "+getCourseName());  
        System.out.println("Course Duration: "+getCourseDuration()+" year(s)");
        // applying condition
        if(!courseLeader.equals("")){
            System.out.println("Course Leader: "+getCourseLeader());  // a print statement
        }else{
            System.out.println("The name of the Course Leader is not available right now. \n" +"Thank you.");
        }
    }
}   // Course class closed
