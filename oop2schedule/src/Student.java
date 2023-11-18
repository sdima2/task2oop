public class Student {

    private int studentID;
    private String name;
    private String surname;


    public Student(int studentID, String name, String surname) {
        this.studentID = studentID;
        this.name = name;
        this.surname = surname;

    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

}
