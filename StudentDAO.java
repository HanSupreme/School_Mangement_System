package CoreJava.DAO;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import CoreJava.Models.Student;

public class StudentDAO {

    private static Scanner input;

    public List<Student> getStudents() {

        List<Student> data = new ArrayList<>(); //creating an ArrayList because we want to store a file

        try {

            String location = "/Users/user/Desktop/CSV/students.csv";
            File file = new File(location); //file location finder
            input = new Scanner(file); // Scanner(file) == "input" finds "file" - file = text file

            //we want to read an entire file and not just one line, so for that reason we will use loop

            if (file.length() == 0) {
                System.out.println(" Checking if file is empty: ... \n" +
                                    " [ File is empty. ] \n");

            } else {
                System.out.println(" Checking if file is empty: ... \n" +
                                    " [ File is NOT empty. ] \n");
            }

            while (input.hasNextLine()) { //input equaling file text, we will put this in loop to read all files
                String[] line = input.nextLine().split(",");
                data.add(new Student(line[1], line[0], line[2])); //we will store file to an ArrayList

                //data is ArrayList name, we're adding file to data (so that it can read txt and print)

            }

        } catch (Exception e) {
            System.out.println("File not found!");
            e.printStackTrace(); //this will catch errors and print out which error
        }

        return data;

    }

    public Student getStudentByEmail(List<Student> studentList, String studentEmail) {

        //we will call the ArrayList data line-by-line

        for (Student student : studentList) {
            if (student.getEmail().equals(studentEmail)) {
                return student;
            }
        }

        return null;

    }

    public boolean validateUser(List<Student> studentList, String studentEmail, String studentPass) {


        Scanner sc = new Scanner(System.in);

        for (Student student : studentList) {
            if (student.getEmail().equals(studentEmail) && student.getPass().equals(studentPass)) ;
            return true;
        }

        return false;

    }

} //main closing braces for StudentDAO