public class Person {
    protected String myName;    // Their name 
    protected int myAge;        // How many birthday cakes they’ve survived
    protected String myGender;  // "M", "F", or however they roll

    // Constructor — builds a basic human (no assembly required)
    public Person(String name, int age, String gender) {
        myName = name;
        myAge = age;
        myGender = gender;
    }

    // Get their name 
    public String getName() {
        return myName;
    }

    // Get their age — for age-appropriate jokes 
    public int getAge() {
        return myAge;
    }

    // Get their gender — or at least how they identify here
    public String getGender() {
        return myGender;
    }

    // Set their name 
    public void setName(String name) {
        myName = name;
    }

    // Set their age 
    public void setAge(int age) {
        myAge = age;
    }

    // Set their gende r
    public void setGender(String gender) {
        myGender = gender;
    }

    // Return their info as a friendly string 
    public String toString() {
        return myName + ", age: " + myAge + ", gender: " + myGender;
    }
}
