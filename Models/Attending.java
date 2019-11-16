package CoreJava.Models;

public class Attending {

    private int courseID; // private = restricted access. Only accessible within this class
    private String studentEmail;

    public Attending (int courseID, String studentEmail) {

        this.courseID = courseID;
        this.studentEmail = studentEmail;

    }

    public Attending() {

    }

    // setter
        public void setCourseID(int courseID){
            this.courseID = courseID;
        }

        // getter
        public int getCourseID () {
            return courseID;
        }

        public void setStudentEmail (String studentEmail){
            this.studentEmail = studentEmail;
        }

        public String getStudentEmail () {
            return studentEmail;
        }

}
