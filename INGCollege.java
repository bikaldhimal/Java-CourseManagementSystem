
/**
 * This is a class which contain array list and stores Academic and Non-Academic Course
 * @author (Bikal Dhimal)
 * @Date (23 July, 2021)
 */
/** Importing Some suitable Packages of Java **/
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.BorderFactory;
import javax.swing.JTextArea;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class INGCollege {
    /**
     * An Array List start // An arraylist of Course type for storing Academic and
     * Non=Academic Course accordingly
     **/
    ArrayList<Course> myArrayList = new ArrayList<Course>();
    /** An Array List End **/

    /** Variable Declaration Start **/
    private JFrame selectionFrame, frame, areYouSure, areYouSureNonAcademic, nonAcademicFrame, academicRegister,
            nonAcademicRegister, displayFrame, removeNonAcademicFrame, removeNonAcademicFrameNow,
            display_Frame_NonAcademic;
    private JTextField txtCourseID, txtCourseName, txtCourseDuration, txtLecturerName, txtCourseLeader, txtLevel,
            txtCredit, txtAssessment, txtStartingDate, txtCompletionDate, txtPrerequisite, courseIDTxt, courseNameTxt,
            courseDurationTxt, txtCourse_ID, txt_Course_ID, txt_Removeable_CourseID, txt_Course_ID_NonAcademic,
            txt_Course_Id_, txt_CourseLeader, txt_InstructorName, txt_StartingDate, txt_CompletionDate, txt_ExamDate;
    // txtInstructorName, txt_Course_ID_, txtExamDate;
    private JTextArea nesteddisplayArea, displayArea, nesteddisplayAreaNonAcademic, displayArea_NonAcademic;
    private JButton displayButton, register_Button, register_Btn_, remove_Btn;
    // registerButton,

    /** Variable Declaration End **/

    /** Getter Method of TextFields Start */
    // Academic ADD
    public String getTxtCourseID() {
        return txtCourseID.getText();
    }

    public String getTxtCourseName() {
        return txtCourseName.getText();
    }

    public String getTxtCourseDuration() {
        return txtCourseDuration.getText();
    }

    public String getTxtLevel() {
        return txtLevel.getText();
    }

    public String getTxtCredit() {
        return txtCredit.getText();
    }

    public String getTxtAssessment() {
        return txtAssessment.getText();
    }

    // Academic Register
    public String getTxtCourse_ID() {
        return txtCourse_ID.getText();
    }

    public String getTxtCourseLeader() {
        return txtCourseLeader.getText();
    }

    public String getTxtLecturerName() {
        return txtLecturerName.getText();
    }

    public String getTxtStartingDate() {
        return txtStartingDate.getText();
    }

    public String getTxtCompletionDate() {
        return txtCompletionDate.getText();
    }

    // Academic Display
    public String getTxt_Course_ID() {
        return txt_Course_ID.getText();
    }

    // Non Academic Add
    public String getCourseIDTxt() {
        return courseIDTxt.getText();
    }

    public String getCourseNameTxt() {
        return courseNameTxt.getText();
    }

    public String getCourseDurationTxt() {
        return courseDurationTxt.getText();
    }

    public String getTxtPrerequisite() {
        return txtPrerequisite.getText();
    }

    // Non Academic Register
    public String getTxt_Course_Id_() {
        return txt_Course_Id_.getText();
    }

    public String getTxt_CourseLeader() {
        return txt_CourseLeader.getText();
    }

    public String getTxt_InstructorName() {
        return txt_InstructorName.getText();
    }

    public String getTxt_StartingDate() {
        return txt_StartingDate.getText();
    }

    public String getTxt_CompletionDate() {
        return txt_CompletionDate.getText();
    }

    public String getTxt_ExamDate() {
        return txt_ExamDate.getText();
    }

    // Non Academic Display
    public String getTxt_Course_ID_NonAcademic() {
        return txt_Course_ID_NonAcademic.getText();
    }

    // Non Academic Remove
    public String getTxt_Removeable_CourseID() {
        return txt_Removeable_CourseID.getText();
    }

    /** Getter Method of TextFields End */

    /** Course Selection GUI Start **/
    public void courseSelectionGui() {
        /** fonts **/
        Font f0 = new Font("Gurmukhi MN", Font.BOLD, 36);
        Font f01 = new Font("Kannada MN", Font.BOLD, 24);
        Font f02 = new Font("Malayalam MN", Font.PLAIN, 16);

        /** Background Colors **/
        Color backgroundOfSelection = new Color(30, 45, 51);
        Color bgAcademic = new Color(72, 116, 84);
        Color bgNonAcademic = new Color(49, 109, 131);

        selectionFrame = new JFrame("Course Selection");
        selectionFrame.getContentPane().setBackground(backgroundOfSelection);

        JLabel labelSelectCourse = new JLabel("Select The Course");
        labelSelectCourse.setBounds(210, 50, 370, 48);
        labelSelectCourse.setFont(f0);
        labelSelectCourse.setForeground(Color.WHITE);
        selectionFrame.add(labelSelectCourse);

        JButton academicSelectBtn = new JButton("Academic");
        academicSelectBtn.setBounds(245, 150, 256, 77);
        academicSelectBtn.setFont(f01);
        academicSelectBtn.setBackground(bgAcademic);
        academicSelectBtn.setForeground(Color.WHITE);
        academicSelectBtn.setBorder(BorderFactory.createRaisedBevelBorder());
        academicSelectBtn.setOpaque(true);
        selectionFrame.add(academicSelectBtn);
        academicSelectBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent academicSelected) {
                academicForm();
                selectionFrame.setVisible(false);
            }
        });

        JButton nonAcademicSelectBtn = new JButton("Non-Academic");
        nonAcademicSelectBtn.setBounds(245, 250, 256, 77);
        nonAcademicSelectBtn.setFont(f01);
        nonAcademicSelectBtn.setBackground(bgNonAcademic);
        nonAcademicSelectBtn.setForeground(Color.WHITE);
        nonAcademicSelectBtn.setBorder(BorderFactory.createRaisedBevelBorder());
        nonAcademicSelectBtn.setOpaque(true);
        selectionFrame.add(nonAcademicSelectBtn);
        nonAcademicSelectBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent nonAcademicSelected) {
                nonAcademicForm();
                selectionFrame.setVisible(false);
            }
        });

        JLabel footerLabel = new JLabel("Copyright 2021, Bikal Dhimal");
        footerLabel.setBounds(265, 420, 263, 27);
        footerLabel.setFont(f02);
        footerLabel.setForeground(Color.WHITE);
        selectionFrame.add(footerLabel);

        selectionFrame.setLayout(null);
        selectionFrame.setSize(740, 492);
        selectionFrame.setResizable(false);
        selectionFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        selectionFrame.setLocationRelativeTo(null);
        selectionFrame.setVisible(true);
    }

    /** Course Selection GUI End **/

    /** Academic Section Start **/
    /** Academic Course Form Start **/
    public void academicForm() {
        /** Font Colors **/
        // Font f1 = new Font("Courier New", Font.PLAIN, 18);
        Font f2 = new Font("Poppins", Font.BOLD, 18);
        Font f3 = new Font("Poppins", Font.PLAIN, 16);
        Font f4 = new Font("Poppins", Font.BOLD, 16);

        /** Background Colors **/
        // Color myTextField = new Color(81, 94, 100);
        Color myDarkBlue = new Color(30, 45, 51);
        Color myGreen = new Color(68, 150, 91);
        Color myRed = new Color(214, 88, 88);
        Color mySkyBlue = new Color(177, 206, 240);
        Color myLabelColor = new Color(247, 247, 247);
        Color myButton = new Color(6, 95, 160);
        // Color myTopHeadline = new Color(114, 114, 114);
        Color myRegisterButton = new Color(185, 0, 0);

        frame = new JFrame("Course Registration");
        frame.getContentPane().setBackground(myDarkBlue);

        JLabel labelAcademicCourse = new JLabel("ACADEMIC COURSE");
        labelAcademicCourse.setBounds(150, 50, 229, 25);
        labelAcademicCourse.setFont(f2);
        labelAcademicCourse.setForeground(mySkyBlue);
        frame.add(labelAcademicCourse);

        JLabel labelCourseID = new JLabel("CourseID: ");
        labelCourseID.setBounds(60, 110, 110, 23);
        labelCourseID.setFont(f3);
        labelCourseID.setForeground(myLabelColor);
        frame.add(labelCourseID);

        txtCourseID = new JTextField();
        txtCourseID.setBounds(250, 103, 163, 38);
        txtCourseID.setBackground(Color.WHITE);
        txtCourseID.setForeground(Color.BLACK);
        frame.add(txtCourseID);

        JLabel labelCourseName = new JLabel("Course Name: ");
        labelCourseName.setBounds(60, 160, 133, 23);
        labelCourseName.setFont(f3);
        labelCourseName.setForeground(myLabelColor);
        frame.add(labelCourseName);

        txtCourseName = new JTextField();
        txtCourseName.setBounds(250, 153, 163, 38);
        txtCourseName.setBackground(Color.WHITE);
        txtCourseName.setForeground(Color.BLACK);
        frame.add(txtCourseName);

        JLabel labelCourseDuration = new JLabel("Course Duration: ");
        labelCourseDuration.setBounds(60, 210, 147, 23);
        labelCourseDuration.setFont(f3);
        labelCourseDuration.setForeground(myLabelColor);
        frame.add(labelCourseDuration);

        txtCourseDuration = new JTextField();
        txtCourseDuration.setBounds(250, 203, 163, 38);
        txtCourseDuration.setBackground(Color.WHITE);
        txtCourseDuration.setForeground(Color.BLACK);
        frame.add(txtCourseDuration);

        JLabel labelLevel = new JLabel("Level: ");
        labelLevel.setBounds(60, 260, 147, 23);
        labelLevel.setFont(f3);
        labelLevel.setForeground(myLabelColor);
        frame.add(labelLevel);

        txtLevel = new JTextField();
        txtLevel.setBounds(250, 253, 163, 38);
        txtLevel.setBackground(Color.WHITE);
        txtLevel.setForeground(Color.BLACK);
        frame.add(txtLevel);

        JLabel labelCredit = new JLabel("Credit: ");
        labelCredit.setBounds(60, 310, 62, 23);
        labelCredit.setFont(f3);
        labelCredit.setForeground(myLabelColor);
        frame.add(labelCredit);

        txtCredit = new JTextField();
        txtCredit.setBounds(250, 303, 163, 38);
        txtCredit.setBackground(Color.WHITE);
        txtCredit.setForeground(Color.BLACK);
        frame.add(txtCredit);

        JLabel labelAssessment = new JLabel("No. Of Assessment: ");
        labelAssessment.setBounds(60, 360, 170, 23);
        labelAssessment.setFont(f3);
        labelAssessment.setForeground(myLabelColor);
        frame.add(labelAssessment);

        txtAssessment = new JTextField();
        txtAssessment.setBounds(250, 353, 163, 38);
        txtAssessment.setBackground(Color.WHITE);
        txtAssessment.setForeground(Color.BLACK);
        frame.add(txtAssessment);

        /** Add Button **/
        JButton addButton = new JButton("ADD");
        addButton.setBounds(250, 413, 163, 38);
        addButton.setBackground(myButton);
        addButton.setOpaque(true);
        addButton.setFont(f4);
        addButton.setForeground(Color.WHITE);
        addButton.setBorder(BorderFactory.createRaisedBevelBorder());
        frame.add(addButton);
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent addition) {
                boolean flag = false;
                String courseID = getTxtCourseID();
                String courseName = getTxtCourseName();
                String courseDurationString = getTxtCourseDuration();
                String level = getTxtLevel();
                String credit = getTxtCredit();
                String assessmentString = getTxtAssessment();

                // Declaring Integer variable for exception Handling
                int courseDuration, assessment;
                // Checking if text fileds in AcademicCourse form is empty or not
                if (courseID.equals("") || courseName.equals("") || level.equals("") || credit.equals("")
                        || courseDurationString.equals("") || assessmentString.equals("")) {
                    // If textfields are empty than show this message
                    JOptionPane.showMessageDialog(null, "Please fill all the fields", "Text field is empty", 0);
                    return;
                } else {
                    // Checking if arraylist is empty ?
                    if (myArrayList.isEmpty()) {
                        flag = true;
                    } else {
                        for (Course course : myArrayList) {
                            // first one is method of parent class(Course) and checking it with textField
                            if (course.getCourseID().equals(getTxtCourseID())) {
                                JOptionPane.showMessageDialog(null, courseID + " is already registered", "Duplicate",
                                        0);
                                return;
                            } else {
                                flag = true;
                            }
                        }
                    }
                    try {
                        courseDuration = Integer.parseInt(courseDurationString);
                    } catch (NumberFormatException nfe) {
                        JOptionPane.showMessageDialog(null, "Duration must be a numeric value", "Invalid Duration", 0);
                        return;
                    }
                    try {
                        assessment = Integer.parseInt(assessmentString);
                    } catch (NumberFormatException nfe) {
                        JOptionPane.showMessageDialog(null, "Assessment must be a numeric value", "Invalid Assessment",
                                0);
                        return;
                    }

                    if (flag == true) {
                        // Storing object of Academic Course in Array List (Upcasting)
                        myArrayList.add(
                                new AcademicCourse(courseID, courseName, courseDuration, level, credit, assessment));
                        clearAcademic();
                        register_Button.setEnabled(true);
                        JOptionPane.showMessageDialog(null,
                                "The Course ID " + courseID + " has been added successfully", "Status", 1);
                        return;
                    }
                }
            }
        });

        /** Clear Button **/
        JButton clearButton = new JButton("Clear");
        clearButton.setBounds(250, 478, 163, 38);
        clearButton.setFont(f4);
        clearButton.setBackground(myRed);
        clearButton.setForeground(Color.WHITE);
        clearButton.setBorder(BorderFactory.createRaisedBevelBorder());
        clearButton.setOpaque(true);
        frame.add(clearButton);
        clearButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent clearing) {
                clearAcademic();
            }
        });

        /** Display Button **/
        displayButton = new JButton("Display");
        displayButton.setBounds(60, 478, 163, 38);
        displayButton.setFont(f4);
        displayButton.setForeground(Color.WHITE);
        displayButton.setBorder(BorderFactory.createRaisedBevelBorder());
        displayButton.setBackground(myGreen);
        displayButton.setOpaque(true);
        frame.add(displayButton);
        displayButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent display) {
                // Calling display method for showing Display Frame
                displayAcademicCourse();
                frame.setVisible(false);
            }
        });

        /** Back Button **/
        JButton backButton = new JButton("Back");
        backButton.setBounds(60, 543, 82, 38);
        backButton.setFont(f4);
        backButton.setForeground(Color.WHITE);
        backButton.setBorder(BorderFactory.createRaisedBevelBorder());
        backButton.setBackground(new Color(150, 150, 44));
        backButton.setOpaque(true);
        frame.add(backButton);
        backButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent back) {
                courseSelectionGui();
                frame.setVisible(false);
            }
        });

        /** Register Button **/
        register_Button = new JButton("Register");
        register_Button.setBounds(250, 543, 163, 38);
        register_Button.setFont(f4);
        register_Button.setForeground(Color.WHITE);
        register_Button.setBorder(BorderFactory.createRaisedBevelBorder());
        register_Button.setBackground(myRegisterButton);
        register_Button.setOpaque(true);
        register_Button.setEnabled(true);
        frame.add(register_Button);
        register_Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent register) {
                frame.dispose();
                areYouSureRegister();
            }
        });

        frame.setLayout(null);
        frame.setSize(480, 660);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    /** Academic Course Form End **/

    /** Academic Register Form Start **/
    public void academicRegister() {
        /** Font Colors **/
        Font f7 = new Font("Poppins", Font.BOLD, 18);
        Font f8 = new Font("Poppins", Font.PLAIN, 16);
        Font f9 = new Font("Poppins", Font.BOLD, 16);

        /** Background Colors **/
        Color myTextField = new Color(81, 94, 100);
        Color myacademicRegister = new Color(30, 45, 51);
        Color skyBlue = new Color(177, 206, 240);
        Color labelColor = new Color(247, 247, 247);
        Color buttonColor = new Color(6, 95, 160);
        Color btnBackColor = new Color(150, 150, 44);

        academicRegister = new JFrame();
        academicRegister.getContentPane().setBackground(myacademicRegister);

        JLabel labelTitle = new JLabel("ACADEMIC COURSE");
        labelTitle.setBounds(155, 30, 229, 25);
        labelTitle.setFont(f7);
        labelTitle.setForeground(skyBlue);
        academicRegister.add(labelTitle);

        JLabel labelCourse_ID = new JLabel("Course ID: ");
        labelCourse_ID.setBounds(60, 80, 96, 23);
        labelCourse_ID.setForeground(labelColor);
        labelCourse_ID.setFont(f8);
        academicRegister.add(labelCourse_ID);

        txtCourse_ID = new JTextField();
        txtCourse_ID.setBounds(245, 73, 170, 38);
        txtCourse_ID.setBackground(myTextField);
        txtCourse_ID.setForeground(Color.WHITE);
        academicRegister.add(txtCourse_ID);

        JLabel labelCourseLeader = new JLabel("Course Leader: ");
        labelCourseLeader.setBounds(60, 130, 137, 23);
        labelCourseLeader.setFont(f8);
        labelCourseLeader.setForeground(labelColor);
        academicRegister.add(labelCourseLeader);

        txtCourseLeader = new JTextField();
        txtCourseLeader.setBounds(245, 123, 170, 38);
        txtCourseLeader.setBackground(myTextField);
        txtCourseLeader.setForeground(Color.WHITE);
        academicRegister.add(txtCourseLeader);

        JLabel labelLecturerName = new JLabel("Lecturer Name: ");
        labelLecturerName.setBounds(60, 180, 142, 23);
        labelLecturerName.setFont(f8);
        labelLecturerName.setForeground(labelColor);
        academicRegister.add(labelLecturerName);

        txtLecturerName = new JTextField();
        txtLecturerName.setBounds(245, 173, 170, 38);
        txtLecturerName.setBackground(myTextField);
        txtLecturerName.setForeground(Color.WHITE);
        academicRegister.add(txtLecturerName);

        JLabel labelStartingDate = new JLabel("Starting Date: ");
        labelStartingDate.setBounds(60, 230, 129, 23);
        labelStartingDate.setFont(f8);
        labelStartingDate.setForeground(labelColor);
        academicRegister.add(labelStartingDate);

        txtStartingDate = new JTextField();
        txtStartingDate.setBounds(245, 223, 170, 38);
        txtStartingDate.setBackground(myTextField);
        txtStartingDate.setForeground(Color.WHITE);
        academicRegister.add(txtStartingDate);

        JLabel labelCompletionDate = new JLabel("Completion Date: ");
        labelCompletionDate.setBounds(60, 280, 160, 23);
        labelCompletionDate.setForeground(labelColor);
        labelCompletionDate.setFont(f8);
        academicRegister.add(labelCompletionDate);

        txtCompletionDate = new JTextField();
        txtCompletionDate.setBounds(245, 273, 170, 38);
        txtCompletionDate.setBackground(myTextField);
        txtCompletionDate.setForeground(Color.WHITE);
        academicRegister.add(txtCompletionDate);

        /** Register Button **/
        JButton registerButton = new JButton("Register");
        registerButton.setBounds(245, 333, 170, 38);
        registerButton.setBackground(buttonColor);
        registerButton.setForeground(Color.WHITE);
        registerButton.setBorder(BorderFactory.createRaisedBevelBorder());
        registerButton.setOpaque(true);
        registerButton.setFont(f9);
        academicRegister.add(registerButton);
        registerButton.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent registering) {

                boolean flag = false;
                String course_ID = getTxtCourse_ID();
                String courseLeader = getTxtCourseLeader();
                String lecturerName = getTxtLecturerName();
                String startingDate = getTxtStartingDate();
                String completionDate = getTxtCompletionDate();

                if (course_ID.equals("") || courseLeader.equals("") || lecturerName.equals("")
                        || startingDate.equals("") || completionDate.equals("")) {
                    // If textfields are empty than show this message
                    JOptionPane.showMessageDialog(null, "Please fill all the fields", "Text field is empty", 0);
                    return;
                } else {
                    // Checking if arraylist is empty or not
                    if (myArrayList.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Please add the Course first", "Course list is empty", 2);
                        return;
                    } else {
                        // Iterating through arraylist
                        // class name variable name arraylist name
                        for (Course course : myArrayList) {
                            if (course instanceof AcademicCourse) {
                                if (course.getCourseID().equals(course_ID)) {
                                    // Downcasting
                                    AcademicCourse academic_Course = (AcademicCourse) course;
                                    // Checking if entered academic course is registered or not?
                                    if (academic_Course.getIsRegistered()) {
                                        JOptionPane.showMessageDialog(null,
                                                "The course " + course_ID + " is already registered",
                                                "Duplicate Course", 2);
                                        return;
                                    } else {
                                        academic_Course.register(courseLeader, lecturerName, startingDate,
                                                completionDate);
                                        txtFieldNullAcademicRegister();
                                        JOptionPane.showMessageDialog(null,
                                                "The Course ID " + course_ID + " has been registered successfully",
                                                "Registered", 1);

                                        return;
                                    }
                                } else {
                                    flag = true;
                                }
                            }

                        }
                        if (flag == true) {
                            JOptionPane.showMessageDialog(null, "The Course ID " + course_ID + " Is Invalid",
                                    "Invalid Course ID", 0);
                            return;
                        }
                    }
                }
            }
        });

        /** Back Button **/
        JButton btnBack = new JButton("Back");
        btnBack.setBounds(60, 333, 88, 38);
        btnBack.setFont(f9);
        btnBack.setBackground(btnBackColor);
        btnBack.setForeground(Color.WHITE);
        btnBack.setBorder(BorderFactory.createRaisedBevelBorder());
        btnBack.setOpaque(true);
        academicRegister.add(btnBack);
        btnBack.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent back) {
                academicRegister.dispose();
                academicForm();
                register_Button.setEnabled(true);
            }

        });

        academicRegister.setLayout(null);
        academicRegister.setSize(480, 430);
        academicRegister.setResizable(false);
        academicRegister.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        academicRegister.setLocationRelativeTo(null);
        academicRegister.setVisible(true);
    }

    /** Academic Register Form End **/

    /** Display Frame of AcademicCourse Start **/
    public void displayAcademicCourse() {
        /** Fonts **/
        Font fMalyalam = new Font("Malayalam MN", Font.PLAIN, 29);
        Font fPoppins = new Font("Poppins", Font.BOLD, 16);
        Font fOria = new Font("Oriya MN", Font.BOLD, 22);
        Font fKannada = new Font("Kannada MN", Font.PLAIN, 18);

        /** Background Colors **/
        Color mainBackground = new Color(18, 90, 119);
        Color displayBtnColor = new Color(68, 150, 91);
        Color backBtnColor = new Color(150, 150, 44);
        Color textAreaColor = new Color(213, 213, 213);
        Color clearBtnColor = new Color(214, 88, 88);

        displayFrame = new JFrame("Academic Course Display");
        displayFrame.getContentPane().setBackground(mainBackground);

        JLabel label_Course_ID = new JLabel("Course ID:");
        label_Course_ID.setBounds(228, 90, 152, 36);
        label_Course_ID.setFont(fMalyalam);
        label_Course_ID.setForeground(Color.WHITE);
        displayFrame.add(label_Course_ID);

        txt_Course_ID = new JTextField();
        txt_Course_ID.setBounds(388, 85, 261, 46);
        txt_Course_ID.setFont(fOria);
        txt_Course_ID.setBackground(Color.WHITE);
        txt_Course_ID.setForeground(new Color(18, 90, 119));
        displayFrame.add(txt_Course_ID);

        JButton display_AcademicBtn = new JButton("Display");
        display_AcademicBtn.setBounds(530, 150, 116, 53);
        display_AcademicBtn.setFont(fPoppins);
        display_AcademicBtn.setBackground(displayBtnColor);
        display_AcademicBtn.setForeground(Color.WHITE);
        display_AcademicBtn.setOpaque(true);
        display_AcademicBtn.setBorder(BorderFactory.createRaisedBevelBorder());
        displayFrame.add(display_AcademicBtn);
        display_AcademicBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent display) {
                boolean flag = false;
                String course_ID_ = getTxt_Course_ID();

                if (myArrayList.isEmpty()) {
                    JOptionPane.showMessageDialog(null,
                            "No any Course registered yet, Please add & register the course", "Empty Course List", 0);
                    return;
                } else {
                    for (Course course : myArrayList) {
                        if (course.getCourseID().equals(course_ID_)) {
                            if (course instanceof AcademicCourse) {
                                // Downcasting
                                AcademicCourse academicCourse = (AcademicCourse) course;

                                if (academicCourse.getIsRegistered()) {
                                    academicCourse.display();
                                    nesteddisplayArea.setText("Course ID: " + academicCourse.getCourseID() + "\n"
                                            + "Course Name: " + academicCourse.getCourseName() + "\n"
                                            + "Course Duration: " + academicCourse.getCourseDuration() + " year(s)"
                                            + "\n" + "Course Leader: " + academicCourse.getCourseLeader() + "\n"
                                            + "Lecturer Name: " + academicCourse.getLecturerName() + "\n" + "Level: "
                                            + academicCourse.getLevel() + "\n" + "Credit: " + academicCourse.getCredit()
                                            + " hours" + "\n" + "Starting Date: " + academicCourse.getStartingDate()
                                            + "\n" + "Completion Date: " + academicCourse.getCompletionDate() + "\n"
                                            + "Number Of Assessment: " + academicCourse.getNumberOfAssessments());
                                    return;
                                } else {
                                    academicCourse.display();
                                    nesteddisplayArea.setText("Course ID: " + course.getCourseID() + "\n"
                                            + "Course Name: " + course.getCourseName() + "\n" + "Course Duration: "
                                            + course.getCourseDuration() + "\n"
                                            + "The name of the Course Leader is not available right now. \n"
                                            + "Thank you.");
                                    register_Button.setEnabled(true);
                                }

                            }
                        } else {
                            flag = true;
                            register_Button.setEnabled(true);
                        }
                    }
                    if (flag == true) {
                        clearDisplayAreaAcademic();
                        register_Button.setEnabled(true);
                        JOptionPane.showMessageDialog(null, "The Course ID " + course_ID_ + " Is Invalid",
                                "Invalid Course ID", 2);
                        return;
                    }
                }

            }
        });

        nesteddisplayArea = new JTextArea();
        nesteddisplayArea.setBounds(88, 283, 528, 308);
        nesteddisplayArea.setBackground(textAreaColor);
        nesteddisplayArea.setFont(fKannada);
        nesteddisplayArea.setForeground(Color.BLACK);
        nesteddisplayArea.setEditable(false);
        displayFrame.add(nesteddisplayArea);

        displayArea = new JTextArea();
        displayArea.setBounds(55, 250, 593, 374);
        displayArea.setBackground(textAreaColor);
        displayArea.setEditable(false);
        displayFrame.add(displayArea);

        JButton btn_Clear = new JButton("Clear");
        btn_Clear.setBounds(532, 645, 116, 53);
        btn_Clear.setFont(fPoppins);
        btn_Clear.setBackground(clearBtnColor);
        btn_Clear.setForeground(Color.WHITE);
        btn_Clear.setOpaque(true);
        btn_Clear.setBorder(BorderFactory.createRaisedBevelBorder());
        displayFrame.add(btn_Clear);
        btn_Clear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent clear) {
                clearDisplayAreaAcademic();
            }
        });

        JButton btn_Back = new JButton("Back");
        btn_Back.setBounds(58, 725, 94, 38);
        btn_Back.setFont(fPoppins);
        btn_Back.setBackground(backBtnColor);
        btn_Back.setForeground(Color.WHITE);
        btn_Back.setOpaque(true);
        btn_Back.setBorder(BorderFactory.createRaisedBevelBorder());
        displayFrame.add(btn_Back);
        btn_Back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent back) {
                academicForm();
                displayFrame.setVisible(false);
            }
        });

        displayFrame.setLayout(null);
        displayFrame.setSize(702, 811);
        displayFrame.setResizable(false);
        displayFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        displayFrame.setLocationRelativeTo(null);
        displayFrame.setVisible(true);
    }

    /** Display Frame of AcademicCourse End **/

    /** Are you sure Register Academic Course Start **/
    public void areYouSureRegister() {
        // Font
        Font f5 = new Font("Poppins", Font.PLAIN, 24);
        Font f6 = new Font("Poppins", Font.BOLD, 16);
        // Background
        Color sureBackground = new Color(30, 45, 51);
        Color areYouSureColor = new Color(81, 94, 100);
        Color yesColor = new Color(68, 150, 91);
        Color noColor = new Color(214, 88, 88);

        areYouSure = new JFrame();
        areYouSure.getContentPane().setBackground(sureBackground);

        JLabel labelAreYouSure = new JLabel("Are you sure, you want to register?");
        labelAreYouSure.setBounds(60, 30, 456, 53);
        labelAreYouSure.setFont(f5);
        labelAreYouSure.setForeground(Color.WHITE);
        labelAreYouSure.setBackground(areYouSureColor);
        areYouSure.add(labelAreYouSure);

        /** Yes Button **/
        JButton yesButton = new JButton("Yes");
        yesButton.setBounds(210, 120, 116, 53);
        yesButton.setFont(f6);
        yesButton.setForeground(Color.WHITE);
        yesButton.setBorder(BorderFactory.createRaisedBevelBorder());
        yesButton.setBackground(yesColor);
        yesButton.setOpaque(true);
        areYouSure.add(yesButton);
        yesButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent yes) {
                academicRegister();
                areYouSure.setVisible(false);
            }
        });

        /** No Button **/
        JButton noButton = new JButton("No");
        noButton.setBounds(210, 200, 116, 53);
        noButton.setFont(f6);
        noButton.setForeground(Color.WHITE);
        noButton.setBorder(BorderFactory.createRaisedBevelBorder());
        noButton.setBackground(noColor);
        noButton.setOpaque(true);
        areYouSure.add(noButton);
        noButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent no) {
                academicForm();
                areYouSure.setVisible(false);
            }
        });

        areYouSure.setLayout(null);
        areYouSure.setSize(538, 348);
        areYouSure.setResizable(false);
        areYouSure.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        areYouSure.setLocationRelativeTo(null);
        areYouSure.setVisible(true);
    }

    /** Are you sure Register Academic Course End **/

    /** Clearing Method for Academic Course **/
    public void clearAcademic() {
        txtCourseID.setText(null);
        txtCourseName.setText(null);
        txtCourseDuration.setText(null);
        txtLevel.setText(null);
        txtCredit.setText(null);
        txtAssessment.setText(null);
    }

    /** Clearing Method for Academic End **/

    /** Clear Methods for Display Frame for Academic Start **/
    // Clear Method of Display frame of Academic Course
    public void clearDisplayAreaAcademic() {
        txt_Course_ID.setText(null);
        nesteddisplayArea.setText(null);
    }

    /** Clear Methods for Display Frame for Academic End **/

    /** Text Field set to null of Academic Course Register Frame Start **/
    public void txtFieldNullAcademicRegister() {
        txtCourse_ID.setText(null);
        txtCourseLeader.setText(null);
        txtLecturerName.setText(null);
        txtStartingDate.setText(null);
        txtCompletionDate.setText(null);
    }

    /** Text Field set to null of Academic Course Register Frame End **/
    /** Academic Section Closed **/

    /** Non Academic Section Start **/
    /** Non-Academic Form Start **/
    public void nonAcademicForm() {
        /** Font Colors **/
        // Font f1 = new Font("Courier New", Font.PLAIN, 18);
        Font f2 = new Font("Poppins", Font.BOLD, 18);
        Font f3 = new Font("Poppins", Font.PLAIN, 16);
        Font f4 = new Font("Poppins", Font.BOLD, 16);
        Font f10 = new Font("Poppins", Font.BOLD, 16);

        /** Background Colors **/
        // Color myTextField = new Color(81, 94, 100);
        Color bgDarkBlue = new Color(30, 45, 51);
        Color myGreen = new Color(68, 150, 91);
        Color myRed = new Color(214, 88, 88);
        Color mySkyBlue = new Color(177, 206, 240);
        Color myLabelColor = new Color(247, 247, 247);
        Color myButton = new Color(6, 95, 160);
        Color myRegisterButton = new Color(185, 0, 0);
        Color btnRemoveColor = new Color(214, 127, 52);

        nonAcademicFrame = new JFrame("Course Registration");
        nonAcademicFrame.getContentPane().setBackground(bgDarkBlue);

        JLabel labelNonAcademicCourse = new JLabel("NON-ACADEMIC COURSE");
        labelNonAcademicCourse.setBounds(130, 50, 229, 25);
        labelNonAcademicCourse.setFont(f2);
        labelNonAcademicCourse.setForeground(mySkyBlue);
        nonAcademicFrame.add(labelNonAcademicCourse);

        JLabel labelCourseID = new JLabel("CourseID: ");
        labelCourseID.setBounds(60, 110, 110, 23);
        labelCourseID.setFont(f3);
        labelCourseID.setForeground(myLabelColor);
        nonAcademicFrame.add(labelCourseID);

        courseIDTxt = new JTextField();
        courseIDTxt.setBounds(250, 103, 163, 38);
        courseIDTxt.setBackground(Color.WHITE);
        courseIDTxt.setForeground(Color.BLACK);
        nonAcademicFrame.add(courseIDTxt);

        JLabel labelCourseName = new JLabel("Course Name: ");
        labelCourseName.setBounds(60, 160, 133, 23);
        labelCourseName.setFont(f3);
        labelCourseName.setForeground(myLabelColor);
        nonAcademicFrame.add(labelCourseName);

        courseNameTxt = new JTextField();
        courseNameTxt.setBounds(250, 153, 163, 38);
        courseNameTxt.setBackground(Color.WHITE);
        courseNameTxt.setForeground(Color.BLACK);
        nonAcademicFrame.add(courseNameTxt);

        JLabel labelCourseDuration = new JLabel("Course Duration: ");
        labelCourseDuration.setBounds(60, 210, 147, 23);
        labelCourseDuration.setFont(f3);
        labelCourseDuration.setForeground(myLabelColor);
        nonAcademicFrame.add(labelCourseDuration);

        courseDurationTxt = new JTextField();
        courseDurationTxt.setBounds(250, 203, 163, 38);
        courseDurationTxt.setBackground(Color.WHITE);
        courseDurationTxt.setForeground(Color.BLACK);
        nonAcademicFrame.add(courseDurationTxt);

        JLabel labelPrerequisite = new JLabel("Prerequisite: ");
        labelPrerequisite.setBounds(60, 260, 120, 23);
        labelPrerequisite.setFont(f3);
        labelPrerequisite.setForeground(myLabelColor);
        nonAcademicFrame.add(labelPrerequisite);

        txtPrerequisite = new JTextField();
        txtPrerequisite.setBounds(250, 253, 163, 38);
        txtPrerequisite.setBackground(Color.WHITE);
        txtPrerequisite.setForeground(Color.BLACK);
        nonAcademicFrame.add(txtPrerequisite);

        /** Add Button **/
        JButton addButton = new JButton("ADD");
        addButton.setBounds(250, 315, 163, 38);
        addButton.setBackground(myButton);
        addButton.setOpaque(true);
        addButton.setFont(f4);
        addButton.setForeground(Color.WHITE);
        addButton.setBorder(BorderFactory.createRaisedBevelBorder());
        nonAcademicFrame.add(addButton);
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent additionNonAcademic) {
                boolean flag = false;
                String courseID = getCourseIDTxt();
                String courseName = getCourseNameTxt();
                String courseDurationString = getCourseDurationTxt();
                String prerequisite = getTxtPrerequisite();

                // Declaring Integer variable for exception handling
                int course_Duration_;
                // Checking if text fields in NonAcademicCourse form is empty or not
                if (courseID.equals("") || courseName.equals("") || courseDurationString.equals("")
                        || prerequisite.equals("")) {
                    // If textfields are empty than show this message
                    JOptionPane.showMessageDialog(null, "Please fill all the fields", "Text field is empty", 0);
                    return;
                } else {
                    // Checking if arraylist is empty ?
                    if (myArrayList.isEmpty()) {
                        flag = true;
                    } else {
                        for (Course course : myArrayList) {
                            // first one is method of parent class(Course) and checking it with textField
                            if (course.getCourseID().equals(getCourseIDTxt())) {
                                JOptionPane.showMessageDialog(null, courseID + " is already registered", "Duplicate",
                                        0);
                                return;
                            } else {
                                flag = true;
                            }
                        }
                    }
                    try {
                        course_Duration_ = Integer.parseInt(courseDurationString);
                    } catch (NumberFormatException nfe) {
                        JOptionPane.showMessageDialog(null, "Duration must be a numeric value", "Invalid Duration", 0);
                        return;
                    }
                    if (flag == true) {
                        // Storing object of Non Academic Course in Array List (Upcasting)
                        myArrayList.add(new NonAcademicCourse(courseID, courseName, course_Duration_, prerequisite));
                        clearNonAcademic();
                        register_Btn_.setEnabled(true);
                        JOptionPane.showMessageDialog(null,
                                "The Course ID " + courseID + " has been added successfully", "Status", 1);
                        return;
                    }
                }
            }
        });

        /** Remove Button **/
        JButton removeButton = new JButton("Remove");
        removeButton.setBounds(60, 315, 163, 38);
        removeButton.setBackground(btnRemoveColor);
        removeButton.setForeground(Color.WHITE);
        removeButton.setBorder(BorderFactory.createRaisedBevelBorder());
        removeButton.setOpaque(true);
        removeButton.setFont(f10);
        nonAcademicFrame.add(removeButton);
        removeButton.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent remove) {
                areYouSureRemoveNonAcademic();
                nonAcademicFrame.setVisible(false);
            }
        });

        /** Clear Button **/
        JButton clearButton = new JButton("Clear");
        clearButton.setBounds(250, 380, 163, 38);
        clearButton.setFont(f4);
        clearButton.setBackground(myRed);
        clearButton.setForeground(Color.WHITE);
        clearButton.setBorder(BorderFactory.createRaisedBevelBorder());
        clearButton.setOpaque(true);
        nonAcademicFrame.add(clearButton);
        clearButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent clearing) {
                clearNonAcademic();
            }
        });

        /** Display Button **/
        JButton displayButton = new JButton("Display");
        displayButton.setBounds(60, 380, 163, 38);
        displayButton.setFont(f4);
        displayButton.setForeground(Color.WHITE);
        displayButton.setBorder(BorderFactory.createRaisedBevelBorder());
        displayButton.setBackground(myGreen);
        displayButton.setOpaque(true);
        nonAcademicFrame.add(displayButton);
        displayButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent display) {
                displayNonAcademicCourse();
                nonAcademicFrame.setVisible(false);
            }
        });

        /** Back Button **/
        JButton backButton = new JButton("Back");
        backButton.setBounds(60, 440, 82, 38);
        backButton.setFont(f4);
        backButton.setForeground(Color.WHITE);
        backButton.setBorder(BorderFactory.createRaisedBevelBorder());
        backButton.setBackground(new Color(150, 150, 44));
        backButton.setOpaque(true);
        nonAcademicFrame.add(backButton);
        backButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent back) {
                courseSelectionGui();
                nonAcademicFrame.setVisible(false);
            }
        });

        /** Register Button **/
        register_Btn_ = new JButton("Register");
        register_Btn_.setBounds(250, 440, 163, 38);
        register_Btn_.setFont(f4);
        register_Btn_.setForeground(Color.WHITE);
        register_Btn_.setBorder(BorderFactory.createRaisedBevelBorder());
        register_Btn_.setBackground(myRegisterButton);
        register_Btn_.setOpaque(true);
        register_Btn_.setEnabled(true);
        nonAcademicFrame.add(register_Btn_);
        register_Btn_.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent register) {
                nonAcademicFrame.dispose();
                areYouSureRegisterNonAcademic();
            }
        });

        nonAcademicFrame.setLayout(null);
        nonAcademicFrame.setSize(480, 540);
        nonAcademicFrame.setResizable(false);
        nonAcademicFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        nonAcademicFrame.setLocationRelativeTo(null);
        nonAcademicFrame.setVisible(true);
    }

    /** Non-Academic Form End **/

    /** Non-Academic Register Form Start **/
    public void nonAcademicRegister() {
        /** Font Colors **/
        Font f7 = new Font("Poppins", Font.BOLD, 18);
        Font f8 = new Font("Poppins", Font.PLAIN, 16);
        Font f9 = new Font("Poppins", Font.BOLD, 16);

        /** Background Colors **/
        Color myTextField = new Color(81, 94, 100);
        Color myacademicRegister = new Color(30, 45, 51);
        Color skyBlue = new Color(177, 206, 240);
        Color labelColor = new Color(247, 247, 247);
        Color buttonColor = new Color(6, 95, 160);
        Color btnBackColor = new Color(150, 150, 44);

        nonAcademicRegister = new JFrame();
        nonAcademicRegister.getContentPane().setBackground(myacademicRegister);

        JLabel labelTitle = new JLabel("N0N-ACADEMIC COURSE");
        labelTitle.setBounds(130, 30, 229, 25);
        labelTitle.setFont(f7);
        labelTitle.setForeground(skyBlue);
        nonAcademicRegister.add(labelTitle);

        JLabel courseID_label = new JLabel("Course ID: ");
        courseID_label.setBounds(60, 80, 96, 23);
        courseID_label.setForeground(labelColor);
        courseID_label.setFont(f8);
        nonAcademicRegister.add(courseID_label);

        txt_Course_Id_ = new JTextField();
        txt_Course_Id_.setBounds(245, 73, 170, 38);
        txt_Course_Id_.setBackground(myTextField);
        txt_Course_Id_.setForeground(Color.WHITE);
        nonAcademicRegister.add(txt_Course_Id_);

        JLabel labelCourseLeader = new JLabel("Course Leader: ");
        labelCourseLeader.setBounds(60, 130, 137, 23);
        labelCourseLeader.setFont(f8);
        labelCourseLeader.setForeground(labelColor);
        nonAcademicRegister.add(labelCourseLeader);

        txt_CourseLeader = new JTextField();
        txt_CourseLeader.setBounds(245, 123, 170, 38);
        txt_CourseLeader.setBackground(myTextField);
        txt_CourseLeader.setForeground(Color.WHITE);
        nonAcademicRegister.add(txt_CourseLeader);

        JLabel labelInstructorName = new JLabel("Instructor Name: ");
        labelInstructorName.setBounds(60, 180, 155, 23);
        labelInstructorName.setFont(f8);
        labelInstructorName.setForeground(labelColor);
        nonAcademicRegister.add(labelInstructorName);

        txt_InstructorName = new JTextField();
        txt_InstructorName.setBounds(245, 173, 170, 38);
        txt_InstructorName.setBackground(myTextField);
        txt_InstructorName.setForeground(Color.WHITE);
        nonAcademicRegister.add(txt_InstructorName);

        JLabel labelStartingDate = new JLabel("Starting Date: ");
        labelStartingDate.setBounds(60, 230, 129, 23);
        labelStartingDate.setFont(f8);
        labelStartingDate.setForeground(labelColor);
        nonAcademicRegister.add(labelStartingDate);

        txt_StartingDate = new JTextField();
        txt_StartingDate.setBounds(245, 223, 170, 38);
        txt_StartingDate.setBackground(myTextField);
        txt_StartingDate.setForeground(Color.WHITE);
        nonAcademicRegister.add(txt_StartingDate);

        JLabel labelCompletionDate = new JLabel("Completion Date: ");
        labelCompletionDate.setBounds(60, 280, 160, 23);
        labelCompletionDate.setFont(f8);
        labelCompletionDate.setForeground(labelColor);
        nonAcademicRegister.add(labelCompletionDate);

        txt_CompletionDate = new JTextField();
        txt_CompletionDate.setBounds(245, 273, 170, 38);
        txt_CompletionDate.setBackground(myTextField);
        txt_CompletionDate.setForeground(Color.WHITE);
        nonAcademicRegister.add(txt_CompletionDate);

        JLabel labelExamDate = new JLabel("Exam Date: ");
        labelExamDate.setBounds(60, 330, 160, 23);
        labelExamDate.setForeground(labelColor);
        labelExamDate.setFont(f8);
        nonAcademicRegister.add(labelExamDate);

        txt_ExamDate = new JTextField();
        txt_ExamDate.setBounds(245, 323, 170, 38);
        txt_ExamDate.setBackground(myTextField);
        txt_ExamDate.setForeground(Color.WHITE);
        nonAcademicRegister.add(txt_ExamDate);

        /** Register Button **/
        JButton register_Button = new JButton("Register");
        register_Button.setBounds(245, 383, 170, 38);
        register_Button.setBackground(buttonColor);
        register_Button.setForeground(Color.WHITE);
        register_Button.setBorder(BorderFactory.createRaisedBevelBorder());
        register_Button.setOpaque(true);
        register_Button.setFont(f9);
        nonAcademicRegister.add(register_Button);
        register_Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent registering) {

                boolean flag = false;
                String course_ID_ = getTxt_Course_Id_();
                String course_Leader_ = getTxt_CourseLeader();
                String instructor_Name_ = getTxt_InstructorName();
                String starting_Date_ = getTxt_StartingDate();
                String completion_Date_ = getTxt_CompletionDate();
                String exam_Date_ = getTxt_ExamDate();

                if (course_ID_.equals("") || course_Leader_.equals("") || instructor_Name_.equals("")
                        || starting_Date_.equals("") || completion_Date_.equals("") || exam_Date_.equals("")) {
                    // If textfields are empty than show this message
                    JOptionPane.showMessageDialog(null, "Please fill all the fields", "Text field is empty", 0);
                    return;
                } else {
                    // Checking if arraylist is empty or not
                    if (myArrayList.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Please add the Course first", "Course list is empty", 2);
                        return;
                    } else {
                        // Iterating through arraylist
                        // class name variable name arraylist name
                        for (Course course : myArrayList) {
                            if (course instanceof NonAcademicCourse) {
                                if (course.getCourseID().equals(course_ID_)) {
                                    // Downcasting
                                    NonAcademicCourse nonAcademic_Course = (NonAcademicCourse) course;
                                    // Checking if entered non-academic course is registered or not?
                                    if (nonAcademic_Course.getIsRegistered()) {
                                        JOptionPane.showMessageDialog(null,
                                                "The Course ID " + course_ID_ + " is already registered",
                                                "Duplicate Course", 2);
                                        return;
                                    } else {
                                        nonAcademic_Course.register(course_Leader_, instructor_Name_, starting_Date_,
                                                completion_Date_, exam_Date_);
                                        removeTextFieldNonAcademicRegister();
                                        JOptionPane.showMessageDialog(null,
                                                "The Course ID " + course_ID_ + " has been registered successfully",
                                                "Registered", 1);
                                        return;
                                    }
                                } else {
                                    flag = true;
                                }
                            }
                        }
                        if (flag == true) {
                            JOptionPane.showMessageDialog(null, "The Course ID " + course_ID_ + " Is Invalid",
                                    "Invalid Course ID", 0);
                            return;
                        }
                    }
                }
            }
        });

        /** Back Button **/
        JButton btnBack = new JButton("Back");
        btnBack.setBounds(60, 383, 88, 38);
        btnBack.setFont(f9);
        btnBack.setBackground(btnBackColor);
        btnBack.setForeground(Color.WHITE);
        btnBack.setBorder(BorderFactory.createRaisedBevelBorder());
        btnBack.setOpaque(true);
        nonAcademicRegister.add(btnBack);
        btnBack.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent back) {
                nonAcademicRegister.dispose();
                nonAcademicForm();
                register_Btn_.setEnabled(true);
            }
        });

        nonAcademicRegister.setLayout(null);
        nonAcademicRegister.setSize(480, 505);
        nonAcademicRegister.setResizable(false);
        nonAcademicRegister.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        nonAcademicRegister.setLocationRelativeTo(null);
        nonAcademicRegister.setVisible(true);
    }

    /** Non-Academic Register Form End **/

    /** Display Frame of Non-AcademicCourse Start **/
    public void displayNonAcademicCourse() {
        /** Fonts **/
        Font fMalyalam = new Font("Malayalam MN", Font.PLAIN, 29);
        Font fPoppins = new Font("Poppins", Font.BOLD, 16);
        Font fOria = new Font("Oriya MN", Font.BOLD, 22);
        Font fKannada = new Font("Kannada MN", Font.PLAIN, 18);

        /** Background Colors **/
        Color mainBackground = new Color(18, 90, 119);
        Color displayBtnColor = new Color(68, 150, 91);
        Color backBtnColor = new Color(150, 150, 44);
        Color textAreaColor = new Color(213, 213, 213);
        Color clearBtnColor = new Color(214, 88, 88);

        display_Frame_NonAcademic = new JFrame("Non-Academic Course Display");
        display_Frame_NonAcademic.getContentPane().setBackground(mainBackground);

        JLabel label_Course_ID = new JLabel("Course ID:");
        label_Course_ID.setBounds(228, 90, 152, 36);
        label_Course_ID.setFont(fMalyalam);
        label_Course_ID.setForeground(Color.WHITE);
        display_Frame_NonAcademic.add(label_Course_ID);

        txt_Course_ID_NonAcademic = new JTextField();
        txt_Course_ID_NonAcademic.setBounds(388, 85, 261, 46);
        txt_Course_ID_NonAcademic.setFont(fOria);
        txt_Course_ID_NonAcademic.setBackground(Color.WHITE);
        txt_Course_ID_NonAcademic.setForeground(new Color(18, 90, 119));
        display_Frame_NonAcademic.add(txt_Course_ID_NonAcademic);

        JButton display_NonAcademicBtn = new JButton("Display");
        display_NonAcademicBtn.setBounds(530, 150, 116, 53);
        display_NonAcademicBtn.setFont(fPoppins);
        display_NonAcademicBtn.setBackground(displayBtnColor);
        display_NonAcademicBtn.setForeground(Color.WHITE);
        display_NonAcademicBtn.setOpaque(true);
        display_NonAcademicBtn.setBorder(BorderFactory.createRaisedBevelBorder());
        display_Frame_NonAcademic.add(display_NonAcademicBtn);
        display_NonAcademicBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent display) {
                boolean flag = false;
                String course_Id = getTxt_Course_ID_NonAcademic();

                if (myArrayList.isEmpty()) {
                    JOptionPane.showMessageDialog(null,
                            "No any Course registered yet, Please add & register the course", "Empty Course List", 0);
                    return;
                } else {
                    for (Course course : myArrayList) {
                        if (course.getCourseID().equals(course_Id)) {
                            if (course instanceof NonAcademicCourse) {
                                // Downcasting
                                NonAcademicCourse nonAcademic_Course = (NonAcademicCourse) course;

                                if (nonAcademic_Course.getIsRegistered()) {
                                    nonAcademic_Course.display();
                                    nesteddisplayAreaNonAcademic.setText("Course ID: "
                                            + nonAcademic_Course.getCourseID() + "\n" + "Course Name: "
                                            + nonAcademic_Course.getCourseName() + "\n" + "Course Duration: "
                                            + nonAcademic_Course.getCourseDuration() + " year(s)" + "\n"
                                            + "Prerequisite: " + nonAcademic_Course.getPrerequisite() + "\n"
                                            + "Course Leader: " + nonAcademic_Course.getCourseLeader() + "\n"
                                            + "Instructor Name: " + nonAcademic_Course.getInstructorName() + "\n"
                                            + "Starting Date: " + nonAcademic_Course.getStartDate() + "\n"
                                            + "Completion Date: " + nonAcademic_Course.getCompletionDate() + "\n"
                                            + "Exam Date: " + nonAcademic_Course.getExamDate());
                                    register_Btn_.setEnabled(true);
                                    return;
                                } else {
                                    nonAcademic_Course.display();
                                    nesteddisplayAreaNonAcademic.setText("Course ID: " + course.getCourseID() + "\n"
                                            + "Course Name: " + course.getCourseName() + "\n" + "Course Duration: "
                                            + course.getCourseDuration() + "\n"
                                            + "The name of the Course Leader is not available right now. \nThank you.");
                                    register_Btn_.setEnabled(true);
                                    return;
                                }
                            }
                        } else {
                            flag = true;
                            register_Btn_.setEnabled(true);
                        }
                    }
                    if (flag == true) {
                        clearDisplayAreaNonAcademic();
                        JOptionPane.showMessageDialog(null, "The Course ID " + course_Id + " Is Invalid",
                                "Invalid Course ID", 2);
                        register_Btn_.setEnabled(true);
                        return;
                    }
                }

            }
        });

        nesteddisplayAreaNonAcademic = new JTextArea();
        nesteddisplayAreaNonAcademic.setBounds(88, 283, 528, 308);
        nesteddisplayAreaNonAcademic.setBackground(textAreaColor);
        nesteddisplayAreaNonAcademic.setFont(fKannada);
        nesteddisplayAreaNonAcademic.setForeground(Color.BLACK);
        nesteddisplayAreaNonAcademic.setEditable(false);
        display_Frame_NonAcademic.add(nesteddisplayAreaNonAcademic);

        displayArea_NonAcademic = new JTextArea();
        displayArea_NonAcademic.setBounds(55, 250, 593, 374);
        displayArea_NonAcademic.setBackground(textAreaColor);
        displayArea_NonAcademic.setEditable(false);
        display_Frame_NonAcademic.add(displayArea_NonAcademic);

        JButton btn_Clear_ = new JButton("Clear");
        btn_Clear_.setBounds(532, 645, 116, 53);
        btn_Clear_.setFont(fPoppins);
        btn_Clear_.setBackground(clearBtnColor);
        btn_Clear_.setForeground(Color.WHITE);
        btn_Clear_.setOpaque(true);
        btn_Clear_.setBorder(BorderFactory.createRaisedBevelBorder());
        display_Frame_NonAcademic.add(btn_Clear_);
        btn_Clear_.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent clear) {
                clearDisplayAreaNonAcademic();
            }
        });

        JButton btn_Back_ = new JButton("Back");
        btn_Back_.setBounds(58, 725, 94, 38);
        btn_Back_.setFont(fPoppins);
        btn_Back_.setBackground(backBtnColor);
        btn_Back_.setForeground(Color.WHITE);
        btn_Back_.setOpaque(true);
        btn_Back_.setBorder(BorderFactory.createRaisedBevelBorder());
        display_Frame_NonAcademic.add(btn_Back_);
        btn_Back_.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent back) {
                nonAcademicForm();
                display_Frame_NonAcademic.setVisible(false);
            }
        });

        display_Frame_NonAcademic.setLayout(null);
        display_Frame_NonAcademic.setSize(702, 811);
        display_Frame_NonAcademic.setResizable(false);
        display_Frame_NonAcademic.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        display_Frame_NonAcademic.setLocationRelativeTo(null);
        display_Frame_NonAcademic.setVisible(true);
    }

    /** Display Frame of Non-AcademicCourse End **/

    /** Are you sure Register Non-Academic Course Start **/
    public void areYouSureRegisterNonAcademic() {
        // Font
        Font f5 = new Font("Poppins", Font.PLAIN, 24);
        Font f6 = new Font("Poppins", Font.BOLD, 16);
        // Background
        Color sureBackground = new Color(30, 45, 51);
        Color areYouSureColor = new Color(81, 94, 100);
        Color yesColor = new Color(68, 150, 91);
        Color noColor = new Color(214, 88, 88);

        areYouSureNonAcademic = new JFrame();
        areYouSureNonAcademic.getContentPane().setBackground(sureBackground);

        JLabel labelAreYouSureNonAcademic = new JLabel("Are you sure, you want to register?");
        labelAreYouSureNonAcademic.setBounds(60, 30, 456, 53);
        labelAreYouSureNonAcademic.setFont(f5);
        labelAreYouSureNonAcademic.setForeground(Color.WHITE);
        labelAreYouSureNonAcademic.setBackground(areYouSureColor);
        areYouSureNonAcademic.add(labelAreYouSureNonAcademic);

        /** Yes Button **/
        JButton yesBtn = new JButton("Yes");
        yesBtn.setBounds(210, 120, 116, 53);
        yesBtn.setFont(f6);
        yesBtn.setForeground(Color.WHITE);
        yesBtn.setBorder(BorderFactory.createRaisedBevelBorder());
        yesBtn.setBackground(yesColor);
        yesBtn.setOpaque(true);
        areYouSureNonAcademic.add(yesBtn);
        yesBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent yes) {
                nonAcademicRegister();
                areYouSureNonAcademic.setVisible(false);
            }
        });

        /** No Button **/
        JButton noBtn = new JButton("No");
        noBtn.setBounds(210, 200, 116, 53);
        noBtn.setFont(f6);
        noBtn.setForeground(Color.WHITE);
        noBtn.setBorder(BorderFactory.createRaisedBevelBorder());
        noBtn.setBackground(noColor);
        noBtn.setOpaque(true);
        areYouSureNonAcademic.add(noBtn);
        noBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent no) {
                nonAcademicForm();
                areYouSureNonAcademic.setVisible(false);
            }
        });

        areYouSureNonAcademic.setLayout(null);
        areYouSureNonAcademic.setSize(538, 348);
        areYouSureNonAcademic.setResizable(false);
        areYouSureNonAcademic.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        areYouSureNonAcademic.setLocationRelativeTo(null);
        areYouSureNonAcademic.setVisible(true);
    }

    /** Are you sure Register Non-Academic Course End **/

    /** Are you sure Remove Non-Academic Course Start **/
    public void areYouSureRemoveNonAcademic() {
        // Font
        Font f55 = new Font("Poppins", Font.PLAIN, 24);
        Font f66 = new Font("Poppins", Font.BOLD, 16);
        // Background
        Color mainBackgroundColor = new Color(75, 92, 98);
        Color yesBtnColor = new Color(68, 150, 91);
        Color noBtnColor = new Color(214, 88, 88);

        removeNonAcademicFrame = new JFrame("Course Remove");
        removeNonAcademicFrame.getContentPane().setBackground(mainBackgroundColor);

        JLabel labelWantToRemove = new JLabel("Are you sure, you want to remove?");
        labelWantToRemove.setBounds(60, 30, 416, 53);
        labelWantToRemove.setFont(f55);
        labelWantToRemove.setBackground(new Color(81, 94, 100));
        labelWantToRemove.setOpaque(true);
        labelWantToRemove.setBorder(BorderFactory.createRaisedBevelBorder());
        labelWantToRemove.setForeground(Color.WHITE);
        removeNonAcademicFrame.add(labelWantToRemove);

        /** Yes Button **/
        JButton yes_Btn = new JButton("Yes");
        yes_Btn.setBounds(210, 120, 116, 53);
        yes_Btn.setFont(f66);
        yes_Btn.setForeground(Color.WHITE);
        yes_Btn.setBackground(yesBtnColor);
        yes_Btn.setOpaque(true);
        yes_Btn.setBorder(BorderFactory.createRaisedBevelBorder());
        removeNonAcademicFrame.add(yes_Btn);
        yes_Btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent yes) {
                removeNonAcademicNow();
                removeNonAcademicFrame.setVisible(false);
            }
        });

        /** No Button **/
        JButton no_Btn = new JButton("No");
        no_Btn.setBounds(210, 200, 116, 53);
        no_Btn.setFont(f66);
        no_Btn.setForeground(Color.WHITE);
        no_Btn.setBackground(noBtnColor);
        no_Btn.setOpaque(true);
        no_Btn.setBorder(BorderFactory.createRaisedBevelBorder());
        removeNonAcademicFrame.add(no_Btn);
        no_Btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent no) {
                nonAcademicForm();
                removeNonAcademicFrame.setVisible(false);
            }
        });

        removeNonAcademicFrame.setLayout(null);
        removeNonAcademicFrame.setSize(538, 348);
        removeNonAcademicFrame.setResizable(false);
        removeNonAcademicFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        removeNonAcademicFrame.setLocationRelativeTo(null);
        removeNonAcademicFrame.setVisible(true);
    }

    /** Are you sure Remove Non-Academic Course End **/

    /** Remove Frame Non-Academic through Course ID Start **/
    public void removeNonAcademicNow() {
        // Fonts
        Font f555 = new Font("Malayalam MN", Font.PLAIN, 29);
        Font f666 = new Font("Poppins", Font.BOLD, 16);
        Font fTelugu = new Font("Telugu MN", Font.BOLD, 24);
        // Background Color
        Color main_Background_Color = new Color(75, 92, 98);
        Color back_Btn_Color = new Color(150, 150, 44);
        Color remove_Btn_Color = new Color(214, 88, 88);

        removeNonAcademicFrameNow = new JFrame("Course Remove");
        removeNonAcademicFrameNow.getContentPane().setBackground(main_Background_Color);

        JLabel label_Course_ID_Removal = new JLabel("Course ID:");
        label_Course_ID_Removal.setBounds(80, 60, 152, 36);
        label_Course_ID_Removal.setFont(f555);
        label_Course_ID_Removal.setForeground(Color.WHITE);
        removeNonAcademicFrameNow.add(label_Course_ID_Removal);

        txt_Removeable_CourseID = new JTextField();
        txt_Removeable_CourseID.setBounds(240, 55, 218, 46);
        txt_Removeable_CourseID.setBackground(Color.WHITE);
        txt_Removeable_CourseID.setForeground(new Color(66, 117, 137));
        txt_Removeable_CourseID.setFont(fTelugu);
        removeNonAcademicFrameNow.add(txt_Removeable_CourseID);

        remove_Btn = new JButton("Remove");
        remove_Btn.setBounds(335, 120, 120, 53);
        remove_Btn.setBackground(remove_Btn_Color);
        remove_Btn.setOpaque(true);
        remove_Btn.setBorder(BorderFactory.createRaisedBevelBorder());
        remove_Btn.setFont(f666);
        remove_Btn.setForeground(Color.WHITE);
        removeNonAcademicFrameNow.add(remove_Btn);
        remove_Btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent remove) {
                boolean flag = false;
                String courseID_ = getTxt_Removeable_CourseID();

                if (courseID_.equals("")) {
                    JOptionPane.showMessageDialog(null, "Please fill the text field", "Text field is empty", 0);
                    return;
                } else {
                    if (myArrayList.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "No any courses are registered yet", "Empty Course List",
                                0);
                        return;
                    } else {
                        for (Course course : myArrayList) {
                            if (course.getCourseID().equals(courseID_)) {
                                if (course instanceof NonAcademicCourse) {
                                    NonAcademicCourse non_Academic = (NonAcademicCourse) course;
                                    if (non_Academic.getIsRemoved()) {
                                        JOptionPane.showMessageDialog(null,
                                                "The Course " + courseID_ + " has been already removed",
                                                "Remove Status", 1);
                                        return;
                                    } else {
                                        if (non_Academic.getIsRegistered()) {
                                            non_Academic.remove();
                                            removeTextFieldRemoveNonAcademic();
                                            JOptionPane.showMessageDialog(null,
                                                    "The Course ID " + courseID_ + " has been removed successfully",
                                                    "Remove Status", 1);
                                            return;
                                        } else {
                                            JOptionPane.showMessageDialog(null,
                                                    "Please register the course first and try to remove",
                                                    "Nothing to Remove", 0);
                                            return;
                                        }

                                    }
                                }

                            } else {
                                flag = true;
                            }
                        }
                    }
                    if (flag = true) {
                        txtFieldNonAcademicRemove();
                        JOptionPane.showMessageDialog(null, "The Course ID " + courseID_ + " Is Invalid",
                                "Invalid Course ID", 2);
                        return;
                    }
                }
            }
        });

        JButton back_Btn = new JButton("Back");
        back_Btn.setBounds(80, 220, 94, 38);
        back_Btn.setBackground(back_Btn_Color);
        back_Btn.setOpaque(true);
        back_Btn.setBorder(BorderFactory.createRaisedBevelBorder());
        back_Btn.setFont(f666);
        back_Btn.setForeground(Color.WHITE);
        removeNonAcademicFrameNow.add(back_Btn);
        back_Btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent back) {
                nonAcademicForm();
                removeNonAcademicFrameNow.setVisible(false);
            }
        });

        removeNonAcademicFrameNow.setLayout(null);
        removeNonAcademicFrameNow.setSize(538, 310);
        removeNonAcademicFrameNow.setResizable(false);
        removeNonAcademicFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        removeNonAcademicFrameNow.setLocationRelativeTo(null);
        removeNonAcademicFrameNow.setVisible(true);
    }

    /** Remove Frame Non-Academic through Course ID End **/

    /**
     * Clear method of text field of remove Non-AcademicCourse of Remove Frame Start
     **/
    public void removeTextFieldRemoveNonAcademic() {
        txt_Removeable_CourseID.setText(null);
    }

    /**
     * Clear method of text field of remove Non-AcademicCourse of Remove Frame End
     **/

    /** Set TextField of Register Frame of Non-Academic Course Start **/
    public void removeTextFieldNonAcademicRegister() {
        txt_Course_Id_.setText(null);
        txt_CourseLeader.setText(null);
        txt_InstructorName.setText(null);
        txt_StartingDate.setText(null);
        txt_CompletionDate.setText(null);
        txt_ExamDate.setText(null);
    }

    /** Set TextField of Register Frame of Non-Academic Course End **/

    /** Clearing Method for Non-Academic Course Start **/
    public void clearNonAcademic() {
        courseIDTxt.setText(null);
        courseNameTxt.setText(null);
        courseDurationTxt.setText(null);
        txtPrerequisite.setText(null);
    }

    /** Clearing Method for Non-Academic Course End **/

    /** Clear Methods for Display Frame for Non-Academic Start **/
    public void clearDisplayAreaNonAcademic() {
        txt_Course_ID_NonAcademic.setText(null);
        nesteddisplayAreaNonAcademic.setText(null);
    }

    /** Clear Methods for Display frame both Academic and Non-Academic End **/

    /** Clear method to remove typed course ID in course remove frame Start **/
    public void clearCourseID_RemoveFrame() {
        txt_Removeable_CourseID.setText(null);
    }

    /** Clear method to remove typed course ID in course remove frame End **/

    /** Clear method of remove nonAcademic Course Start */
    public void txtFieldNonAcademicRemove() {
        txt_Removeable_CourseID.setText(null);
    }

    /** Clear method of remove nonAcademic Course Start */
    /** Non Academic Section Closed **/

    /** Main Method **/
    public static void main(String[] args) {
        INGCollege college = new INGCollege();
        college.courseSelectionGui();
    }
}
