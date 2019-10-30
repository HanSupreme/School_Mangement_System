package CoreJava.Models;

public class Course {

private int courseID;
private String courseName, instructor;

public Course (int courseID, String courseName, String instructor) {

        this.courseID = courseID;
        this.courseName = courseName;
        this.instructor = instructor;

        }

        public Course() {

        }

        public void setID(int courseID){
        this.courseID = courseID;
        }

public int getID(){
        return courseID;
        }

public void setName(String name){
        this.courseName = name;
        }

public String getName(){
        return courseName;
        }

public void setInstructor(String instructor){
        this.instructor = instructor;
        }

public String getInstructor(){
        return instructor;
        }

}