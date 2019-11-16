package CoreJava.Models;

public class Student {

    private String name, email, password; // fields. Private = restricted access. Only accessible within this class

    // setters and getters

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail(){
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setPass(String pass) {
        this.password = pass;
    }

    public String getPass() {
        return password;
    }

    //constructors

    public Student () {

        this.name = " ";
        this.email = " ";
        this.password = " ";

    } // unnecessary

    public Student(String name, String email, String password) {

        this.name = name;
        this.email = email;
        this.password = password;

    }

}
