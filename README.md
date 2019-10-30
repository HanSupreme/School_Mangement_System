# School_Mangement_System
School Management System where students can register to courses, and view the course assigned to them.

Business Requirement:

Your task is to create a basic School Management System where students can register to courses, and view the course assigned to them.

Work-Flow:

Only students with the right credentials can log in. Otherwise, a message is displayed stating: “Wrong Credentials”.

1) Valid students are able to see the courses they are registered.
2) Valid students are able to register for any course in the system.

Requirement 1:

CSV Files

Create three Comma Separated Values (CSV) files that contain columns specified in the tables below. The tables will be in the following format:

Format: -( Datatype - Name = Description )-

The type of data contained in this column - The name of the column = The description of what this column will contain

File 1 – Students.csv: -( Datatype - Name = Description )-

String - email = Student’s current school email

String - name = The full name of the student

String - pass = Student’s password in order to log in

File 2 – Courses.csv: -( Datatype - Name = Description )-

int - courseID = Unique Course Identifier

String - name = Provides the name of the course

String - instructor = Provides the name of the instructor

File 3 – Attending.csv: -( Datatype - Name = Description )-

int - courseID = Unique Course Identifier

String - email = Student’s current school email

Requirement 2: (Model Class)

Create a package in the src folder named: CoreJava.Models, in this package you will create every model class.

Every Model class must contain the following general two requirements:

1) The first constructor takes no parameters and it initializes every member to an initial value.
2) The second constructor must initialize every private member with a parameter provided to the constructor.

Create a class Student with the private member variables specified in TABLE 1. These private members must have GETTERS and SETTERS methods.

The purpose of the Student class is to carry data related to one student.

TABLE 1: -( Datatype - Name = Description )-

String email = Student’s current school email

String - name = The full name of the student

String - pass = Student’s password in order to log in

Create a class Course with the private member variables specified in TABLE 2. These private members must have GETTERS and SETTERS methods. 

The purpose of the Course class is to carry data related to one Course.

TABLE 2: -( Datatype - Name = Description )-

int - courseID = Unique Course Identifier (ex: 1, 2)

String courseName = Provides the name of the course

String instructor = Provides the name of the instructor

Create a class Attending with the private member variables specified in TABLE 3. These private members must have GETTERS and SETTERS methods.

TABLE 3: -( Datatype - Name = Description )-

int - courseID = Unique Course Identifier (ex: 1, 2)

String - studentEmail = Student’s school email

Requirement 2:

Data Access Objects

Under the package named: CoreJava.DAO, create a class and call it StudentDAO. This class is going to be used to search the CSV files for student’s information only.

Requirement 3:

Main Entry

Inside the package named: CoreJava.MainEntryPoint, create a MainRunner. When your code is complete, this class will be used to run the School Management System. It should therefore only be used to test your code after you’ve finalized everything.

In the same package, create a class named TestRunner. Feel free to use this class to test your code as much as you’d like. Feel free to make changes. 

Sample: Students. Once a student is logged in, the student is able to see all the courses she/he is registered to. Two options are available 1. Register to Class and 2. Logout. If option 1 is selected, then the student is able to see all the courses and register to any of them.

===============

Example Workflow:

Are you a:

1) Student
2) quit

Please, enter 1 or 2.

- 1

Enter Your Email:

- J@gmail.com

Enter Your Password:

- 333

My Classes:

#   COURSE NAME       INSTRUCTOR NAME

1   GYM                Mark        

2   Math               Luke                 

 

1) Register to Class
2) Logout

- 1


All Courses:

ID  COURSE NAME        INSTRUCTOR NAME

1   GYM                 Mark

2   Math                Luke

3   Science             Stephanie

4   English             Lisa

 

Which Course?

- 3

My Classes:

#   COURSE NAME       INSTRUCTOR NAME  

1   GYM               Mark                                               

2   Math              Luke                                             

3   Science           Stephanie                                

 

You have been signed out.
