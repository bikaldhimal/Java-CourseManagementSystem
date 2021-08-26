/**
 * This is a child class which inherits the parent class (Course)
 * @author (Bikal Dhimal)
 * @Date (23 July, 2021)
 */
public class AcademicCourse extends Course
{
    // Instance Variables / Attributes
    private String lecturerName;
    private String level;
    private String credit;
    private String startingDate;
    private String completionDate;
    private int numberOfAssessments;
    private boolean isRegistered;
    
    // Creating Constructor
    public AcademicCourse(String courseID, String courseName, int courseDuration, String level, String credit, int numberOfAssessments){
        super(courseID, courseName, courseDuration); // Invoking the parent class variables
        this.level = level;                          // this. --> invokes current class instance variables
        this.credit = credit;
        this.numberOfAssessments = numberOfAssessments;
        this.lecturerName = "";
        this.startingDate = "";
        this.completionDate = "";
        this.isRegistered = false;
    }
    
    // Creating accessor method of each of the attributes
    public String getLecturerName(){
        return lecturerName;
    }
    public String getLevel(){
        return level;
    }
    public String getCredit(){
        return credit;
    }
    public String getStartingDate(){
        return startingDate;
    }
    public String getCompletionDate(){
        return completionDate;
    }
    public int getNumberOfAssessments(){
        return numberOfAssessments;
    }
    public boolean getIsRegistered(){
        return isRegistered;
    }
    
    // Creating mutator(set) method
    public void setLecturerName(String lecturerName){
        this.lecturerName = lecturerName;
    }
    public void setNumberOfAssessments(int numberOfAssessments){
        this.numberOfAssessments = numberOfAssessments;
    }
    
    // Creating register method
    public void register(String courseLeader, String lecturerName, String startingDate, String completionDate){
        // applying condition
        if(isRegistered == true){
            System.out.println("The name of the lecturer is "+getLecturerName());   
            System.out.println("The starting date of the course is "+getStartingDate());
            System.out.println("The completion date of the course is "+getCompletionDate());
        }else{
            super.setCourseLeader(courseLeader);
            this.lecturerName = lecturerName;
            this.startingDate = startingDate;
            this.completionDate = completionDate;
            this.isRegistered = true;
        }
    }    
    
    // Creating display method --> same signature as parent class
    public void display(){
        super.display();
        if(isRegistered == true){
            System.out.println("Lecturer Name: "+getLecturerName());   // a print statement
            System.out.println("Level: "+getLevel());         // get method is used for calling the value stored in instance variable
            System.out.println("Credit: "+getCredit()+" hours");
            System.out.println("Starting Date: "+getStartingDate());
            System.out.println("Completion Date: "+getCompletionDate());
            System.out.println("Number Of Assessment: "+getNumberOfAssessments());
        }
    }
}   // AcademicCourse class closed
