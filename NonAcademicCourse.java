/**
 * This is a child class which inherits the parent class (Course)
 * 
 * @author (Bikal Dhimal)
 * @Date (23 July, 2021)
 */
public class NonAcademicCourse extends Course {
    // Instance variables / attributes
    private String instructorName;
    private String startDate;
    private String completionDate;
    private String examDate;
    private String prerequisite;
    private boolean isRegistered;
    private boolean isRemoved;

    // Creating Constructor
    public NonAcademicCourse(String courseID, String courseName, int courseDuration, String prerequisite) {
        super(courseID, courseName, courseDuration);
        this.prerequisite = prerequisite;
        this.instructorName = "";
        this.startDate = "";
        this.completionDate = "";
        this.examDate = "";
        this.isRegistered = false;
        this.isRemoved = false;
    }

    // Creating accessor(get) method of each of the attributes
    public String getInstructorName() {
        return instructorName;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getCompletionDate() {
        return completionDate;
    }

    public String getExamDate() {
        return examDate;
    }

    public String getPrerequisite() {
        return prerequisite;
    }

    public boolean getIsRegistered() {
        return isRegistered;
    }

    public boolean getIsRemoved() {
        return isRemoved;
    }

    // Creating set method of Instructor for accepting the new value if not
    // registered
    public void setInstructorName(String instructorName) {
        if (isRegistered == false) {
            this.instructorName = instructorName;
            System.out.println("Instructor Name: " + this.instructorName);
        } else {
            System.out
                    .println("The Course has already been registered. Therefore, unable to change the Instructor Name");
        }
    }

    // Creating register method
    public void register(String courseLeader, String instructorName, String startDate, String completionDate,
            String examDate) {
        if (this.isRegistered == false) {
            this.instructorName = instructorName;
            super.setCourseLeader(courseLeader);
            this.startDate = startDate;
            this.completionDate = completionDate;
            this.examDate = examDate;
            isRegistered = true;
        } else {
            System.out.println("The course has already been registered.");
        }
    }

    // Creating remove method
    public void remove() {
        if (this.isRemoved == true) {
            System.out.println("You are not assigned to this course.");
        } else {
            super.setCourseLeader("");
            instructorName = "";
            startDate = "";
            completionDate = "";
            examDate = "";
            isRemoved = true;
            isRegistered = false;
        }
    }

    // Creating Display method
    public void display() {
        super.display();
        if (isRegistered == true) {
            System.out.print("Prerequisite: " + getPrerequisite());
            System.out.println("Instructor Name: " + getInstructorName());
            System.out.println("Starting Date: " + getStartDate());
            System.out.println("Completion Date: " + getCompletionDate());
            System.out.println("Exam Date: " + getExamDate());
        }
    }
} // NonAcademicCourse class closed
