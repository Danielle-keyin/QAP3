public class CollegeStudent extends Student {
    private int myYear;       // What year they're in 
    private String myMajor;   // What they’re majoring in (for now, anyway)

    // Constructor — creates a new college student who probably runs on coffee and deadlines
    public CollegeStudent(String name, int age, String gender, String idNum, double gpa, int year, String major) {
        super(name, age, gender, idNum, gpa);  // Let Student handle the basics
        myYear = year;
        myMajor = major;
    }

    // Get what year they’re in 
    public int getYear() {
        return myYear;
    }

    // Get their major 
    public String getMajor() {
        return myMajor;
    }

    // Set a new year 
    public void setYear(int year) {
        myYear = year;
    }

    // Change their major (again... and again...)
    public void setMajor(String major) {
        myMajor = major;
    }

    // Show off their full college student profile
    public String toString() {
        return super.toString() + ", year: " + myYear + ", major: " + myMajor;
    }
}
