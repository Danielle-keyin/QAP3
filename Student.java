public class Student extends Person {
    protected String myIdNum;  // Student ID
    protected double myGPA;    // GPA — the tiny decimal that controls their self-worth

    // Constructor — builds a student, probably tired, definitely broke
    public Student(String name, int age, String gender, String idNum, double gpa) {
        super(name, age, gender); // Let Person handle the basics (name, age, etc.)
        myIdNum = idNum;
        myGPA = gpa;
    }

    // Get their student ID
    public String getIdNum() {
        return myIdNum;
    }

    // Get their GPA
    public double getGPA() {
        return myGPA;
    }

    // Set a new student ID
    public void setIdNum(String idNum) {
        myIdNum = idNum;
    }

    // Set a new GPA — hopefully up, not down (you got this!)
    public void setGPA(double gpa) {
        myGPA = gpa;
    }

    // Give us the whole student scoop
    public String toString() {
        return super.toString() + ", ID: " + myIdNum + ", GPA: " + myGPA;
    }
}
