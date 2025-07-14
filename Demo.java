public class Demo {
    public static void main(String[] args) {

        // Meet Coach Bob
        Person bob = new Person("Coach Bob", 27, "M");
        System.out.println(bob);

        // Lynne’s got that GPA and student ID life — powered by caffeine and academic anxiety
        Student lynne = new Student("Lynne Brooke", 16, "F", "HS95129", 3.5);
        System.out.println(lynne);

        // Mr. Java — lives and breathes curly braces, dreams in binary
        Teacher mrJava = new Teacher("Duke Java", 34, "M", "Computer Science", 50000);
        System.out.println(mrJava);

        // Ima Frosh — one semester in and already questioning her life choices
        CollegeStudent ima = new CollegeStudent("Ima Frosh", 18, "F", "UCB123", 4.0, 1, "English");
        System.out.println(ima);
    }
}
