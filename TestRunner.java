package CoreJava.MainEntryPoint;

import CoreJava.DAO.AttendingDAO;
import CoreJava.DAO.CourseDAO;
import CoreJava.DAO.StudentDAO;
import CoreJava.Models.Attending;
import CoreJava.Models.Course;
import CoreJava.Models.Student;

import java.util.List;

public class TestRunner {

    public static void main(String[] args) {

        //calling methods to main so that we can print

        callingCourse();
        callingStudent();
        getAttending();

    }

    public static void callingCourse() {

        System.out.println("\n ------------------- ");
        System.out.println(" Course information: ");
        System.out.println(" ------------------- \n");

        List <Course> course;

        CourseDAO courseDAO = new CourseDAO();

        course = courseDAO.getAllCourses();

        for(Course courses: course){ //printing course ID and course name that is connected to the ID
            System.out.println("ID# " + courses.getID() + ")" + " " + courses.getName());
        }
    } //closing braces for CallingCourse method

    public static void callingStudent() {

        System.out.println("\n -------------------- ");
        System.out.println(" Student information: ");
        System.out.println(" -------------------- \n");

        List <Student> students;

        StudentDAO studentDAO = new StudentDAO();

        students = studentDAO.getStudents();

        for(Student i : students){ // "i" will receive student email, name and password
            System.out.println("Student Info: [EMAIL] | [NAME] | [PASSWORD] ");
            System.out.println(i.getEmail()+ " | " + i.getName() + " | " + i.getPass() + "\n");
        }

        System.out.print("Receive student name from email: "); //receiving student name from given email
        Student newStudent = studentDAO.getStudentByEmail(students,"tom@gmail.com");
        System.out.println(newStudent.getName());

        System.out.print("Validating user: "); //validating student information from csv in file
        boolean b = studentDAO.validateUser(students, "joe@gmail.com","jc2142");
        System.out.print(b);

    } //closing braces for callingStudent method

    public static void getAttending() {

        System.out.println("\n\n ----------------------- ");
        System.out.println(" Attendance information: ");
        System.out.println(" ----------------------- \n");

        List <Attending> attending;

        AttendingDAO attendingDAO = new AttendingDAO();

        attending = attendingDAO.getAttending();

        for(Attending i : attending){ // printing out student that is attending which course ID
            System.out.println("             Student attending course:");
            System.out.println(" Student Email: " + i.getStudentEmail() + "\n" + " Course ID# (" + i.getCourseID() + ")"
                    + "\n");
        }

        List <Course> course; //course information from ArrayList

        CourseDAO courseDAO = new CourseDAO();

        course = courseDAO.getAllCourses(); //course information from CSV list
        List<Course> list = attendingDAO.getStudentCourses(course, attending, "tom@gmail.com");

        for (Course c : list) { //printing course ID, course name and course Instructor information
            System.out.println("\n             Course information: ");
            System.out.println(" Course ID# (" + c.getID() + ")" + "\n Course Name: " + c.getName() +
                    "\n Course Instructor: " + c.getInstructor());
        }
    } //closing braces for getAttending method

} //closing braces for main TestRunner method