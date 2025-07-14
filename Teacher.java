public class Teacher extends Person {
    private double mySalary;
    private String mySubject;

    public Teacher(String name, int age, String gender, double salary, String subject) {
        super(name, age, gender);
        mySalary = salary;
        mySubject = subject;
    }

    public String toString() {
        return super.toString() + ", teaches: " + mySubject + ", salary: $" + mySalary;
    }
}
