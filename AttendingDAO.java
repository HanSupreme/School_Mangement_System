package CoreJava.DAO;

import CoreJava.Models.Attending;
import CoreJava.Models.Course;
import CoreJava.Models.Student;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AttendingDAO {

    private static Scanner input;
    private Attending attending;
    private Object CourseDAO;

    public List<Attending> getAttending() {

        List<Attending> data = new ArrayList<>(); // created ArrayList to store a file

        try {

            String location = "/Users/user/Desktop/CSV/attending.csv"; //import Attending CSV File here
            File file = new File(location); //file location finder
            input = new Scanner(file); // Scanner(file) == "input" finds "file" (file = text file)

            //we want to read an entire file and not just one line, so for that reason we will use loop

            while (input.hasNextLine()) { //input = file text, will loop through to read all files

                String[] line = input.nextLine().split(",");
                Attending attending = new Attending();
                attending.setCourseID(Integer.parseInt(line[0]));
                attending.setStudentEmail(line[1]);
                data.add(attending);
            }

        } catch (Exception e) {
            System.out.println("File not found!");
            e.printStackTrace(); //this will catch errors and print out which error
        }

        return data;

    }

    public void registerStudentToCourse(List<Attending> attending, String studentEmail, int courseID) {

        /*

        This method takes a Student’s email and a Course ID.
        It checks if a Student with that Email is currently attending a Course with that ID.

        If the student is not attending that Course,

        add a new Attending object with the Student’s Email and Course ID to the List.

         */

        for (Attending i : attending) { // i will loop through Attending csv list
            if (i.getStudentEmail().equals(studentEmail) &&
                    i.getCourseID() == (courseID)) { //i will check to see if students email & course ID are a match
                return;
            }
        }
            Attending newAttendingStudent = new Attending();
            newAttendingStudent.setCourseID(courseID);
            newAttendingStudent.setStudentEmail(studentEmail);
            attending.add(newAttendingStudent);
            saveAttending(attending);
    }

    public List<Course> getStudentCourses(List<Course> courseList, List<Attending> attending, String studentEmail) {

        /*

        This method takes a Student’s Email as a parameter and would search the
        Attending List for all the courses a student is registered to base on the Id.

        Each of these is added to a new list of courses.
        This list of courses the student is attending is returned

         */

        List<Course> newListOfCourses = new ArrayList<>(); //ArrayList to store new list of courses

        for (Attending i : attending) { //current Attending
            if (i.getStudentEmail().equals(studentEmail)) { //i is loop/ searching list to check if attending

                for (Course j : courseList) { //j is looping through to check if both ID's are a match
                    if (j.getID() == i.getCourseID()) {
                        newListOfCourses.add(j); //newListOfCourses added to j, which is Course

                    }
                }
            }
        }

    return newListOfCourses;

}

    public void saveAttending(List<Attending> attending) {

        /*

        This method overwrites the original Attending.csv file with the new data

         */

        try {
            String location = "/Users/user/Desktop/CSV/attending.csv"; //csv location
            File file = new File(location); //file locator
            FileWriter writer = new FileWriter(file, false); //false overwrites, true will not overwrite csv

            for (Attending i : attending) { // i is checking/ looping through attending csv
                writer.write(String.format("%s,%s\n", //writer is from fileWriter, and is overwriting
                        i.getCourseID(), i.getStudentEmail())); //overwriting existing courseID and studentEmail

                } //closing fileWriter

            writer.close();

        }

        catch (Exception e) {
        System.out.println("Error!");
        e.printStackTrace(); //this will catch errors and print out error message
    }


    }

}