import java.util.Calendar;

public class Person {

    /**
     * Variables
     */

    private String ID;
    private String firstName;
    private String lastName;
    private String title;
    private int yob;

    /**
     * Person Constructor
     */

    public Person(String ID, String firstName, String lastName, String title, int yob){
        this.ID = ID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.title = title;
        this.yob = yob;
    }

    /**
     * ID Getter method
     * @return ID
     */

    public String getID() {
        return ID;
    }

    /**
     * ID Setter method
     */

    public void setID(String ID) {
        this.ID = ID;
    }

    /**
     * FirstName Getter method
     * @return firstName
     */

    public String getFirstName() {
        return firstName;
    }

    /**
     * firstName Setter method
     */

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * lastName Getter method
     * @return lastName
     */

    public String getLastName() {
        return lastName;
    }

    /**
     * lastName Setter method
     */

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * title Getter method
     * @return title
     */

    public String getTitle() {
        return title;
    }

    /**
     * title Setter method
     */

    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * yob Getter method
     * @return yob
     */

    public int getYob() {
        return yob;
    }

    /**
     * yob Setter method
     */

    public void setYob(int yob) {
        this.yob = yob;
    }

    /**
     * Overridden toString() method for person object
     * @return new toString() method
     */

    @Override
    public String toString() {
        return "Person{" +
                "ID='" + ID + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", title='" + title + '\'' +
                ", yob=" + yob +
                '}';
    }

    /**
     * fullName() method to combine first and last name.
     * @return full name
     */

    public String fullName(){
        return this.firstName + " " + this.lastName;
    }

    /**
     * formalName() method to combine title, first and last name.
     * @return formal name
     */

    public String formalName(){
        return this.title + " " + fullName();
    }

    /**
     * getAge() method to calculate age from current year.
     * @return age
     */

    public int getAge(){
        int age = Calendar.getInstance().get(Calendar.YEAR) - this.yob;
        return age;
    }

    /**
     * getAgeFromYear() method to calculate age from year of choice.
     * @return age
     */

    public int getAgeFromYear(int year){
        int age = year - this.yob;
        return age;
    }

    /**
     * Takes ID, title, yob, and first and last name that converts the String to CSV Format.
     * @return CSV Formatted String
     */

    public String toCSV(){
        return this.ID + ", " + this.firstName + ", " + this.lastName + ", " + this.title + ", " + this.yob;
    }
}