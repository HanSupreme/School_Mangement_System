package CoreJava.DAO;

import CoreJava.Models.Course;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CourseDAO {

    private static Scanner input;
    private Course course;

    public List<Course> getAllCourses() {

        List<Course> data = new ArrayList<>(); //creating an ArrayList because we want to store a file

        try {

            String location = "/Users/user/Desktop/CSV/courses.csv"; //import course CSV here
            File file = new File(location); //file location finder
            input = new Scanner(file); // Scanner(file) == "input" finds "file"; file = text/csv file
            while (input.hasNext()) {
                String[] line = input.nextLine().split(",");

//            for (String[] line : data) { //calling data line-by-line;
//                System.out.println(line);
                course = new Course();
                course.setID(Integer.parseInt(line[0]));
                course.setName(line[1]);
                course.setInstructor(line[2]);
                data.add(course);

            }

        } catch (Exception e) {
            System.out.println("File not found!");
            e.printStackTrace(); //this will catch errors and print error message
        }

        return data;

    }

}