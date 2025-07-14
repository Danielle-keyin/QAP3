public class SchoolTest {
    public static void main(String[] args) {
        Person p = new Person("Alex", 30, "M");
        Student s = new Student("Jamie", 19, "F", "S123", 3.6);
        Teacher t = new Teacher("Dr. Smith", 45, "M", 75000.0, "Computer Science");
        CollegeStudent cs = new CollegeStudent("Taylor", 20, "F", "C456", 3.8, 2, "Electrical Engineering");

        System.out.println(p);
        System.out.println(s);
        System.out.println(t);
        System.out.println(cs);
    }
}
