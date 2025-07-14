public class Teacher extends Person {
    private String mySubject;   // The subject they teach (and probably dream about grading)
    private double mySalary;    // Annual salary — enough to buy coffee... maybe

    // Constructor — creates a teacher, patience sold separately
    public Teacher(String name, int age, String gender, String subject, double salary) {
        super(name, age, gender);  // Let Person handle the basics
        mySubject = subject;
        mySalary = salary;
    }

    // Get the subject they teach — aka their passion... or burden
    public String getSubject() {
        return mySubject;
    }

    // Get their salary 
    public double getSalary() {
        return mySalary;
    }

    // Set a new subject 
    public void setSubject(String subject) {
        mySubject = subject;
    }

    // Set a new salary 
    public void setSalary(double salary) {
        mySalary = salary;
    }

    // Describe the teacher 
    public String toString() {
        return super.toString() + ", teaches: " + mySubject + ", salary: $" + mySalary;
    }
}
